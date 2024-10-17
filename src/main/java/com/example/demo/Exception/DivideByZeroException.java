package com.example.demo.Exception;

public class DivideByZeroException extends RuntimeException{
    public DivideByZeroException(){
        super("Division par zero");
    }
}
