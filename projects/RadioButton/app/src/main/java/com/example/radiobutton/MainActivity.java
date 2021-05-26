package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        RadioButton rbtn1, rbtn2, rbtn3;
        TextView txtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rbtn1 = (RadioButton)findViewById(R.id.rbtn1);
        rbtn2 = (RadioButton)findViewById(R.id.rbtn2);
        rbtn3 = (RadioButton)findViewById(R.id.rbtn3);

        txtv = (TextView)findViewById(R.id.txtv);

        rbtn1.setOnClickListener(mClick);
        rbtn2.setOnClickListener(mClick);
        rbtn3.setOnClickListener(mClick);
    }

    View.OnClickListener mClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v.getId()==R.id.rbtn1){
                txtv.setText(rbtn1.getText().toString());
            }
            if(v.getId()==R.id.rbtn2){
                txtv.setText(rbtn2.getText().toString());
            }
            if(v.getId()==R.id.rbtn3){
                txtv.setText(rbtn3.getText().toString());
            }
        }
    };
}