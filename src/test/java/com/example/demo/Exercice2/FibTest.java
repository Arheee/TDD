package com.example.demo.Exercice2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class FibTest {

//    GetFibSeries() avec un Range de 1
//    - Le résultat n’est pas vide
//  - Le résultat correspond à une liste qui contient {0}
    @Test
    public void whenRangeIs1_thenResultNotEmpty(){
        //Arrange
        Fib fib = new Fib(1);
        //Act
        List<Integer> result = fib.getFibSeries();

        //Assert
        Assert.assertFalse(result.isEmpty());
        Assert.assertEquals(List.of(0),result);
    }

    // Lors du déclanchement de la fonction GetFibSeries() avec un Range de 6
    // Le résultat contient le chiffre 3
    @Test
    public void whenRangeIs6_thenResultContains3() {
        // Arrange
        Fib fib = new Fib(6);
        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertTrue(result.contains(3));
    }

    //- Le résultat contient 6 éléments
    @Test
    public void whenRangeIs6_thenResultContains6Elements() {
        // Arrange
        Fib fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertEquals(6, result.size());
    }

    //- Le résultat n’a pas le chiffre 4 en son sein
    @Test
    public void whenRangeIs6_thenResultDoesNotContain4() {
        // Arrange
        Fib fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertFalse(result.contains(4));
    }
    @Test
    public void whenRangeIs6_thenResultIsExpectedList() {
        // Arrange
        List<Integer> resultAwait = List.of(0, 1, 1, 2, 3, 5);
        int range = 6;
        Fib fib = new Fib(range);
        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertArrayEquals(resultAwait.toArray(), result.toArray());
    }

    //Le résultat est trié de façon ascendance
    @Test
    public void whenRangeIs6_thenResultIsSorted(){
        //Arrange
        Fib fib = new Fib(6);
        //Act
        List<Integer> result = fib.getFibSeries();
        List<Integer> expected = new ArrayList<>(result);
        expected.sort(null);
        //Assert
       Assert.assertArrayEquals(expected.toArray(), result.toArray());

    }


}
