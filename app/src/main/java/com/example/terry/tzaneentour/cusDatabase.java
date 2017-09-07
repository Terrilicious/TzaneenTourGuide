package com.example.terry.tzaneentour;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

import static com.example.terry.tzaneentour.customer.setId;
import static com.example.terry.tzaneentour.customer.setName;

/**
 * Created by TERRY on 2017/08/17.
 */

public class cusDatabase extends SQLiteOpenHelper {

    private static final String TABLE_CUSTOMER = "customer";
    private final String COLUMN_ID = "_id";
    private final String COLUMN_PLACE = "place";
    private final String COLUMN_NAME = "name";
    private final String COLUMN_DATE="date";
    private final String COLUMN_TIME="time";
    private final static String DATABASE_NAME = "customer.db";
    private final static int DATABASE_VERSION = 4;
    private final String DATABASE_CREATE = "create table " + TABLE_CUSTOMER + "(" + COLUMN_ID + " integer primary key autoincrement, " +
            COLUMN_PLACE + " text not null," + COLUMN_NAME + " text not null," + COLUMN_DATE + " text not null," + COLUMN_TIME + " text not null);";
    customer customers = new customer();

    public cusDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CUSTOMER);
        onCreate(db);
    }

    public void addcustomer(customer customers) {
        SQLiteDatabase sd = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();

        contentValues.put(COLUMN_NAME, customers.getName());
        contentValues.put(COLUMN_PLACE, customers.getPlace());
        contentValues.put(COLUMN_DATE,customers.getDate());
        contentValues.put(COLUMN_TIME,customers.getTime());
        sd.insert(TABLE_CUSTOMER,null,contentValues);

    }

    public ArrayList<String> getAllCustomers() {
        ArrayList<String> custo = new ArrayList<>();
        //SELECT ALL Query
        String selectQuery = "SELECT * FROM " + TABLE_CUSTOMER;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {
                //
                int id = cursor.getInt(0);
                String sdtName = cursor.getString(1);
                String sdtplace = cursor.getString(2);
                String sdttime=cursor.getString(3);
                String sdtdate=cursor.getString(4);
                String display = id  + " "+ ""  + sdtdate + " "  + " " + sdttime + " " + " " + sdtName + " "  + " " + sdtplace;
                custo.add(display);
            }
            while (cursor.moveToNext());
        }
        return custo;
    }

    public int deletebookings(String x) {
        SQLiteDatabase db = this.getWritableDatabase();
        String[] whereArgs = {x};
        int count = db.delete(this.TABLE_CUSTOMER, this.COLUMN_NAME + "=?", whereArgs);
        return count;
    }

    public customer search(String name) {
        String query = " Select * from " + TABLE_CUSTOMER+ " WHERE " + COLUMN_NAME + " = \"" + name + "\"";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        customer customer1 = new customer();

        if (cursor.moveToFirst()) {
            cursor.moveToFirst();
            customer1.setId(Integer.parseInt(cursor.getString(0)));
            customer1.setName(cursor.getString(1));
            customer1.setPlace(cursor.getString(2));

            cursor.close();
        } else {
            customer1 = null;

            db.close();
        }
        return customer1;
    }
}
