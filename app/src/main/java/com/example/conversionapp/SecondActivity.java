package com.example.conversionapp;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
public class SecondActivity extends AppCompatActivity {

    Double entered,converted,factor1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
    }


    public void onRadioButtonSelect(final View view){

        final EditText e=findViewById(R.id.amount);
        Button btn=findViewById(R.id.send);
        final Double input=Double.parseDouble(e.getText().toString());
        factor1=0.014*input;



    }

    public void onRadioButtonSelect2(final View view){

        final EditText e=findViewById(R.id.amount);
        Button btn=findViewById(R.id.send);
        final Double input=Double.parseDouble(e.getText().toString());
        factor1=1.22*input;

    }
    public void onRadioButtonSelect3(final View view){

        final EditText e=findViewById(R.id.amount);
        Button btn=findViewById(R.id.send);
        final Double input=Double.parseDouble(e.getText().toString());
        factor1=1.0*input;

    }
    public void onRadioButtonSelect4(final View view){

        final EditText e=findViewById(R.id.amount);
        Button btn=findViewById(R.id.send);
        final Double input=Double.parseDouble(e.getText().toString());
        factor1=1.12*input;

    }

    public void onSelect(final View view){


        converted=factor1*0.89;



    }public void onSelect2(final View view){


        converted=factor1*70.85;



    }
    public void onSelect3(final View view){


        converted=factor1*1.0;



    }
    public void onSelect4(final View view){


        converted=factor1*0.82;



    }


    public void onSend(View view){
        final TextView result=findViewById(R.id.result);

        String r=String.format("%.2f",converted);
        result.setText(r);
    }

    public void onBack(View view2)

    {

        Intent intent2 = new Intent(SecondActivity.this, MainActivity.class);
        startActivity(intent2);
    }


}