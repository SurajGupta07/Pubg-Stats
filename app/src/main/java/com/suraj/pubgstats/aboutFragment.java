package com.suraj.pubgstats;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class aboutFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        return inflater.inflate(R.layout.about_fragment, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("About");


        TextView textView = view.findViewById(R.id.sometext);

        textView.setText(" PUBG STATS is a 2019 online multiplayer battle royale game statistics developed and published by CIA, a community of AIT.The app is based on previous mods that were created by Brendan CIA,and provides information abot weapons and maps in the game which is, inspired by the 2017 PUBG, and expanded into a standalone game under Greene creative direction.In the game, up to one hundred players parachute onto an island and scavenge for weapons and equipment to kill others while avoiding getting killed themselves.The available safe area of the games map decreases in size over time, directing surviving players into tighter areas to force encounters.The last player or team standing wins the round.\n" +
                "    Note  This app is not a game but provides some PUBG stats.\n" +
                "        WE ARE NOT AFFILIATED TO\n" +
                "        PLAYERUNKNOWN'S BATTLEGROUNDS COPYRIGHT ©2017 BLUEHOLE INC. ALL RIGHTS RESERVED.\n" +
                "        PLAYERUNKNOWN'S BATTLEGROUNDS is a registered trademark of Bluehole, Inc. and its affiliates._\n");
    }
}