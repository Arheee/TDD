package com.example.demo.Exercice4;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.webjars.NotFoundException;

public class RechercheVilleTest {

    //1. Si le texte de la recherche contient moins de 2 caractères,
    // ***Une exception est levée de type NotFoundException***.
    @Test
    public void whenTextIsLessThan2Char_thenNotFoundException(){
        //Arrange
        RechercheVille rechercheVille = new RechercheVille();

        //Act & Assert
        Assert.assertThrows(NotFoundException.class, ()-> {
            rechercheVille.rechercher("A");
        });

    }

}
