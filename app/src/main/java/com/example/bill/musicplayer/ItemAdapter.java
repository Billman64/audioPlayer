package com.example.bill.musicplayer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<AudioItem> {
    public ItemAdapter(Context context, ArrayList<AudioItem> audioItem) {
        super(context, 0, audioItem);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        // manually inflate scrap item
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // set up individual list item
        final AudioItem currentItem = getItem(position);

        TextView tvTitle = (TextView) listItemView.findViewById(R.id.title);
        tvTitle.setText(currentItem.getTitle());

        TextView tvCreator = (TextView) listItemView.findViewById(R.id.creator);
        tvCreator.setText(currentItem.getCreator());

        TextView tvLink = (TextView) listItemView.findViewById(R.id.link);
        tvLink.setText(currentItem.getLink());

        //TODO: make link clickable (implicit intent to browser)
        tvLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(currentItem.getLink()) );
//                startActivity(i); // doesn't work for some reason
            }
        });

        // return listItemView that conforms to inherited class
        return listItemView;
    }
}
