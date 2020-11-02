package com.example.fragments.fraaa;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.fragments.R;
import com.google.android.material.snackbar.Snackbar;

import java.util.Calendar;

public class petFragment extends Fragment {
    int year;
    int month;
    int day;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_pet, container, false);
        final Button Date_picker_button=view.findViewById(R.id.datapicker);
        Button Toast_button=view.findViewById(R.id.toast);
        Button Alert_button=view.findViewById(R.id.alert);
        Button Snackbar_button=view.findViewById(R.id.snackbar);
        Button Progress_button=view.findViewById(R.id.progress);
        final Calendar calendar=Calendar.getInstance();
         final com.wang.avi.AVLoadingIndicatorView avi=view.findViewById(R.id.avi);

        //1
        Date_picker_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                year=calendar.get(Calendar.YEAR);
                month=calendar.get(Calendar.MONTH);
                day=calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog =new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        String date= dayOfMonth + "/" + (month+1) +"/"+ year;
                        Date_picker_button.setText(date);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });

        //2
        Toast_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Hello i'm Toast message",Toast.LENGTH_SHORT).show();
            }
        });
     // 3
       Alert_button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               AlertDialog.Builder b1= new AlertDialog.Builder(getActivity());
               b1.setMessage("This is a ALERT MESSAGE");
               b1.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {
                       dialog.cancel();
                   }
               });
               b1.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {
                       dialog.cancel();
                   }
               });
               AlertDialog l =b1.create();
               l.show();
           }
       });
      // 4
        final LinearLayout linearLayout=view.findViewById(R.id.Linearlayoutofpet);
        Snackbar_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(linearLayout,"Hello Im SNACKBAR",Snackbar.LENGTH_LONG).show();
            }
        });


        Progress_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int Time=5000;
                avi.show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        avi.hide();
                    }
                },Time);

            }
        });

        return  view;
    }
}