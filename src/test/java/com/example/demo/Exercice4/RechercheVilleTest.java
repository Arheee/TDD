package com.example.demo.Exercice4;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.webjars.NotFoundException;

import java.util.List;

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

    @Test
    @DisplayName("Texte de recherche => a 2 char, renvois les noms de villes qui match")
    public void whenTextIs2OrMoreChar_thenReturnMatchingCities(){
        //Arrange
        RechercheVille rechercheVille = new RechercheVille();
        //Act
        List<String> result = rechercheVille.rechercher("Va");

        //Assert
        Assert.assertTrue(result.contains("Valence"));
        Assert.assertEquals(2, result.size());
    }

    @Test
    @DisplayName("insensible à la casse")
    public void whenTextIsCaseInsensitive_thenReturnMatchingCities(){
        // Arrange
        RechercheVille rechercheVille = new RechercheVille();

        // Act
        List<String> result = rechercheVille.rechercher("va");

        // Assert
        Assert.assertTrue(result.contains("Valence"));
        Assert.assertEquals(2, result.size());
    }

    @Test
    @DisplayName("Recherche lorsque le texte n'est qu'une partie d'un nom de ville")
    public void whenTextIsSubstring_thenReturnMatchingCities(){
        // Arrange
        RechercheVille rechercheVille = new RechercheVille();

        // Act
        List<String> result = rechercheVille.rechercher("ape");

        // Assert
        Assert.assertTrue(result.contains("Budapest"));
        Assert.assertEquals(1, result.size());
    }
    @Test
    @DisplayName("* renvoie tous les noms de ville")
    public void whenTextIsAsterisk_thenReturnAllCities() {
        // Arrange
        RechercheVille rechercheVille = new RechercheVille();

        // Act
        List<String> result  = rechercheVille.rechercher("*");

        // Assert
        Assert.assertEquals(16, result.size());
    }
}
