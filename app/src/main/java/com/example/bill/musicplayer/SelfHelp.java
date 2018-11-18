package com.example.bill.musicplayer;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class SelfHelp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_help);

`
        // fill data
        ArrayList<AudioItem> audioItems = new ArrayList<AudioItem>();
        audioItems.add(new AudioItem("The Science of Getting Rich","Wallace D. Wattles", "https://archive.org/details/science_gettingrich_1005_librivox"));
        audioItems.add(new AudioItem("Your Mind and How to Use It", "William Walker Atkinson","https://archive.org/details/yourmind_1402_librivox"));

        // create adapter for listView
        ItemAdapter adapter = new ItemAdapter(this,audioItems);

        // capture listView
        ListView lv = (ListView) findViewById(R.id.list);

        // connect listView to the adapter
        Log.d("audioPlayer app --", "about to set adapter");
        lv.setAdapter(adapter);
    }
}
