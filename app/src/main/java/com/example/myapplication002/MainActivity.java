package com.example.myapplication002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    public static final String Name_Key = "Name_Key";
    private Button next_btn;
    private Spinner spinner;
    private String selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.figure_names);
        next_btn = findViewById(R.id.next_figure);
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected = spinner.getSelectedItem().toString();
                if (selected.equals("круг") ){
                    Intent intent_circle = new Intent(getApplicationContext(), Circle.class);
                    intent_circle.putExtra(Name_Key, selected);
                    startActivity(intent_circle);
                }
                else if (selected.equals("прямоугольник")){
                    Intent intent_rectangle = new Intent(getApplicationContext(), Rectangle.class);
                    intent_rectangle.putExtra(Name_Key, selected);
                    startActivity(intent_rectangle);
                }
                else if (selected.equals("треугольник")){
                    Intent intent_triangle = new Intent(getApplicationContext(), Triangle.class);
                    intent_triangle.putExtra(Name_Key, selected);
                    startActivity(intent_triangle);
                }
            }
        });
    }
}