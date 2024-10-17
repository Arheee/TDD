package com.example.demo.Exercice4;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.webjars.NotFoundException;

public class RechercheVilleTest {


    @Test
    @DisplayName("Si le texte contient moins de 2 char, NotFoundException")
    public void whenTextIsLessThan2Char_thenNotFoundException(){
        //Arrange
        RechercheVille rechercheVille = new RechercheVille();

        //Act & Assert
        Assert.assertThrows(NotFoundException.class, ()-> {
            rechercheVille.rechercher("A");
        });

    }

}
