package com.example.demo.Exercice4;

import org.apache.commons.lang3.NotImplementedException;
import org.webjars.NotFoundException;


import java.util.List;

public class RechercheVille {
    private List<String> villes = List.of(
            "Paris", "Budapest", "Skopje", "Rotterdam", "Valence",
            "Vancouver","Amsterdam", "Vienne", "Sydney", "New York", "Londres",
            "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul");

    public List<String> rechercher(String mot) throws NotFoundException {
        if (mot.length() < 2) {
            throw new NotFoundException("Doit contenir au moins 2 caractères.");
        }
      return villes;
    }
}