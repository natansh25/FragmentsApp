package com.example.natan.fragmentsapp;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







    }

    public void Add(View view) {

        BlankFragment fragment= new BlankFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frago,fragment)
                .commit();
    }

    public void removefragment(View view) {

        android.support.v4.app.Fragment fragment=getSupportFragmentManager().findFragmentById(R.id.frago);

if(fragment !=null)
{
    getSupportFragmentManager()
            .beginTransaction()
            .remove(fragment)
            .commit();
}




    }
}
