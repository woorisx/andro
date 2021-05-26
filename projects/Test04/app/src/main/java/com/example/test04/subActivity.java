package com.example.test04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class subActivity extends AppCompatActivity {
    Button btnclose;
    TextView txtHello;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        txtHello = (TextView)findViewById(R.id.txtHello);
        btnclose = (Button)findViewById(R.id.btnclose);

        intent = getIntent();
        String text = intent.getStringExtra("key");

        txtHello.setText(text);
        btnclose.setOnClickListener(mClick);
    }

    View.OnClickListener mClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
               if(v.getId()==R.id.btnclose){
                   finish();
               }
        }
    };
}