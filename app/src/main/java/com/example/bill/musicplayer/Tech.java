package com.example.bill.musicplayer;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Tech extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech);

        Log.d("audioPlayer app --", "about to set color to action bar");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.tech)));
        // actionBar code borrowed and changed from: https://stackoverflow.com/questions/3438276/how-to-change-the-text-on-the-action-bar/3438352#3438352

    }
}
