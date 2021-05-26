package com.example.test04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etxtname;
    Button btnClick;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxtname = (EditText)findViewById(R.id.etxtname);
        btnClick = (Button)findViewById(R.id.btnClick);
        intent = new Intent(this, subActivity.class);

        btnClick.setOnClickListener(mClick);
    }

    View.OnClickListener mClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v.getId()==R.id.btnClick){
                intent.putExtra("key", etxtname.getText().toString());
                startActivity(intent);
            }
        }
    };
}