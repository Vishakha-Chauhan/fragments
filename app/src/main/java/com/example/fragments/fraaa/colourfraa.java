package com.example.fragments.fraaa;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.fragments.R;

public class colourfraa extends Fragment {

    public colourfraa() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_colourfraa, container, false);
        final Button redbutton = view.findViewById(R.id.red1);
        final Button bluebutton= view.findViewById(R.id.blue1);
        final Button yellowbutton= view.findViewById(R.id.yellow1);
        final Button greenbutton= view.findViewById(R.id.green1);
        final Button pinkbutton= view.findViewById(R.id.pink1);
        final boolean[] redc= {false};
        final boolean[] bluec= {false};
        final boolean[] yellowc= {false};
        final boolean[] greenc= {false};
        final boolean[] pinkc= {false};
        redbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(redc[0] ==false)
                {
                    redbutton.setBackgroundColor(Color.RED);
                    redc[0] =true;
                }
                else if(redc[0] ==true)
                {
                    redbutton.setBackgroundColor(Color.GRAY);
                    redc[0]=false;
                }
            }
        });
        bluebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(bluec[0] ==false)
                {
                    bluebutton.setBackgroundColor(Color.BLUE);
                    bluec[0] =true;
                }
                else if(bluec[0] ==true)
                {
                    bluebutton.setBackgroundColor(Color.GRAY);
                    bluec[0]=false;
                }
            }
        });
        yellowbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(yellowc[0] ==false)
                {
                    yellowbutton.setBackgroundColor(Color.YELLOW);
                    yellowc[0] =true;
                }
                else if(yellowc[0] ==true)
                {
                    yellowbutton.setBackgroundColor(Color.GRAY);
                    yellowc[0]=false;
                }
            }
        });
        greenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(greenc[0] ==false)
                {
                    greenbutton.setBackgroundColor(Color.GREEN);
                    greenc[0] =true;
                }
                else if(greenc[0] ==true)
                {
                    greenbutton.setBackgroundColor(Color.GRAY);
                    greenc[0]=false;
                }
            }
        });
        pinkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(pinkc[0] ==false)
                {
                    int pink=getResources().getColor(R.color.pink);
                    pinkbutton.setBackgroundColor(pink);
                    pinkc[0] =true;
                }
                else if(pinkc[0] ==true)
                {
                    pinkbutton.setBackgroundColor(Color.GRAY);
                    pinkc[0]=false;
                }
            }
        });

        return view;

    }
}