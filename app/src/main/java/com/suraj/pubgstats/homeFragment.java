package com.suraj.pubgstats;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class homeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        return inflater.inflate(R.layout.home_fragment, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Home");



        CardView ecard1,ecard2,ecard3,ecard4;




        ecard1 = view.findViewById(R.id.erangelid);
        ecard2 = view.findViewById(R.id.miramarid);
        ecard3 = view.findViewById(R.id.sanhokid);
        ecard4 = view.findViewById(R.id.vikendiid);




        ecard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(), erangel.class);
                startActivity(i);
            }
        });
        ecard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(), miramar.class);
                startActivity(i);
            }
        });
        ecard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(), sanhok.class);
                startActivity(i);
            }
        });
        ecard4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(), vikendi.class);
                startActivity(i);
            }
        });



    }
}