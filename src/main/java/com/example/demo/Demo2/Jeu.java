package com.example.demo.Demo2;


public class Jeu {
    private final Ide de;
    // Couplage faible car au lieu de mettre un type on met une Interface
    // jeu va travailler a partir de IDe

    public Jeu(Ide de) {
        this.de = de;
    }

    public boolean jouer(){
        return de.lancer() == 7;
    }
}
