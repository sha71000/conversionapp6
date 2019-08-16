package com.example.conversionapp;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;




    public class MainActivity extends AppCompatActivity {


        private Button currency;
        private Button height;
        private Button weight;
        private Button temperature;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);







        currency=(Button)findViewById(R.id.currency_button);
        height=(Button)findViewById(R.id.height_button);
        weight=(Button)findViewById(R.id.weight_button);
        temperature=(Button)findViewById(R.id.temp_button);


    }


    public void onclick1(View v){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);

    }

    public void onclick4(View v){
            Intent intentq = new Intent(MainActivity.this, FourthActivity.class);
            startActivity(intentq);

        }

     public void onClick3(View v){
            Intent intent=new Intent(MainActivity.this,ThirdActivity.class);
            startActivity(intent);
     }



}
