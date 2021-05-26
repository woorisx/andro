package com.example.test03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class A_activity extends AppCompatActivity {
    Button a_close;
    TextView textA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aactivity);

        a_close = (Button)findViewById(R.id.a_close);
        a_close.setOnClickListener(mClick);
    }

    View.OnClickListener mClick = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            if(v.getId()==R.id.a_close){
                finish();
            }
        }
    };

}