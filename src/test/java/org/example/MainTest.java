package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void sumTrue() {
        int [] prices = {100};
        int productNumber = 0;
        int currentPrice = 0;
        int productCount = 1;
        int sumProducts = 200;
        int result = Main.sum(prices, productNumber, currentPrice, sumProducts );
        assertEquals(200, result);

    }
    @Test
    void sumFalse() {
        int [] prices = {100};
        int productNumber = 0;
        int currentPrice = 0;
        int productCount = 1;
        int sumProducts = 200;
        int result = Main.sum(prices, productNumber, currentPrice, sumProducts );
        assertEquals(300, result);

    }
}