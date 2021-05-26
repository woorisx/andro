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
        // intent를 보냈기 때문에 intent로 받아야되므로 받는 화면에서 재 선언.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        txtid = (TextView) findViewById(R.id.txtid);
        txtpw = (TextView) findViewById(R.id.txtpw);

        btnclose = (Button) findViewById(R.id.btnclose);

        btnclose.setOnClickListener(mClick);

        intentget = getIntent();  // 이전 화면에서 넘긴 값을 가지고 온다.
        String id = intentget.getStringExtra("id");
        String pw = intentget.getStringExtra("pw");

        txtid.setText(id); // 텍스트뷰에 보여진다.
        txtpw.setText(pw);
    }

    View.OnClickListener mClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
}

    // intent 선언-> 보내준 intent값을 저장 -> 화면에 보여준다.