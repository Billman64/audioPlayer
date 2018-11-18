package com.example.bill.musicplayer;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class VideogameTunes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_listing);

        Log.d("audioPlayer app --", "about to set color to action bar");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.vgTunes)));
        // actionBar code borrowed and changed from: https://stackoverflow.com/questions/3438276/how-to-change-the-text-on-the-action-bar/3438352#3438352

        // fill data
        ArrayList<AudioItem> audioItems = new ArrayList<AudioItem>();
        audioItems.add(new AudioItem("Land of Chipfusion", "Inverse Phase","https://inversephase.bandcamp.com/track/land-of-chipfusion"));
        audioItems.add(new AudioItem("What's on your Drive", "Inverse Phase","https://inversephase.bandcamp.com/track/whats-on-your-drive"));
        audioItems.add(new AudioItem("Take on XE","Inverse Phase","https://inversephase.bandcamp.com/track/take-on-xe"));
        audioItems.add(new AudioItem("(Just What I) 2A03'ded","Inverse Phase","https://inversephase.bandcamp.com/track/just-what-i-2a03ded"));
        audioItems.add(new AudioItem("The Annihilation of Monsteropolis\u200B/\u200BAirman","The Megas","https://themegas.bandcamp.com/track/the-annihilation-of-monsteropolis-airman-2"));
        audioItems.add(new AudioItem("Metal Dance\u200B/\u200BMetalman","The Megas","https://themegas.bandcamp.com/track/metal-dance-metalman-2"));
        audioItems.add(new AudioItem("Don't Mess with Magnetman","The Megas","https://themegas.bandcamp.com/track/dont-mess-with-magnetman"));

        // create adapter for listView
        ItemAdapter adapter = new ItemAdapter(this,audioItems);

        // capture listView
        ListView lv = (ListView) findViewById(R.id.list);

        // connect listView to the adapter
        Log.d("audioPlayer app --", "about to set adapter");
        lv.setAdapter(adapter);
    }

}
