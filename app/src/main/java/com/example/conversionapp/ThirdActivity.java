package com.example.conversionapp;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;



public class ThirdActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
    }

    public void onBack5(View v){
        Intent intent=new Intent(ThirdActivity.this,MainActivity.class);
        startActivity(intent);

    }

    public void onConvert5(View v){
        final EditText input=findViewById(R.id.cm);
        final Double inputcm=Double.parseDouble(input.getText().toString());
        final Double inputfoot=inputcm/30.48;


        String feets = Double.toString(inputfoot);
        String[] convert = feets.split("\\.");

        int a = Integer.parseInt(convert[0]);
        Double b = Double.parseDouble(convert[1]);

        Double inches=b*12;






        final EditText f=findViewById(R.id.editText2);
        f.setText(Integer.toString(a));

        final EditText i=findViewById(R.id.editText3);
        i.setText(Double.toString(inches));







    }









}
