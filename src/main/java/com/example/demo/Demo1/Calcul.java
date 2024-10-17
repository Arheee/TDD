package com.example.demo.Demo1;

import com.example.demo.Exception.DivideByZeroException;

public class Calcul {
    //Une methode qui additionne 2 nombre et retourne le resultat
    public double addition(double x, double y) {
        return x + y;
    }
    // Une methode qui disive 2 nombre
    public double division(double a, double b){
        if(b != 0)
            return a/b;
        throw new DivideByZeroException();
    }

}
