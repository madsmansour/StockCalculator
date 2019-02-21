package com.example.stockcalculator;

public class Calculator {


    public static double Breakeven(double a, double b, double c){
        double resultat = (a * b + c) / a;

        return resultat;

    }

    public static double ProfitCalc(double a, double b, double c, double d){
        double resultat2 = ((a * b) * d + c) / a;

        return resultat2;
    }
}
