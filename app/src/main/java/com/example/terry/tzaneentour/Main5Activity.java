package com.example.terry.tzaneentour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

import static android.R.attr.id;
import static com.example.terry.tzaneentour.R.id.edtname;

public class Main5Activity extends AppCompatActivity {
    EditText name, place, id;
    TextView time, date;
    private cusDatabase sd;
    customer customer;
    private TextView tvDisplayTime, tvDisplayDate;
    private TimePicker timePicker1;
    private DatePicker datePicker;
    public static int hour;
    public static int minute;
    public static int day;
    public static int month;
    public static int year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        setCurrentTimeOnView();
        setCurrentDateonView();
        sd = new cusDatabase(this);

        name = (EditText) findViewById(edtname);
        place = (EditText) findViewById(R.id.edtplace);
        id = (EditText) findViewById(R.id.edtid);


    }

    public void done(View view) {
        int i = 0;

        String places = place.getText().toString();
        String names = name.getText().toString();
        String time = tvDisplayTime.getText().toString();
        String date = tvDisplayDate.getText().toString();

        customer customer1 = new customer(i++, names, places, time, date);

        sd.addcustomer(customer1);

        tvDisplayDate.setText("" + date);
        tvDisplayTime.setText("" + time);


        Intent intent = new Intent(this, com.example.terry.tzaneentour.Display.class);
        startActivity(intent);

        Toast.makeText(Main5Activity.this, "Successfully Booked", Toast.LENGTH_SHORT).show();
    }


    public void price(View view) {
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }

    public void delete(View view) {
        String names = name.getText().toString();
        sd.deletebookings(names);

        Intent intent = new Intent(this, com.example.terry.tzaneentour.Display.class);
        startActivity(intent);

        Toast.makeText(Main5Activity.this, "Successfully Deleted", Toast.LENGTH_SHORT).show();
    }

    // display current time
    public void setCurrentTimeOnView() {

        tvDisplayTime = (TextView) findViewById(R.id.tvtime);
        timePicker1 = (TimePicker) findViewById(R.id.timePicker2);

        final Calendar c = Calendar.getInstance();
        hour = c.get(Calendar.HOUR_OF_DAY);
        minute = c.get(Calendar.MINUTE);

        // set current time into textview
        tvDisplayTime.setText(
                new StringBuilder().append(pad(hour))
                        .append(":").append(pad(minute)));

        // set current time into timepicker
        timePicker1.setCurrentHour(hour);
        timePicker1.setCurrentMinute(minute);

    }

    private static String pad(int c) {
        if (c >= 10)
            return String.valueOf(c);
        else
            return "0" + String.valueOf(c);
    }

    public void setCurrentDateonView() {
        tvDisplayDate = (TextView) findViewById(R.id.tvdate);
        datePicker = (DatePicker) findViewById(R.id.datePicker2);


        final Calendar c = Calendar.getInstance();
        day = c.get(Calendar.DAY_OF_MONTH);
        month = c.get(Calendar.MONTH);
        year = c.get(Calendar.YEAR);

        //set current date into textview
        tvDisplayDate.setText(new StringBuilder()
                .append(pad(day)).append("/").append(pad(month)).append("/").append(pad(year)));

        //set current time into datepicker
        datePicker.setMinDate(day);
        datePicker.setMinDate(month);
        datePicker.setMinDate(year);

    }

    public void search(View view) {
        customer customer1 = sd.search(name.getText().toString());
        if (customer1 != null) {
            id.setText(String.valueOf(customer1.getId()));
            name.setText(String.valueOf(customer1.getName()));
            place.setText(String.valueOf(customer1.getPlace()));


        } else {
            id.setText("No match found");
        }


    }
}





