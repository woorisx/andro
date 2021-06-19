package com.example.threebuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button odd, even, start;
    TextView computer, txtv1, txtv2;
    Random rnd;
    int num;
    String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        odd = (Button) findViewById(R.id.odd);
        even = (Button) findViewById(R.id.even);
        start = (Button) findViewById(R.id.start);

        odd.setOnClickListener(mClick);
        even.setOnClickListener(mClick);
        start.setOnClickListener(mClick);

    }

    View.OnClickListener mClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num = rnd.nextInt();
            if(v.getId() == R.id.odd){
                txtv1.setText(num);
                if(num==1) result = "win";
                else result = "fail";
                txtv2.setText("컴퓨터:"+num+" / "+ v.getId()+"버튼입니다."
                                + result);
            }else if(v.getId() == R.id.even){
                txtv1.setText(num);
                if(num==0) result = "win";
                else result= "fail";
                txtv2.setText("컴퓨터:"+ num +" / "+v.getId()+"버튼입니다."
                                + result);
            }else if(v.getId() == R.id.start){
                computer.setText(num);
                txtv1.setText("?");
                txtv2.setText("");
            }
        }
    };
}
