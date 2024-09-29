package com.example.StreamApis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

    public static List<Integer> filterEvenNumbers(List<Integer> numbers){
        return numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
    }


    public static void main(String[] args){
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> even = filterEvenNumbers(numbers);

        System.out.println(even);
    }

}
