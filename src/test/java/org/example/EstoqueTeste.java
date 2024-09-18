package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EstoqueTeste {

    private static Estoque estoque;

    @BeforeAll
    static void setup(){
        estoque = new Estoque("Produto 1", "670", 23.90, 100);
    }

    @Test
    void testarMetodoAdicionarNoEstoque(){
        estoque.adicionarItemEstoque();
        assertEquals(101, estoque.retorneAQuantidadeDeItemEstoque());
    }

    @Test
    void testarMetodoRemoverNoEstoque(){
        estoque.removerItemEstoque();
        assertEquals(99, estoque.retorneAQuantidadeDeItemEstoque());
    }

    @Test
    void testarMetodoVerificarExisteNomeNoEstoque(){
        assertTrue(estoque.existeProdutoEstoquePeloNome("Produto 1"));
    }

    @Test
    void testarMetodoVerificarExisteCodigoNoEstoque(){
        assertTrue(estoque.existeProdutoEstoquePeloCodigo("670"));
    }

    @Test
    void testarMetodoVerificarQuantidadeProdutoEstoque(){
        assertEquals(100, estoque.retorneAQuantidadeDeItemEstoque());
    }
}
