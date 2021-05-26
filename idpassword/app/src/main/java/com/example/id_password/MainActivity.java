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

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxtid = (EditText) findViewById(R.id.etxtid);
        etxtpw = (EditText) findViewById(R.id.txtpw);
        btnstart = (Button) findViewById(R.id.btnclose);

        btnstart.setOnClickListener(mClick);
        intent = new Intent(this, subActivity.class);
    }

    View.OnClickListener mClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v.getId()==R.id.btnclose){
                intent.putExtra("id",etxtid.getText().toString());
                intent.putExtra("pw",etxtpw.getText().toString());
                startActivity(intent);
            }
        }
    };
}