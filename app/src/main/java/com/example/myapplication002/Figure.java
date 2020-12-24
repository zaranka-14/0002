package com.example.myapplication002;

public class Figure {
    public static double Circle_P (int radius){
        return 2*radius*Math.PI;
    }

    public static double Circle_S (int radius){
        return Math.PI*radius*radius;
    }

    public static double Rectangle_P (int a, int b){
        return 2*(a+b);
    }

    public static double Rectangle_S (int a, int b){
        return a*b;
    }

    public static double Triangle_P (int a, int b, int c){
        return a+b+c;
    }

    public static double Triangle_S (int a, int b, int c){
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
