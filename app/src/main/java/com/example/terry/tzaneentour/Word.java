package com.example.terry.tzaneentour;

import java.io.Serializable;

/**
 * Created by TERRY on 2017/08/17.
 */

public class Word implements Serializable {

    private String mtopic;

    private int mImage=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    private int mAudioResourceId;
    private String mdescription;


    public Word(int mAudioResourceId) {
        this.mAudioResourceId = mAudioResourceId;
    }

    public Word(String mtopic, String mdescription, int mImage) {
        this.mtopic = mtopic;
        this.mImage = mImage;
        this.mdescription = mdescription;
    }

    public Word(String mtopic, int mImage) {
        this.mtopic = mtopic;
        this.mImage = mImage;

    }

    public String getMtopic() {
        return mtopic;
    }



    public int getmImage() {
        return mImage;
    }

    public static int getNoImageProvided() {
        return NO_IMAGE_PROVIDED;
    }


    public boolean HasImage() {
        return mImage != NO_IMAGE_PROVIDED;
    }

    public int getmAudioResourceId() {

        return mAudioResourceId;
    }

    public String getMdescription() {
        return mdescription;
    }
}


