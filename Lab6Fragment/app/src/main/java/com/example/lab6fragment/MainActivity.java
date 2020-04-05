package com.example.lab6fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements OnColorButtonListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Color 1:Red, 2:Yellow, 3:Green
    @Override
    public void onColorClick(int color) {
        Fragment fragment=new Fragment();
        switch (color){
            case 0:
                fragment=new RedFragment();
                break;
            case 1:
                fragment=new YellowFragment();
                break;
            case 2:
                fragment=new GreenFragment();
                break;
        }
        getSupportFragmentManager().beginTransaction().add(R.id.fr_right, fragment).commit();
    }
}
