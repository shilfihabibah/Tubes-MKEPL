package com.tubes.plscd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testTambah() {
        Calculator calc = new Calculator();
        // Ekspektasi: 2 + 3 harusnya 5
        assertEquals(5, calc.tambah(2, 3), "Fungsi tambah gagal!");
    }

    @Test
    public void testKurang() {
        Calculator calc = new Calculator();
        // Ekspektasi: 10 - 4 harusnya 6
        assertEquals(6, calc.kurang(10, 4), "Fungsi kurang gagal!");
    }
}