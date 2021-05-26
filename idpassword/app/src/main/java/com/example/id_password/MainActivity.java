package com.example.id_password;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etxtid, etxtpw;
    Button btnstart;

    Intent intent; //  다음 화면 전환을 위해 선언(반드시 intent의 기능이 필요)

    @Override
    protected void onCreate(Bundle savedInstanceState) { // 생성

        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxtid = (EditText) findViewById(R.id.etxtid);
        etxtpw = (EditText) findViewById(R.id.txtpw);
        btnstart = (Button) findViewById(R.id.btnclose);

        btnstart.setOnClickListener(mClick);

        intent = new Intent(this, subActivity.class);

        // intent의 기능을 이용해 다른 화면으로 전환,
        // this: MainActivity.this -> 기본 생성자를 의미함.
        // 생성하면서 정보를 입력 및 저장
    }

    View.OnClickListener mClick = new View.OnClickListener() { // 클릭시 실행
        @Override
        public void onClick(View v) {

            if(v.getId()==R.id.btnclose){

                // intent = new Intent(getApplicationContext(), subActivity.class);

                intent.putExtra("id",etxtid.getText().toString());
                intent.putExtra("pw",etxtpw.getText().toString());

                startActivity(intent);   // 활성화
            }
        }
    };
}