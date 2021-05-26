package com.example.test05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class animal extends AppCompatActivity {
    Button btn;
    ImageButton lion, bear, rabbit, pig;
    TextView txtanimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        btn = (Button)findViewById(R.id.btn);
        lion = (ImageButton) findViewById(R.id.lion);
        bear = (ImageButton) findViewById(R.id.bear);
        rabbit = (ImageButton) findViewById(R.id.rabbit);
        pig = (ImageButton) findViewById(R.id.pig);
        txtanimal = (TextView)findViewById(R.id.txtanimal);

        btn.setOnClickListener(mClick);
        lion.setOnClickListener(mClick);
        bear.setOnClickListener(mClick);
        rabbit.setOnClickListener(mClick);
        pig.setOnClickListener(mClick);
    }

    View.OnClickListener mClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v.getId()==R.id.lion){
                txtanimal.setText("사자");
            }
            if(v.getId()==R.id.bear){
                txtanimal.setText("곰");
            }
            if(v.getId()==R.id.rabbit){
                txtanimal.setText("토끼");
            }
            if(v.getId()==R.id.pig){
                txtanimal.setText("돼지");
            }
            if(v.getId()==R.id.btn){
                finish();
            }
        }
    };
}