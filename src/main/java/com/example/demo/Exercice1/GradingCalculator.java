package com.example.demo.Exercice1;

public class GradingCalculator {
    public int score;
    public int attendancePercentage;

    public GradingCalculator(int score, int attendancePercentage) {
        this.score = score;
        this.attendancePercentage = attendancePercentage;
    }

    public char getGrade() {
        if(score > 90 && attendancePercentage > 70) return 'A';
        else if(score > 80 && attendancePercentage > 60) return  'B';
        else if (score > 60 && attendancePercentage > 60) return  'C';
        else return 'F';

        //Pour retourner les test en erreur au debut
        // return 'Z';
    }
}
