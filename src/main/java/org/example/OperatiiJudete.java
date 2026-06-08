package org.example;

import java.util.List;

public interface OperatiiJudete {

    List<Judete> citesteJudete(String caleFisier);

    public void scrieJudete(List<Judete> listaJudete, String caleFisier);
}
