package com.example.bill.musicplayer;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class Tech extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_help);

        Log.d("audioPlayer app --", "about to set color to action bar");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.tech)));
        // actionBar code borrowed and changed from: https://stackoverflow.com/questions/3438276/how-to-change-the-text-on-the-action-bar/3438352#3438352

        // fill data
        ArrayList<AudioItem> audioItems = new ArrayList<AudioItem>();
        audioItems.add(new AudioItem("Technically Speaking - Ep. 49","Technically Speaking", "https://archive.org/details/technically_speaking_49"));
        audioItems.add(new AudioItem("#SGGQA 068: Monday Morning - OnePlus 6T Launch, Right To Repair Wins, Samsung Fined for Battery Throttling", "Juan Carlos Bagnell","https://archive.org/details/SGGQA068MondayMorningOnePlus6TLaunchRightToRepairWinsSamsungFinedForBatteryThrottling"));
        audioItems.add(new AudioItem("Two Tech Dudes - Ep 9 - Back to Code School, Featuring a Guest Named Phil", "Two Tech Dudes", "https://archive.org/details/TwoTechDudesEp9"));


        // create adapter for listView
        ItemAdapter adapter = new ItemAdapter(this,audioItems);

        // capture listView
        ListView lv = (ListView) findViewById(R.id.list);

        // connect listView to the adapter
        Log.d("audioPlayer app --", "about to set adapter");
        lv.setAdapter(adapter);
    }
}
