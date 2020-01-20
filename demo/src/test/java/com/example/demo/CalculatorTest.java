package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void suma() {
        Calculator calc = new Calculator();
        assertEquals(5050, calc.suma(100));
    }
}