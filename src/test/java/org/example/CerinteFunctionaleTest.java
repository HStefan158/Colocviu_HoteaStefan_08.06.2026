package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CerinteFunctionaleTest {

    CerinteFunctionale cerinteFunctionale = new CerinteFunctionale();

    private List<Judete> judeteProba()
    {
        return Arrays.asList(
                new Judete("GR","Giurgiu", "SudMuntenia",100,20),
                new Judete("SB","Sibiu", "Centru",200,50),
                new Judete("B","Bucuresti", "BucurestiIlfov",300,100)
        );
    }

    @Test
    void densitate() {

        Judete j = new Judete("GR","Giurgiu", "SudMuntenia",100,20);
        assertEquals(5,cerinteFunctionale.densitate(j),0.01);

    }

    @Test
    void densitateRezultatZecimal() {

        Judete j = new Judete("CJ","Cluj", "NordVest",10,4);
        assertEquals(2.5,cerinteFunctionale.densitate(j),0.01);

    }

    @Test
    void sorteazaDupaDensitate() {

        List<Judete> sortate = cerinteFunctionale.sorteazaDupaDensitate(judeteProba());

        assertEquals(3, sortate.size());
        assertEquals("B", sortate.get(0).getCodISO());
        assertEquals("SB", sortate.get(1).getCodISO());
        assertEquals("GR", sortate.get(2).getCodISO());

    }

    @Test
    void sorteazaDupaDensitateListaGoala() {

        List<Judete> sortate = cerinteFunctionale.sorteazaDupaDensitate(Arrays.asList());
        assertTrue(sortate.isEmpty());

    }

}