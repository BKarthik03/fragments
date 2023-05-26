package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void inbo(View view) {
        FragmentManager fr= getSupportFragmentManager();
        fr.beginTransaction().replace(R.id.frag,spam.class,null).setReorderingAllowed(true).addToBackStack(null).commit();
    }

    public void star(View view) {
        FragmentManager fr= getSupportFragmentManager();
        fr.beginTransaction().replace(R.id.frag,spam.class,null).setReorderingAllowed(true).addToBackStack(null).commit();
    }

    public void spamm(View view) {
        FragmentManager fr= getSupportFragmentManager();
        fr.beginTransaction().replace(R.id.frag,spam.class,null).setReorderingAllowed(true).addToBackStack(null).commit();
    }
}