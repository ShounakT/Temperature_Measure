package com.example.temperature_measure;

import android.os.Bundle;
import android.text.TextUtils;
import java.text.DecimalFormat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText eT;
    Button btn;
    TextView tV;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eT = findViewById(R.id.eT);
        btn = findViewById(R.id.btn);
        tV = findViewById(R.id.tV);
        tV.setText(null);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(eT.getText())) {

                    tV.setText("No Data Entered!");
                }
                else {

                    String Number = eT.getText().toString().trim();
                    final double temp;
                    final String temp1;
                    int numCount = Integer.parseInt(Number);
                    temp = (numCount / 3.0) + 4;
                    temp1 = new DecimalFormat("#.##").format(temp);
                    if (numCount < 0) {
                        tV.setText("Enter valid Input!");
                    }
                    String text = "The Temperature is:" + " " + temp1 + " " +
                            "Degrees Celsius!";
                    tV.setText(text);
                }

            }
        });
    }

}
