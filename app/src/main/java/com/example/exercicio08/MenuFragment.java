package com.example.exercicio08;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class MenuFragment extends Fragment implements View.OnClickListener{

    public OnFragmentInteractionListener listener;

    public MenuFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        Button btnBlack = (Button) view.findViewById(R.id.btnBlack);
        Button btnBlue = (Button) view.findViewById(R.id.btnBlue);
        Button btnGreen = (Button) view.findViewById(R.id.btnGreen);
        Button btnRed = (Button) view.findViewById(R.id.btnRed);
        Button btnYellow = (Button) view.findViewById(R.id.btnYellow);

        btnBlack.setOnClickListener(this);
        btnBlue.setOnClickListener(this);
        btnGreen.setOnClickListener(this);
        btnRed.setOnClickListener(this);
        btnYellow.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if (listener != null) {
            int btn_id = v.getId();
            if(btn_id == R.id.btnBlack){
                listener.onFragmentInteraction("black");
            }else if(btn_id == R.id.btnBlue){
                listener.onFragmentInteraction("blue");
            }else if(btn_id == R.id.btnGreen){
                listener.onFragmentInteraction("green");
            }else if(btn_id == R.id.btnRed){
                listener.onFragmentInteraction("red");
            }else if(btn_id == R.id.btnYellow){
                listener.onFragmentInteraction("yellow");
            }else{
                listener.onFragmentInteraction("undefined");
            }
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            listener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(String text);
    }
}
