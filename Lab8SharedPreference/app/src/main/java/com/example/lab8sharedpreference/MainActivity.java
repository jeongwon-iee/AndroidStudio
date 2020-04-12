package com.example.lab8sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // default=-1 -> first user
    // user=1
    public static final String SHARED_PREF_FIRST_USER_KEY="1000";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Hello=(TextView) findViewById(R.id.hello);

        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        int firstUser=sharedPref.getInt(SHARED_PREF_FIRST_USER_KEY, -1);

        if(firstUser==1) { //기존 유저
            Hello.setText(getString(R.string.hello_user));
        }
        else if(firstUser==-1) { //최초 실행 유저
            Hello.setText(getString(R.string.hello_First));

            saveUserIsNotFirst();
        }
    }

    private void saveUserIsNotFirst() {
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPref.edit();
        editor.putInt(SHARED_PREF_FIRST_USER_KEY, 1);
        editor.commit();
    }
}
