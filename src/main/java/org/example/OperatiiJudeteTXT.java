package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OperatiiJudeteTXT implements OperatiiJudete {

    private List<Judete> judete =  new ArrayList<>();

    @Override
    public List<Judete> citesteJudete(String caleFisier) {

        List<Judete> listaJudete = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(caleFisier)))
        {
            String linie;

            while((linie = br.readLine()) != null)
            {
                if(linie.isBlank())continue;

                String[] j = linie.split(" ");

                String codISO = j[0].trim();
                String numeJudet = j[1].trim();
                String regiune =  j[2].trim();
                int nrLocuitori = Integer.parseInt(j[3].trim());
                int suprafata = Integer.parseInt(j[4].trim());

                listaJudete.add(new Judete(codISO, numeJudet, regiune, nrLocuitori, suprafata));
            }
        }catch(IOException e)
        {
            System.out.println("Eroare la citire: " + e.getMessage());
        }

        this.judete =  listaJudete;
        return judete;
    }

    @Override
    public void scrieJudete(List<Judete> listaJudete, String caleFisier) {

        CerinteFunctionale cerinte = new CerinteFunctionale();
        List<Judete> judeteSortate = cerinte.sorteazaDupaDensitate(listaJudete);

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(caleFisier)))
        {
            for(Judete judet : judeteSortate)
            {
                bw.write(judet.getCodISO() + " " + judet.getNumeJudet() + " " + judet.getRegiune()
                        + " " + judet.getNrLocuitori() + " " + judet.getSuprafata());
                bw.newLine();
                bw.newLine();
            }
        }catch(IOException e)
        {
            System.out.println("Eroare la scriere: " + e.getMessage());
        }
    }


}
