package com.example.test03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class C_activity extends AppCompatActivity {
    Button c_close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cactivity);

        c_close = (Button)findViewById(R.id.c_close);

        c_close.setOnClickListener(mClick);
    }

    View.OnClickListener mClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           if(v.getId()==R.id.c_close) {
               finish();
           }
        }
    };
}