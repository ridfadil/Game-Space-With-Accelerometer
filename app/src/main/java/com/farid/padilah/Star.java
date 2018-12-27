package com.farid.padilah;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;

/**
 * Created on   : 8/12/2018
 * Developed by : Muhamad Farid Padilah
 * Github       : https://github.com/ridfadil
 */

public class Star {

    private Bitmap mBitmap;
    private int mX;
    private int mY;
    private int mMaxX;
    private int mSpeed;
    private int mScreenSizeX;
    private int mScreenSizeY;
    private int[] mStars = new int[]{R.drawable.moon, R.drawable.star_1, R.drawable.star_3};

    public Star(Context context, int screenSizeX, int screenSizeY, boolean randomY){
        mScreenSizeX = screenSizeX;
        mScreenSizeY = screenSizeY;

        Random random = new Random();
        mBitmap = BitmapFactory.decodeResource(context.getResources(), mStars[random.nextInt(3)]);
        float scale = (float)(random.nextInt(3) + 1)/5;
        mBitmap = Bitmap.createScaledBitmap(mBitmap, (int)(mBitmap.getWidth() * scale), (int)(mBitmap.getHeight() * scale), false);

        mMaxX = screenSizeX - mBitmap.getWidth();

        mSpeed = random.nextInt(1) + 1;

        mX = random.nextInt(mMaxX);
        if (randomY){
            mY = random.nextInt(mScreenSizeY);
        }else{
            mY = 0 - mBitmap.getHeight();
        }

    }

    public void update(){
        mY += 12 * mSpeed;
    }

    public Bitmap getBitmap() {
        return mBitmap;
    }

    public int getX() {
        return mX;
    }

    public int getY() {
        return mY;
    }
}