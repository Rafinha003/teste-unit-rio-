package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculadoraTeste {

    private static calculadora calculadora;

    @BeforeAll
    static void setup(){
        calculadora = new calculadora();
    }

    @Test
    void adicionarTest(){
        double resultado = calculadora.adicionar(1, 1);
        assertEquals(2, resultado);
    }

    @Test
    void substituir(){
        double resultado = calculadora.subtrair(1, 1);
        assertEquals(2, resultado);

    }
}
