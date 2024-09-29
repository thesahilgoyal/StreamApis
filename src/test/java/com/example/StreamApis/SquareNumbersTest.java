package com.example.StreamApis;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareNumbersTest {


    @Test
    public void testMapToSquare_NormalCase() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> expected = List.of(1, 4, 9, 16, 25);
        assertEquals(expected, SquareNumbers.mapToSquare(numbers));
    }

    @Test
    public void testMapToSquare_EmptyList() {
        List<Integer> numbers = List.of();
        List<Integer> expected = List.of();
        assertEquals(expected, SquareNumbers.mapToSquare(numbers));
    }

    @Test
    public void testMapToSquare_NegativeNumbers() {
        List<Integer> numbers = List.of(-1, -2, -3, -4, -5);
        List<Integer> expected = List.of(1, 4, 9, 16, 25);  // Squared values are positive
        assertEquals(expected, SquareNumbers.mapToSquare(numbers));
    }

    @Test
    public void testMapToSquare_MixedNumbers() {
        List<Integer> numbers = List.of(-2, 0, 2);
        List<Integer> expected = List.of(4, 0, 4);  // Mixed positive, zero, and negative values
        assertEquals(expected, SquareNumbers.mapToSquare(numbers));
    }


}
