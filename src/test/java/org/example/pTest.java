package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class pTest {

    private Calculadora calc;

    @BeforeEach
    void setUp() {
        calc = new Calculadora();
    }

    @Test
    void testSumar() {
        assertEquals(6, calc.sumar(3, 3));
    }

    @Test
    void testRestar() {
        assertEquals(3, calc.restar(5, 2));
    }



}
