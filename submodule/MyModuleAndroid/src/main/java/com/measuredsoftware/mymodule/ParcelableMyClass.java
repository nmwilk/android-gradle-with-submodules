package com.measuredsoftware.mymodule;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * To prove dependency on {@link MyClass} from other module.
 */
public class ParcelableMyClass extends MyClass implements Parcelable
{
    public ParcelableMyClass(final int i)
    {
        super(i);
    }

    @Override
    public int describeContents()
    {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeInt(getI());
    }

    protected ParcelableMyClass(Parcel in)
    {
        super(in.readInt());
    }

    public static final Creator<ParcelableMyClass> CREATOR = new Creator<ParcelableMyClass>()
    {
        public ParcelableMyClass createFromParcel(Parcel source)
        {
            return new ParcelableMyClass(source);
        }

        public ParcelableMyClass[] newArray(int size)
        {
            return new ParcelableMyClass[size];
        }
    };
}
