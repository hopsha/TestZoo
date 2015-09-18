package com.by.siarheihopsha.testzoo.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.by.siarheihopsha.testzoo.R;
import com.by.siarheihopsha.testzoo.constants.Constants;

public class AnimalFragment extends Fragment {

    public AnimalFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_animal, container, false);
        String speech = getArguments().getString(Constants.BUNDLE_SPEECH);
        TextView textSpeech = (TextView) rootView.findViewById(R.id.text_speech);
        textSpeech.setText(speech);
        return rootView;
    }
}
