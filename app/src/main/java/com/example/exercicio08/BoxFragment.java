package com.example.exercicio08;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class BoxFragment extends Fragment {

    public View viewColor;

    public BoxFragment(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_box, container, false);
        viewColor = (View) view.findViewById(R.id.viewColor);
        return view;
    }

    public void changeColor(String color){
        if (color != null){
            if(color == "black"){
                viewColor.setBackgroundColor(getResources().getColor(R.color.black));
            }else if(color == "blue"){
                viewColor.setBackgroundColor(getResources().getColor(R.color.blue));
            }else if(color == "green"){
                viewColor.setBackgroundColor(getResources().getColor(R.color.green));
            }else if(color == "red"){
                viewColor.setBackgroundColor(getResources().getColor(R.color.red));
            }else if(color == "yellow"){
                viewColor.setBackgroundColor(getResources().getColor(R.color.yellow));
            }else{
                viewColor.setBackgroundColor(Color.GRAY);
            }
        }
    }
}