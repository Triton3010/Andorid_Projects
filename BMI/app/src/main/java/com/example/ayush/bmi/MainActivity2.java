package com.example.ayush.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void buttontwoclick(View view)
    {
        double weight = 0;
        double height = 0;
        double bmi = 0;
        String msg = "";

        EditText et1 = (EditText)findViewById(R.id.w1);
        EditText et2 = (EditText)findViewById(R.id.h1);

        Button b = (Button)findViewById(R.id.b2);

        TextView t1 = (TextView)findViewById(R.id.bmi);
        TextView t2 = (TextView)findViewById(R.id.res);

        weight = Double.parseDouble(et1.getText().toString());
        height = Double.parseDouble(et2.getText().toString());

        bmi = height*height;
        bmi = weight/bmi;

        t1.setText(String.valueOf(bmi));

        if(bmi<18.5)
        {
            msg = "Underweight";
        }
        else if(bmi>18.5 && bmi<25)
        {
            msg= "Normal";
        }
        else if(bmi>25)
        {
            msg = "Overweight";
        }

         t2.setText(msg);
    }
}
