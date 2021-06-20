package com.example.chooseurpet2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton cherry, orange, mango, strawberry;
    Button btn;
    TextView txtv1, txtv2;
    int num;
    Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cherry = (ImageButton) findViewById(R.id.cherry);
        mango = (ImageButton) findViewById(R.id.mango);
        orange = (ImageButton) findViewById(R.id.orange);
        strawberry = (ImageButton) findViewById(R.id.strawberry);
        btn = (Button) findViewById(R.id.btn);

        txtv1 = (TextView)findViewById(R.id.txtv1);
        txtv2 = (TextView) findViewById(R.id.txtv2);

        btn.setOnClickListener(mClick);
        cherry.setOnClickListener(mClick);
        mango.setOnClickListener(mClick);
        orange.setOnClickListener(mClick);
        strawberry.setOnClickListener(mClick);
    }

    View.OnClickListener mClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(v.getId() == R.id.btn){
                num = rnd.nextInt(4);
                if(num==0){
                    txtv1.setText("달콤새콤 체리");
                }
                if(num==1){
                    txtv1.setText("향기로운 망고");
                }
                if(num==2){
                    txtv1.setText("즙즙 오렌지");
                }
                if(num==3){
                    txtv1.setText("상큼한 딸기");
                }
            }

            if(v.getId() == R.id.cherry){
                if(num==0){
                    txtv2.setText("O");
                    return;
                }
                txtv2.setText("X");
                return;
            }if(v.getId()==R.id.mango){
                if(num==1){
                    txtv2.setText("O");
                    return;
                }
                txtv2.setText("X");
                return;
            }if(v.getId() == R.id.orange){
                if(num==2){
                    txtv2.setText("O");
                    return;
                }
                txtv2.setText("X");
                return;
            }if(v.getId()==R.id.strawberry){
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