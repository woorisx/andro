package com.example.test05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class vegetable extends AppCompatActivity {
    Button btn;
    ImageButton bean, tomato, cucumber, carrot;
    TextView txtvegetable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetable);

        btn = (Button) findViewById(R.id.btn);
        bean = (ImageButton) findViewById(R.id.bean);
        tomato = (ImageButton) findViewById(R.id.tomato);
        cucumber = (ImageButton) findViewById(R.id.cucumber);
        carrot = (ImageButton) findViewById(R.id.carrot);

        txtvegetable = (TextView) findViewById(R.id.txtvegetable);

        btn.setOnClickListener(mClick);
        bean.setOnClickListener(mClick);
        tomato.setOnClickListener(mClick);
        cucumber.setOnClickListener(mClick);
        carrot.setOnClickListener(mClick);
    }

    View.OnClickListener mClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.bean) {
                txtvegetable.setText("콩");
            }
            if (v.getId() == R.id.tomato) {
                txtvegetable.setText("토마토");
            }
            if (v.getId() == R.id.cucumber) {
                txtvegetable.setText("오이");
            }
            if (v.getId() == R.id.carrot) {
                txtvegetable.setText("당근");
            }
            if (v.getId() == R.id.btn) {
                finish();
            }
        }
    };
}