package com.example.demo.Exercice1;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class GradingCalculatorTest {
//- Score : 95%, Présence : 90 => Note: A
//- Score : 85%, Présence : 90 => Note: B
//- Score : 65%, Présence : 90 => Note: C
//- Score : 95%, Présence : 65 => Note: B
//- Score : 95%, Présence : 55 => Note: F
//- Score : 65%, Présence : 55 => Note: F
//- Score : 50%, Présence : 90 => Note: F

    //- Score : 95%, Présence : 90 => Note: A
    @Test
    public void whenScore95AndAttendance90_ThenGradeA() {
        //Arrange
        GradingCalculator calculator = new GradingCalculator(95, 90);
        //Act
        char grade = calculator.getGrade();
        //Assert
        Assertions.assertEquals('A', grade);
    }

    @Test
    public  void whenScore85AndAttendance90_ThenGradeB(){
        GradingCalculator calculator = new GradingCalculator(85, 90);
        char grade = calculator.getGrade();
        Assertions.assertEquals('B', grade);
    }

    @Test
    public void whenScore65AndAttendance90_ThenGradeC(){
        GradingCalculator calculator = new GradingCalculator(65, 90);
        char grade = calculator.getGrade();
        Assertions.assertEquals('C', grade);
    }

    @Test
    public void whenScore95AndAttendance65_ThenGradeB(){
        GradingCalculator calculator = new GradingCalculator(95, 65);
        char grade = calculator.getGrade();
        Assertions.assertEquals('B', grade);
    }

    @Test
    public void whenScore95AndAttendance55_ThenGradeF(){
        GradingCalculator calculator = new GradingCalculator(95, 55);
        char grade = calculator.getGrade();
        Assertions.assertEquals('F', grade);
    }

    @Test
    public void whenScore65AndAttendance55_ThenGradeF(){
        GradingCalculator calculator = new GradingCalculator(65, 55);
        char grade = calculator.getGrade();
        Assertions.assertEquals('F', grade);
    }

    @Test
    public void whenScore90AndAttendance90_ThenGradeF(){
        GradingCalculator calculator = new GradingCalculator(90, 55);
        char grade = calculator.getGrade();
        Assertions.assertEquals('F', grade);
    }

    @ParameterizedTest
    @CsvSource({
            "95, 90, A",
            "85, 90, B",
            "65, 90, C",
            "95, 65, B",
            "95, 55, F",
            "65, 55, F",
            "50, 90, F"
    })
    public void testGetGrade(int score, int attendance, char expectedGrade){
        GradingCalculator calculator = new GradingCalculator(score, attendance);
        char grade = calculator.getGrade();
        Assertions.assertEquals(expectedGrade, grade);
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    public void whenScore_andAttendance_thenExpectedGrade(int score, int attendance, char expectedGrade){
        GradingCalculator calculator = new GradingCalculator(score, attendance);
        char grade = calculator.getGrade();
        Assertions.assertEquals(expectedGrade, grade);
    }

    private static Stream<Arguments> provideArguments(){
      return Stream.of(
              Arguments.of(95, 90, 'A'),
              Arguments.of(85, 90, 'B'),
              Arguments.of(65, 90, 'C'),
              Arguments.of(95, 65, 'B'),
              Arguments.of(95, 55, 'F'),
              Arguments.of(65, 55, 'F'),
              Arguments.of(50, 90, 'F')
      );
    }


}
