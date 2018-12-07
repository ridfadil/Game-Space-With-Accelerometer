package com.andevindo.spaceshooter;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created on   : 8/12/2018
 * Developed by : Muhamad Farid Padilah
 * Github       : https://github.com/ridfadil
 */

public class SharedPreferencesManager {

    private String mName = "SpaceShooter";
    private Context mContext;

    public SharedPreferencesManager(Context context) {
        mContext = context;
    }

    public void saveHighScore(int score){
        SharedPreferences sp = mContext.getSharedPreferences(mName, Context.MODE_PRIVATE);
        SharedPreferences.Editor e = sp.edit();
        e.putInt("high_score", score);
        e.commit();
    }

    public int getHighScore(){
        SharedPreferences sp = mContext.getSharedPreferences(mName, Context.MODE_PRIVATE);
        return sp.getInt("high_score", 0);
    }
}
