package com.example.StreamApis;

import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbers {

    public static List<Integer> mapToSquare(List<Integer> numbers) {
        return numbers.stream().map(n -> n * n).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> squares = mapToSquare(numbers);
        System.out.println(squares);
    }
}
