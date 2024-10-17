package com.example.demo.Exercice4;

import org.apache.commons.lang3.NotImplementedException;
import org.webjars.NotFoundException;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RechercheVille {
    private List<String> villes = List.of(
            "Paris", "Budapest", "Skopje", "Rotterdam", "Valence",
            "Vancouver","Amsterdam", "Vienne", "Sydney", "New York", "Londres",
            "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul");

    public List<String> rechercher(String mot) throws NotFoundException {

        if ("*".equals(mot)) {
            return villes;
        }

        if (mot.length() < 2) {
            throw new NotFoundException("Doit contenir au moins 2 caractères.");
        }

        List<String> villesFiltrees = new ArrayList<>();
        for (String ville : villes) {
            if (ville.toLowerCase().contains(mot.toLowerCase())) {
                villesFiltrees.add(ville);
            }
        }
        return villesFiltrees;
    }
}