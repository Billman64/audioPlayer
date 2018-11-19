package com.example.bill.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

// Audio Player app demo by Bill Lugo for Udacity.
// Content that is linked is property of their respective owners, along with names and authors of referenced creative works.

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // clickable textView to Self Help activity
        TextView tvSelfHelp = (TextView) findViewById(R.id.selfHelp);
        tvSelfHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,SelfHelp.class);
                startActivity(i);
            }
        });

        // clickable textView to Study Music activity
        TextView tvStudyMusic = (TextView) findViewById(R.id.studyMusic);
        tvStudyMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,StudyMusic.class);
                startActivity(i);
            }
        });

        // clickable textView to Tech activity
        TextView tvTech = (TextView) findViewById(R.id.tech);
        tvTech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Tech.class);
                startActivity(i);
            }
        });

        // clickable textView to Film Soundtrack activity
        TextView tvFilmSoundtrack = (TextView) findViewById(R.id.filmSoundtrack);
        tvFilmSoundtrack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,FilmSoundtrack.class);
                startActivity(i);
            }
        });

        // clickable textView to Videogame Tunes activity
        TextView tvVideogameTunes = (TextView) findViewById(R.id.videogameTunes);
        tvVideogameTunes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,VideogameTunes.class);
                startActivity(i);
            }
        });

    }
}
