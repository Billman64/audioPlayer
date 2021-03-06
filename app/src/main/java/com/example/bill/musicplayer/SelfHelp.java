package com.example.bill.musicplayer;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SelfHelp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_listing);

        // up navigation
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);  // getActionBar() doesn't work likely b/c of AppCompatActivity

//        onOptionsItemSelected()

        // implement back button
//        Button button = (Button) findViewById(R.id.backButton);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(SelfHelp.this, MainActivity.class);
//                startActivity(i);
//            }
//        });

        // match actionBar color
        Log.d("audioPlayer app --", "about to set color to action bar");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.selfHelp)));
        // actionBar code borrowed and changed from: https://stackoverflow.com/questions/3438276/how-to-change-the-text-on-the-action-bar/3438352#3438352

        // fill data
        ArrayList<AudioItem> audioItems = new ArrayList<AudioItem>();
        audioItems.add(new AudioItem("The Science of Getting Rich","Wallace D. Wattles", "https://archive.org/details/science_gettingrich_1005_librivox"));
        audioItems.add(new AudioItem("Your Mind and How to Use It", "William Walker Atkinson","https://archive.org/details/yourmind_1402_librivox"));

        // create adapter for listView
        ItemAdapter adapter = new ItemAdapter(this,audioItems);

        // capture listView
        ListView lv = (ListView) findViewById(R.id.list);

        // connect listView to the adapter
        Log.d("audioPlayer app --", "about to set adapter with count of: " + adapter.getCount());
        lv.setAdapter(adapter);
    }
}
