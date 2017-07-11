package com.example.android.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by fatimazza on 7/11/17.
 */

public class MyParcelableObject implements Parcelable {

    private String name;
    private int age;

    //parcellable implementation
    protected MyParcelableObject(Parcel in) {
        name = in.readString();
        age = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        //write value (name, age)
        //save it to parcel (dest)
        dest.writeString(name);
        dest.writeInt(age);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    //parcellable implementation
    public static final Creator<MyParcelableObject> CREATOR = new Creator<MyParcelableObject>() {
        @Override
        public MyParcelableObject createFromParcel(Parcel in) {
            return new MyParcelableObject(in);
        }

        @Override
        public MyParcelableObject[] newArray(int size) {
            return new MyParcelableObject[size];
        }
    };
}
