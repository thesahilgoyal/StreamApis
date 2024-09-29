package com.example.StreamApis;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenNumbersTest {

    @Test
    public void testFilterEvenNumbers_NormalCase() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expected = List.of(2, 4, 6, 8, 10);
        assertEquals(expected, EvenNumbers.filterEvenNumbers(numbers));
    }

    @Test
    public void testFilterEvenNumbers_EmptyList() {
        List<Integer> numbers = List.of();
        List<Integer> expected = List.of();
        assertEquals(expected, EvenNumbers.filterEvenNumbers(numbers));
    }

    @Test
    public void testFilterEvenNumbers_AllOdd() {
        List<Integer> numbers = List.of(1, 3, 5, 7, 9);
        List<Integer> expected = List.of();  // No even numbers
        assertEquals(expected, EvenNumbers.filterEvenNumbers(numbers));
    }

    @Test
    public void testFilterEvenNumbers_AllEven() {
        List<Integer> numbers = List.of(2, 4, 6, 8, 10);
        List<Integer> expected = List.of(2, 4, 6, 8, 10);  // All numbers are even
        assertEquals(expected, EvenNumbers.filterEvenNumbers(numbers));
    }

    @Test
    public void testFilterEvenNumbers_NegativeNumbers() {
        List<Integer> numbers = List.of(-10, -9, -8, -7, -6, -5, -4, -3, -2, -1);
        List<Integer> expected = List.of(-10, -8, -6, -4, -2);  // Even negative numbers
        assertEquals(expected, EvenNumbers.filterEvenNumbers(numbers));
    }


}
