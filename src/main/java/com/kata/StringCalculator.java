package com.kata;
import java.util.*;
import java.util.stream.*;
import java.util.Arrays;

public class StringCalculator{
    public StringCalculator(){};

    public int add(String numbers){
        if(numbers.length() == 0) return 0;
        List<String> numbersList = Arrays.asList(numbers.split(""));
        int sum = 0;
        for(String number: numbersList){
            sum += Integer.valueOf(number);
        }
        return sum;
    };
}
