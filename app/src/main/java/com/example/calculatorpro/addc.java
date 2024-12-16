package com.example.calculatorpro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class addc extends AppCompatActivity {
    EditText et1,et2;
    Button b5,d1;
    String getNum1,getNum2,result;
    int a,b,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addc);
        b5 = (Button) findViewById(R.id.gback);
        d1 = (Button) findViewById(R.id.addb);
        et1 = (EditText) findViewById(R.id.n1);
        et2 = (EditText) findViewById(R.id.n2);

        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getNum1=et1.getText().toString();
                getNum2=et2.getText().toString();
                a=Integer.parseInt(getNum1);
                b=Integer.parseInt(getNum2);
                sum=a+b;
                result=String.valueOf(sum);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
        }
    });
    }
}