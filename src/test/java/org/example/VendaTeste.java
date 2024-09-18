package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VendaTeste {

    private static Venda venda;

    @BeforeAll
    static void setup(){
        venda = new Venda(110, 100, 0);
    }

    @Test
    void TestarMetodoCalcularTroco(){
        assertEquals(10, venda.trocoVenda());
    }

    @Test
    void TestarMetodoCalcularComissaoVendedor(){
        assertEquals(90, venda.calcularComissaoVendedor());
    }

    @Test
    void TestarMetodoValorPagoEhSuficiente(){
        assertEquals(true, venda.valorPagoEhSuficiente());
    }

    @Test
    void TestarMetodoPrecisaDeTroco(){
        assertEquals(true, venda.precisaDeTroco());
    }

    @Test

    void TestarMetodoConfirmarSeFoiPago(){
        assertEquals(true, venda.informaSeFoiPago());
    }
}
