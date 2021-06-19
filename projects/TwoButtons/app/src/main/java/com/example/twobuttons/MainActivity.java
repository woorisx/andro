package com.example.twobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     Button btn1, btn2;
     TextView txtv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        txtv = (TextView) findViewById(R.id.txtv);

        btn1.setOnClickListener(mClick);
        btn2.setOnClickListener(mClick);

    }

    View.OnClickListener mClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v.getId() == R.id.btn1){
                txtv.setText("1번입니다.");
            }else if(v.getId() == R.id.btn2){
                txtv.setText("2번입니다.");
            }
        }
    };
}