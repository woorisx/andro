package com.example.test03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4;
    Intent A;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);

        btn1.setOnClickListener(mClick);
        btn2.setOnClickListener(mClick);
        btn3.setOnClickListener(mClick);
        btn4.setOnClickListener(mClick);

    }

    View.OnClickListener mClick = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            if(v.getId()==R.id.btn1){
               Intent A = new Intent(getApplicationContext(), A_activity.class);
                startActivity(A);
            }
            if(v.getId()==R.id.btn2){
                Intent B = new Intent(getApplicationContext(), B_activity.class);
                startActivity(B);
            }
            if(v.getId()==R.id.btn3){
                Intent C = new Intent(getApplicationContext(), C_activity.class);
                startActivity(C);
            }
            if(v.getId()==R.id.btn4){
                Intent D = new Intent(getApplicationContext(), D_activity.class);
                startActivity(D);
            }
        }
    };
}