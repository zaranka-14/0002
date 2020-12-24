package com.example.myapplication002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.myapplication002.Figure.Circle_P;
import static com.example.myapplication002.Figure.Circle_S;

public class Circle extends AppCompatActivity{
    public Button btn;
    public String x;
    public  String y;
    public TextView figure_type;
    public TextView k;
    public double S;
    public double P;
    public EditText editX;
    public EditText editY;
    private EditText Rr;
    private TextView Per;
    private TextView Plo;
    private int r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
        btn = findViewById(R.id.btn_sc);
        Rr = findViewById(R.id.r);
        Per = findViewById(R.id.CirP);
        Plo = findViewById(R.id.CicS);
        editX = findViewById(R.id.edit_X);
        editY = findViewById(R.id.edit_Y);
        figure_type = findViewById(R.id.figure_name);
        k = findViewById(R.id.k);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = getIntent().getStringExtra(MainActivity.Name_Key);
                x = editX.getText().toString();
                y = editY.getText().toString();
                figure_type.setText(name);
                r = Integer.parseInt(Rr.getText().toString());
                P = Circle_P(r);
                S = Circle_S(r);
                Per.setText("Периметр: " + P);
                Plo.setText("Площадь: " + S);
                k.setText("Координаты центра: ("+ x + ";" + y + ")");
            }
        });
    }
}