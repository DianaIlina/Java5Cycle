package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @Test
    void shouldCalculateNumberOfSquares() {
        SQRService service = new SQRService();
        int lower = 200;
        int higher = 300;

        int expected = 3;

        int actual = service.calculate(lower, higher);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfSquaresBelowFirst() {
        SQRService service = new SQRService();
        int lower = 81;
        int higher = 81;

        int expected = 0;

        int actual = service.calculate(lower, higher);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfSquaresFirst() {
        SQRService service = new SQRService();
        int lower = 100;
        int higher = 100;

        int expected = 1;

        int actual = service.calculate(lower, higher);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfSquaresAboveFirst() {
        SQRService service = new SQRService();
        int lower = 121;
        int higher = 121;

        int expected = 1;

        int actual = service.calculate(lower, higher);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfSquaresBelowLast() {
        SQRService service = new SQRService();
        int lower = 9604;
        int higher = 9604;

        int expected = 1;

        int actual = service.calculate(lower, higher);
        assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateNumberOfSquaresLast() {
        SQRService service = new SQRService();
        int lower = 9801;
        int higher = 9801;

        int expected = 1;

        int actual = service.calculate(lower, higher);
        assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateNumberOfSquaresAboveLast() {
        SQRService service = new SQRService();
        int lower = 10000;
        int higher = 10000;

        int expected = 0;

        int actual = service.calculate(lower, higher);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfSquaresAllNumbers() {
        SQRService service = new SQRService();
        int lower = 81;
        int higher = 10000;

        int expected = 90;

        int actual = service.calculate(lower, higher);
        assertEquals(expected, actual);
    }
}
