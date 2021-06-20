package com.example.justtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton lion, bear, rabbit, pig;
    Button btn;
    TextView txtv1, txtv2;
    int num;
    Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lion = (ImageButton) findViewById(R.id.lion);
        bear = (ImageButton) findViewById(R.id.bear);
        rabbit = (ImageButton) findViewById(R.id.rabbit);
        pig = (ImageButton) findViewById(R.id.pig);
        btn = (Button) findViewById(R.id.btn);
        txtv1 = (TextView) findViewById(R.id.txtv1);
        txtv2 = (TextView) findViewById(R.id.txtv2);

        lion.setOnClickListener(mClick);
        bear.setOnClickListener(mClick);
        rabbit.setOnClickListener(mClick);
        pig.setOnClickListener(mClick);
        btn.setOnClickListener(mClick);
    }

    View.OnClickListener mClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(v.getId() == R.id.btn) {
                num = rnd.nextInt(4);
                if (num == 0) {
                    txtv1.setText("사자");
                }
                if (num == 1) {
                    txtv1.setText("곰");
                }
                if (num == 2) {
                    txtv1.setText("토끼");
                }
                if (num == 3) {
                    txtv1.setText("돼지");
                }
            }
            if(v.getId()== R.id.lion){
                if(num==0){
                    txtv2.setText("O");
                    return;
                }
                txtv2.setText("X");
                return;
            }if(v.getId()== R.id.bear){
                if(num==1){
                    txtv2.setText("O");
                    return;
                }
                txtv2.setText("X");
                return;
            }if(v.getId()== R.id.rabbit){
                if(num==2){
                    txtv2.setText("O");
                    return;
                }
                txtv2.setText("X");
                return;
            }if(v.getId()== R.id.pig){
                if(num==3){
                    txtv2.setText("O");
                    return;
                }
                txtv2.setText("X");
                return;
            }


        }
    };
}