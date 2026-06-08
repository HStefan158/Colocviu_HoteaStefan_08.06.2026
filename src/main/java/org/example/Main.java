package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void printJudete(List<Judete> judete)
    {
        for(Judete j: judete){
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        OperatiiJudeteTXT catalog = new OperatiiJudeteTXT();

        List<Judete> judete =  catalog.citesteJudete("judete.txt");

        //Prima metoda de tiparire - cea in fisierul output.txt
        catalog.scrieJudete(judete, "output.txt");

        //A doua metoda de tiparire - afisare in consola
        printJudete(judete);

        System.out.println("Verifica output.txt");

    }
}
