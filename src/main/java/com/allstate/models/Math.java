package com.allstate.models;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Math {

    public static int square(int num){
        return num * num;
    }

    public static int factorial( int n) {
        return IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
    }

    public static int factorialUsingIterate( int num) {
       return Stream.iterate(1, n  ->  n +1)
                    .limit(num)
                    .reduce(1,(acc,res) -> acc*res);
    }
}
