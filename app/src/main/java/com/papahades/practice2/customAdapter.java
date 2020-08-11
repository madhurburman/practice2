package com.papahades.practice2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class customAdapter extends ArrayAdapter{
    public customAdapter(@NonNull Context context, String[] users ) {
        super(context,R.layout.custom_list_view,users);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

     // getting layout reference

        LayoutInflater inflater =LayoutInflater.from(getContext());
        View newView=inflater.inflate(R.layout.custom_list_view,parent,false);


        // gettig references
        String singleItem= (String) getItem(position);    // geting item on position
        TextView mtext= newView.findViewById(R.id.gyo);
        ImageView mImage=newView.findViewById(R.id.myo);

        //setting text and image
        mtext.setText(singleItem);
        mImage.setImageResource(R.drawable.capp);

        return newView;
    }
}
