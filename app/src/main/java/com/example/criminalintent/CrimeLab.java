package com.example.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {
    private static CrimeLab mCrimeLab ;

    public List<Crime> getCrimeList() {
        return mCrimeList;
    }

    private List<Crime> mCrimeList;

    public static CrimeLab getCrimeLab(Context context) {
        if(mCrimeLab == null){
            mCrimeLab = new CrimeLab(context);
        }
        return mCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimeList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Crime c = new Crime();
            c.setTitle("Crime #" + i);
            c.setSolved(i%2 == 0);
            mCrimeList.add(c);
        }
    }

    public Crime getCrime(UUID id){
        for (Crime c : mCrimeList){
            if(c.getId()== id){
                return c;
            }
        }
        return null;
    }

}
