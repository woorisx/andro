package com.example.id_password;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class subActivity extends AppCompatActivity {
        TextView txtid, txtpw;
        Button btnclose;
        Intent intentget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        txtid = (TextView) findViewById(R.id.txtid);
        txtpw = (TextView) findViewById(R.id.txtpw);

        btnclose = (Button) findViewById(R.id.btnclose);

        btnclose.setOnClickListener(mClick);

        intentget = getIntent();
        String str1 = intentget.getStringExtra("id");
        String str2 = intentget.getStringExtra("pw");

        txtid.setText(str1);
        txtpw.setText(str2);
    }

    View.OnClickListener mClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
}