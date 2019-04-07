package com.example.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID mId;

    public UUID getId() {
        return mId;
    }

    private Date mDate;
    public Date getDate() {
        return mDate;
    }
    public void setDate(Date date) {
        mDate = date;
    }


    private String mTitle;
    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    private boolean mSolved;
    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }
}
