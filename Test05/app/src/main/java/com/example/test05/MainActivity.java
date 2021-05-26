package com.example.test05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text_title;
    Button flower, animal, vegetable, fruit;
    Intent i_flower, i_animal, i_vegetable, i_fruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flower = (Button)findViewById(R.id.flower);
        animal = (Button)findViewById(R.id.animal);
        vegetable = (Button)findViewById(R.id.vegetable);
        fruit = (Button)findViewById(R.id.fruit);
        text_title = (TextView)findViewById(R.id.text_title);

        i_flower = new Intent(this, flower.class);
        i_animal = new Intent(this, animal.class);
        i_fruit = new Intent(this, fruit.class);
        i_vegetable = new Intent(this, vegetable.class);

        flower.setOnClickListener(mClick);
        animal.setOnClickListener(mClick);
        vegetable.setOnClickListener(mClick);
        fruit.setOnClickListener(mClick);
    }

    View.OnClickListener mClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            if(v.getId()==R.id.flower){
               startActivity(i_flower);
            }
            if(v.getId()==R.id.animal){
                startActivity(i_animal);
            }
            if(v.getId()==R.id.vegetable){
                startActivity(i_vegetable);
            }
            if(v.getId()==R.id.fruit){
                startActivity(i_fruit);
            }
        }
    };
}