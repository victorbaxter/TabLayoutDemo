package com.example.kiz.tablayoutdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DemoObject1Fragment extends Fragment {

    public DemoObject1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_demo_object1, container, false);
        TextView textView = rootView.findViewById(R.id.text_content1);
        textView.setText("Fragment 1");
        return rootView;
    }

}
