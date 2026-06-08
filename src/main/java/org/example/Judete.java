package org.example;

public class Judete {
    String codISO;
    String numeJudet;
    String regiune;
    int nrLocuitori;
    int suprafata;

    public Judete(String codISO, String numeJudet, String regiune, int nrLocuitori, int suprafata) {
        this.codISO = codISO;
        this.numeJudet = numeJudet;
        this.regiune = regiune;
        this.nrLocuitori = nrLocuitori;
        this.suprafata = suprafata;
    }

    public String getCodISO() {
        return codISO;
    }

    public String getNumeJudet() {
        return numeJudet;
    }

    public String getRegiune() {
        return regiune;
    }

    public int getNrLocuitori() {
        return nrLocuitori;
    }

    public int getSuprafata() {
        return suprafata;
    }


}
