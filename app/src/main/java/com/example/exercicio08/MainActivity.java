package com.example.exercicio08;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MenuFragment.OnFragmentInteractionListener{

    public BoxFragment boxFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boxFragment = (BoxFragment) getSupportFragmentManager().findFragmentById(R.id.frag_result);
    }

    @Override
    public void onFragmentInteraction(String color) {
        boxFragment.changeColor(color);
    }
}