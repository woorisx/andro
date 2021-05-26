package com.example.test05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class flower extends AppCompatActivity {
    Button btn;
    ImageButton rose, tulip, daisy, dbaek;
    TextView txtflower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower);

        rose = (ImageButton)findViewById(R.id.rose);
        tulip = (ImageButton)findViewById(R.id.tulip);
        daisy = (ImageButton)findViewById(R.id.daisy);
        dbaek = (ImageButton)findViewById(R.id.dbaek);
        btn = (Button)findViewById(R.id.btn);
        txtflower = (TextView)findViewById(R.id.txtflower);

       rose.setOnClickListener(mClick);
       tulip.setOnClickListener(mClick);
       daisy.setOnClickListener(mClick);
       dbaek.setOnClickListener(mClick);
       btn.setOnClickListener(mClick);
    }

    View.OnClickListener mClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v.getId()==R.id.dbaek){
                txtflower.setText("동백");
            }
            if(v.getId()==R.id.rose){
                txtflower.setText("장미");
            }
            if(v.getId()==R.id.tulip){
                txtflower.setText("튤립");
            }
            if(v.getId()==R.id.daisy){
                txtflower.setText("데이지");
            }
            if(v.getId()==R.id.btn){
                finish();
            }
        }
    };
}