package com.example.count;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtn1, txtn2, etxtn1, etxtn2, txtresult, txtvalue;
    Button btnadd, btnsub, btnmul, btndiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtn1 = (TextView) findViewById(R.id.txtn1);
        etxtn1 = (EditText) findViewById(R.id.etxtn1);
        txtn2 = (TextView) findViewById(R.id.txtn2);
        etxtn2 = (EditText) findViewById(R.id.etxtn2);
        txtresult = (TextView) findViewById(R.id.txtresult);
        txtvalue = (TextView)findViewById(R.id.txtvalue);

        btnadd  = (Button)findViewById(R.id.btnadd);
        btnsub = (Button)findViewById(R.id.btnsub);
        btnmul = (Button) findViewById(R.id.btnmul);
        btndiv = (Button) findViewById(R.id.btndiv);

        btnadd.setOnClickListener(mClick);
        btnsub.setOnClickListener(mClick);
        btnmul.setOnClickListener(mClick);
        btndiv.setOnClickListener(mClick);

    }

    View.OnClickListener mClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int a = Integer.parseInt(etxtn1.getText().toString());
            int b = Integer.parseInt(etxtn2.getText().toString());

            if(v.getId()== R.id.btnadd){
                txtvalue.setText(""+(a+b));
            }
            if(v.getId()== R.id.btnsub){
                txtvalue.setText(""+(a-b));
            }
            if(v.getId()== R.id.btnmul){
                txtvalue.setText(""+(a*b));
            }
            if(v.getId()== R.id.btndiv){
                txtvalue.setText(""+(a/b));
            }
        }
    };
}