package com.example.conversionapp;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;




public class FourthActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth);
    }

    public void onConvert1(View v2){
        final EditText input=findViewById(R.id.cel);
        Button c1=findViewById(R.id.convertc);
        final Double input_cel=Double.parseDouble(input.getText().toString());

        final Double fahrenheits=input_cel*9/5+32;
        final Double kels=input_cel+273.15;

        final TextView f=findViewById(R.id.fah);
        String fas=String.format("%.2f",fahrenheits);
        f.setText(fas);
        final TextView k=findViewById(R.id.kel);
        String kelv=String.format("%.2f",kels);
        k.setText(kelv);

    }

    public void onConvert2(View v2){
        final EditText input=findViewById(R.id.fah);
        Button f1=findViewById(R.id.convertf);
        final Double input_fah=Double.parseDouble(input.getText().toString());

        final Double cels=(input_fah-32)*5/9;
        final Double kels=(input_fah-32)*5/9+273.15;

        final TextView c=findViewById(R.id.cel);
        String fas=String.format("%.2f",cels);
        c.setText(fas);
        final TextView k=findViewById(R.id.kel);
        String kelv=String.format("%.2f",kels);
        k.setText(kelv);

    }

    public void onConvert3(View v2){
        final EditText input=findViewById(R.id.kel);
        Button k1=findViewById(R.id.convertk);
        final Double input_kel=Double.parseDouble(input.getText().toString());

        final Double fahrenheits=(input_kel-273.15)*9/5+32;
        final Double cels=input_kel-273.15;

        final TextView f=findViewById(R.id.fah);
        String fas=String.format("%.2f",fahrenheits);
        f.setText(fas);
        final TextView c=findViewById(R.id.cel);
        String celv=String.format("%.2f",cels);
        c.setText(celv);

    }

    public void onReset(View v2){

        final TextView k=findViewById(R.id.kel);
        final TextView c=findViewById(R.id.cel);
        final TextView f=findViewById(R.id.fah);

        k.setText("");
        c.setText("");
        f.setText("");


    }
    public void onBack4(View view2)

    {

        Intent intent2 = new Intent(FourthActivity.this, MainActivity.class);
        startActivity(intent2);
    }



}
