package com.example.android.quakereport;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MoreAdapter extends ArrayAdapter<ModelMore> {
    ArrayList<ModelMore> MoreList = new ArrayList<>();
    public MoreAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ModelMore> objects) {
        super(context, resource, objects);
        MoreList = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.more_layout, null);
        TextView textView1 = (TextView) v.findViewById(R.id.morecard);

        textView1.setText(MoreList.get(position).getDesc());

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setDataAndType(Uri.parse( "http://docs.google.com/viewer?url=" + Uri.parse(MoreList.get(position).getUrl())), "text/html");
                getContext().startActivity(browserIntent);

//                Uri u = Uri.parse("tel:" + textView2.getText().toString());
//
//                // Create the intent and set the data for the
//                // intent as the phone number.
//                Intent i = new Intent(Intent.ACTION_DIAL, u);
//                getContext().startActivity(i);
            }
        });
        return v;
    }
}
