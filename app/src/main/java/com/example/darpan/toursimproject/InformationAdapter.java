package com.example.darpan.toursimproject;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
public class InformationAdapter extends ArrayAdapter<Information> {
    public InformationAdapter(Activity context, ArrayList<Information> numbers) {

        super(context, 0, numbers);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Information currentTouristProject = getItem(position);
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        }
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentTouristProject.getName());
        TextView timingsTextView = (TextView) listItemView.findViewById(R.id.timings);
        timingsTextView.setText(currentTouristProject.getTiming());
        TextView  addresTextView=(TextView) listItemView.findViewById(R.id.addres);
        addresTextView.setText(currentTouristProject.getAddress());
        TextView ratingsTextView = (TextView) listItemView.findViewById(R.id.ratings);
        ratingsTextView.setText(currentTouristProject.getRatings());
        TextView specialTextView = (TextView) listItemView.findViewById(R.id.special);
        specialTextView.setText(currentTouristProject.getSpecial());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if(currentTouristProject.getImage()!=0) {
            imageView.setImageResource(currentTouristProject.getImage());
        }
        if(currentTouristProject.getImage()==0)
        {
            imageView.setVisibility(8);
        }
        return listItemView;
    }
}
