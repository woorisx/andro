package com.example.chooseurpet;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        ImageButton lion, bear, pig, rabbit;
        TextView txtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lion = (ImageButton)findViewById(R.id.lion);
        bear = (ImageButton)findViewById(R.id.bear);
        pig = (ImageButton) findViewById(R.id.pig);
        rabbit = (ImageButton)findViewById(R.id.rabbit);

        txtv = (TextView) findViewById(R.id.txtv);

        lion.setOnClickListener(mClick);
        bear.setOnClickListener(mClick);
        pig.setOnClickListener(mClick);
        rabbit.setOnClickListener(mClick);
    }

    View.OnClickListener mClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v.getId() == R.id.lion){
                txtv.setText("나는 사자입니다~");
            }else if(v.getId() == R.id.bear){
                txtv.setText("나는 곰입니다~");
            }else if(v.getId() == R.id.rabbit){
                txtv.setText("나는 토끼입니다~");
            }else if
            (v.getId() == R.id.pig){
                txtv.setText("나는 돼지입니다~");
            }
        }
    };
}