package com.example.myapplication002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.myapplication002.Figure.Rectangle_P;
import static com.example.myapplication002.Figure.Rectangle_S;

public class Rectangle extends AppCompatActivity {
    public Button btn;
    public String x;
    public  String y;
    public TextView figure_type;
    public TextView k;
    public double S;
    public double P;
    public EditText editX;
    public EditText editY;
    private EditText a_a;
    private EditText b_b;
    private TextView Per;
    private TextView Plo;
    private int a;
    private int b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);
        btn = findViewById(R.id.btn_sc);
        a_a = findViewById(R.id.a);
        b_b = findViewById(R.id.b);
        Per = findViewById(R.id.RecP);
        Plo = findViewById(R.id.RecS);
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
                a = Integer.parseInt(a_a.getText().toString());
                b = Integer.parseInt(b_b.getText().toString());
                P = Rectangle_P(a,b);
                S = Rectangle_S(a,b);
                Per.setText("Периметр: " + P);
                Plo.setText("Площадь: " + S);
                k.setText("Координаты центра: ("+ x + ";" + y + ")");
            }
        });
    }
}