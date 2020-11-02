package com.example.fragments.fraaa;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import android.widget.Button;

import com.example.fragments.R;


public class rotaion extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_rotaion, container, false);
        Button button=view.findViewById(R.id.hello);
        Button button2=view.findViewById(R.id.Vibrate);
        final Vibrator vii= (Vibrator) getActivity().getSystemService(Context.VIBRATOR_SERVICE);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vii.vibrate(400);
            }
        });


//        button.animate().setDuration(3000);
//        button.animate().rotation(360f);
//        button.animate().alpha(.0f);
//

        Animation rotate= AnimationUtils.loadAnimation(getContext(),R.anim.rotate);
        button.startAnimation(rotate);


        return  view;
    }
}