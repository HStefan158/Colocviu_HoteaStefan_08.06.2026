package org.example;

import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class CerinteFunctionale {

    public static double densitate(Judete judet) {
        return (double) judet.getNrLocuitori() / judet.getSuprafata();
    }


    public List<Judete> sorteazaDupaDensitate(List<Judete> listaJudete) {
        return listaJudete.stream()
                .sorted(Comparator.comparingDouble(CerinteFunctionale::densitate))
                .collect(Collectors.toList());
    }


}