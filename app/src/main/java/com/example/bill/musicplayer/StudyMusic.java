package com.example.bill.musicplayer;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class StudyMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_listing);

        // match actionBar color
        Log.d("audioPlayer app --", "about to set color to action bar");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.studyMusic)));
        // actionBar code borrowed and changed from: https://stackoverflow.com/questions/3438276/how-to-change-the-text-on-the-action-bar/3438352#3438352

        // fill data
        ArrayList<AudioItem> audioItems = new ArrayList<AudioItem>();
        audioItems.add(new AudioItem("3 Hours of Studying Music - Concentration Music - Focus and Background","STUDY MUSIC", "https://www.youtube.com/watch?v=nb9x_8pgl4Q"));
        audioItems.add(new AudioItem("Reading Music to Concentrate | Study Music | Relaxing Music for Studying | Concentration Music Work", "Just Instrumental Music","https://www.youtube.com/watch?v=FCmN6KjS9lo"));

        // create adapter for listView
        ItemAdapter adapter = new ItemAdapter(this,audioItems);

        // capture listView
        ListView lv = (ListView) findViewById(R.id.list);

        // connect listView to the adapter
        Log.d("audioPlayer app --", "about to set adapter with count of: " + adapter.getCount());
        lv.setAdapter(adapter);
    }
}
