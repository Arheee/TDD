package com.example.demo.Demo2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class JeuTest {
    private Jeu jeu;
    private Ide de = Mockito.mock(Ide.class);

    @Test
    public void whenDeThrowWithValue7_thenJeuReturnTrue(){
        //Arrange
        jeu = new Jeu(de);
        Mockito.when(de.lancer()).thenReturn(7);

        //Act
        boolean result = jeu.jouer();

        //Assert
        Assert.assertTrue(result);
    }

    @Test
    public void whenDeThrowWithValue8_thenJeuReturnFalse(){
        //Arrange
        jeu = new Jeu(de);
        Mockito.when(de.lancer()).thenReturn(8);

        //Act
        boolean result = jeu.jouer();

        //Assert
        Assert.assertFalse(result);
    }

}
