package com.by.siarheihopsha.testzoo.ui.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.by.siarheihopsha.testzoo.R;
import com.by.siarheihopsha.testzoo.adapter.AnimalAdapter;
import com.by.siarheihopsha.testzoo.constants.Constants;
import com.by.siarheihopsha.testzoo.entity.animals.Animal;
import com.by.siarheihopsha.testzoo.ui.activity.ControllerActivity;
import com.by.siarheihopsha.testzoo.ui.activity.MainActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class ZooFragment extends ListFragment {

    private ControllerActivity controller;
    private ArrayList<Animal> animals;

    public ZooFragment() {

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.controller = (ControllerActivity) activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_zoo, container, false);
        this.animals = getArguments().getParcelableArrayList(Constants.BUNDLE_ANIMALS);
        AnimalAdapter adapter = new AnimalAdapter(getActivity().getApplicationContext(), 0, animals);
        setListAdapter(adapter);
        return rootView;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        controller.showAnimalSpeech(animals.get(position).introduce());
    }
}
