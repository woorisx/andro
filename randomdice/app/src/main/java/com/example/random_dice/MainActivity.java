package com.example.random_dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton imga, imgb;
    Random rnd = new Random();
    int cnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cnt = 0;

        imga = (ImageButton) findViewById(R.id.imga);
        imgb = (ImageButton) findViewById(R.id.imgb);

        imga.setOnClickListener(mClick);
        imgb.setOnClickListener(mClick);
    }

    View.OnClickListener mClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v.getId()==R.id.imga){
                cnt++;
                if(cnt % 2 == 0) imga.setImageResource(R.drawable.img_o);
                else imga.setImageResource(R.drawable.img_x);
            }
            if(v.getId()==R.id.imgb){
                int num = rnd.nextInt(6);
                imgb.setImageResource(R.drawable.dice1 + num);
            }
        }
    };
}