package com.kata;
import java.util.*;
import java.util.Arrays;

public class StringCalculator{
    private String numbersDelimiter = "[\n,]";

    public StringCalculator(){
    };

    private List<String> getNumbers(String numbers){
        return Arrays.asList(numbers.split(numbersDelimiter));
    };

    public int add(String numbers){
        if(numbers.length() == 0) return 0;
        List<String> numbersList = getNumbers(numbers);
        int sum = 0;
        for(String number: numbersList){
            sum += Integer.valueOf(number);
        }
        return sum;
    };
}
