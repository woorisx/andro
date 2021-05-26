package com.example.test05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class fruit extends AppCompatActivity {
    Button btn;
    ImageButton lemon, pineapple, apple, grape;
    TextView txtfruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        btn = (Button) findViewById(R.id.btn);
        lemon = (ImageButton) findViewById(R.id.lemon);
        pineapple = (ImageButton) findViewById(R.id.pineapple);
        apple = (ImageButton) findViewById(R.id.apple);
        grape = (ImageButton) findViewById(R.id.grape);
        txtfruit = (TextView) findViewById(R.id.txtfruit);

        btn.setOnClickListener(mClick);
        lemon.setOnClickListener(mClick);
        pineapple.setOnClickListener(mClick);
        apple.setOnClickListener(mClick);
        grape.setOnClickListener(mClick);
    }

    View.OnClickListener mClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.lemon) {
                txtfruit.setText("레몬");
            }
            if (v.getId() == R.id.pineapple) {
                txtfruit.setText("파인애플");
            }
            if (v.getId() == R.id.apple) {
                txtfruit.setText("사과");
            }
            if (v.getId() == R.id.grape) {
                txtfruit.setText("포도");
            }
            if (v.getId() == R.id.btn) {
                finish();
            }
        }


    };

}