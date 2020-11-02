package com.example.fragments;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import com.example.fragments.fraaa.colourfraa;
import com.example.fragments.fraaa.petFragment;
import com.example.fragments.fraaa.picture;
import com.example.fragments.fraaa.rotaion;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bnv;


        // show first fragment on opeing
        getSupportFragmentManager().beginTransaction().replace(R.id.framlay, new colourfraa()).commit();
         bnv=findViewById(R.id.bottomnavi);
         bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
             @Override
             public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                 Fragment temp =null;
                 switch(menuItem.getItemId())
                 {
                     case R.id.colours:
                         temp=new colourfraa();
                         break;
                     case R.id.vibr:
                         temp=new rotaion();
                         break;
                     case R.id.pic:
                      temp =new picture();
                        break;
                     case R.id.pets:
                         temp =new petFragment();
                         break;
                 }

                 getSupportFragmentManager().beginTransaction().replace(R.id.framlay,temp).commit();
                 return true;
             }
         });


    }
}