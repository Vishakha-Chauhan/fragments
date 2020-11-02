package com.example.fragments.fraaa;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import com.example.fragments.R;
import com.squareup.picasso.Picasso;


public class picture extends Fragment {

    int x=0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_picture, container, false);
        Button button1= view.findViewById(R.id.previous);
        Button button2=view.findViewById(R.id.next);
        final ImageView imageView=view.findViewById(R.id.naruimages);
        final String [] arrayofimages={"https://i.pinimg.com/originals/d0/63/1e/d0631e3f92c15e0d514970f3a7ab3b38.jpg","https://i.pinimg.com/originals/a4/89/b8/a489b87aeed18a1dd8d742465aaf2326.jpg","https://assets3.thrillist.com/v1/image/2813538/1584x1054/crop;jpeg_quality=60.jpg","https://www.writeups.org/wp-content/uploads/Ichigo-Kurosaki-Bleach-Shonen-Jump-c.jpg"};

        Picasso.with(getActivity()).load(arrayofimages[0]).into(imageView);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x==0)
                {
                   x=arrayofimages.length-1;
                    Picasso.with(getActivity()).load(arrayofimages[x]).into(imageView);
                }
                else
                {
                    x=x-1;
                    Picasso.with(getActivity()).load(arrayofimages[x]).into(imageView);
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = x +1;
                if(x == arrayofimages.length)
                {

                    x=0;
                    Picasso.with(getActivity()).load(arrayofimages[x]).into(imageView);
                }
                else if(x <arrayofimages.length)
                {
                    Picasso.with(getActivity()).load(arrayofimages[x]).into(imageView);
                }
            }
        });


        return  view;
    }
}