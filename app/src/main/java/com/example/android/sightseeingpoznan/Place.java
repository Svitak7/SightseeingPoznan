package com.example.android.sightseeingpoznan;

/**
 * Created by Adam on 30.05.2017.
 */

public class Place {

    private String  mName;
    private String  mAddress;
    private int     mImageResourceId;

    public Place(String mName, String mAddress, int mImageResourceId)
    {
        this.mAddress = mAddress;
        this.mImageResourceId = mImageResourceId;
        this.mName = mName;
    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    @Override
    public String toString() {
        return "Place{" +
                "mAddress= "+ mAddress + '\'' +
                ", mName=" + mName + '\'' +
                ", mImageResourceId=" + mImageResourceId;
    }
}
