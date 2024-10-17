package com.example.demo.Demo1;

import com.example.demo.Exception.DivideByZeroException;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculTest {

    @Test
    public void whenAddition_1_2_Then_3() {
       //Arrange
        Calcul cal = new Calcul();
        double x = 1;
        double y = 2;

        // Act
        double result = cal.addition(x, y);

        // Assert
        Assert.assertEquals(3.0, result, 0.0001);
    }

    //exception levé en java division par 0
    @Test
    public void whenDivision_30_10_Then_3(){
        //Arrange
        Calcul cal = new Calcul();
        double a = 30;
        double b = 10;
        // Act
        double result = cal.division(a, b);

        // Assert
        Assert.assertEquals(3.0, result, 0.0001);
    }

    @Test
    public void whenDivision_10_0_Then_DivideByZeroException(){
        //Arrange
        Calcul cal = new Calcul();
        double a = 10;
        double b = 0;

        // Act Arrange
        Assert.assertThrows(DivideByZeroException.class,()->{cal.division(a,b);});
        //Vérifie si ca declenche une exception en précisant la classe puis la méthode qui déclenche l'exception

    }
}
