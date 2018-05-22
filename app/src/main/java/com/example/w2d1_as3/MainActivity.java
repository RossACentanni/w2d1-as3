package com.example.w2d1_as3;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int ori = getResources().getConfiguration().orientation;

        switch (ori){
            case Configuration.ORIENTATION_PORTRAIT:
                Toast.makeText(this, "VERTICAL", Toast.LENGTH_SHORT).show();
                break;

            case Configuration.ORIENTATION_LANDSCAPE:
                Toast.makeText(this, "HORIZONTAL", Toast.LENGTH_SHORT).show();
                break;

            case Configuration.ORIENTATION_UNDEFINED:
                Toast.makeText(this, "UH OH", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
