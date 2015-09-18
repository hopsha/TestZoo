package com.by.siarheihopsha.testzoo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.by.siarheihopsha.testzoo.R;
import com.by.siarheihopsha.testzoo.entity.animals.Animal;

import java.util.List;

/**
 * Created by Siarhei Hopsha on 18.09.2015.
 */
public class AnimalAdapter extends ArrayAdapter<Animal> {

    private Context context;
    private List<Animal> animals;

    public AnimalAdapter(Context context, int resource, List<Animal> objects) {
        super(context, resource, objects);
        this.context = context;
        this.animals = objects;
    }

    static class ViewHolder {
        public TextView textName;
        public TextView textSpecies;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        View rowView = convertView;
        if (rowView == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.animal_item, null, true);
            holder = new ViewHolder();
            holder.textName = (TextView) rowView.findViewById(R.id.textName);
            holder.textSpecies = (TextView) rowView.findViewById(R.id.textSpecies);
            rowView.setTag(holder);
        } else {
            holder = (ViewHolder) rowView.getTag();
        }

        Animal animal = animals.get(position);
        holder.textName.setText(animal.getName());
        holder.textSpecies.setText(animal.getSpecies());

        return rowView;
    }

}
