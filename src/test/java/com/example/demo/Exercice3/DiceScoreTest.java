package com.example.demo.Exercice3;

import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;
public class DiceScoreTest {

    private DiceScore diceScore;
    private Ide de = Mockito.mock(Ide.class);

    @BeforeAll
    public static void setUpClass(){
        System.out.println("Before All");
    }
    @BeforeEach
    public void setUp(){
        System.out.println("Before Each");
    }

    @AfterAll
    public static void tearDownClass(){
        System.out.println("After All");
    }

    @AfterEach
    public void tearDown(){
        System.out.println("After Each");

    }

//lorsque les 2 dés sont identiques on recupere bien valeur du dé * 2 + 10
    @Test
    @DisplayName("Test avec 2 dé à 4")
    public void whenBothDiceAreSame_thenReturnDoubleValuePlus10() {
        // Arrange

        diceScore = new DiceScore(de);
        Mockito.when(de.getRoll()).thenReturn(4).thenReturn(4);

        // Act
        int score = diceScore.getScore();

        // Assert
        Assert.assertEquals(18, score);
    }

    //dans le cas ou les 2 dés sont identiques on recupere 30
    @Test
    @Disabled("toto")
    public void whenBothDiceAreSame_thenReturn30(){
        // Arrange
        diceScore = new DiceScore(de);
        Mockito.when(de.getRoll()).thenReturn(6).thenReturn(6);

        // Act
        int score = diceScore.getScore();

        // Assert
        Assert.assertEquals(30, score);
    }

    //dans le cas ou les dé sont quelconque on recupere
    // la valeure du plus haut des 2
    @Test
    public void whenDiceAreDifferent_thenReturnHigherValue() {
        // Arrange
        diceScore = new DiceScore(de);
        Mockito.when(de.getRoll()).thenReturn(3).thenReturn(5);

        // Act
        int score = diceScore.getScore();

        // Assert
        Assert.assertEquals(5, score);
    }
}
