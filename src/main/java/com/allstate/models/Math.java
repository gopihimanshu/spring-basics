package com.allstate.models;

import java.util.stream.IntStream;

public class Math {

    public static int square(int num){
        return num * num;
    }


    public static int factorial( int n) {
        int res = IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
        //System.out.println(res);
        return res;
    }
}
