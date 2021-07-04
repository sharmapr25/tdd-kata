package com.kata;
import java.util.*;
import java.util.Arrays;

public class StringCalculator{
    private String DEFAULT_DELIMITERS = "\n,";
    private String DOUBLE_SLASH = "//";
    private String NEW_LINE_SEPERATOR = "\n";


    public StringCalculator(){
    };

    private String getAllDelimiters(String customDelimiters){
        return "[" + customDelimiters + DEFAULT_DELIMITERS + "]";
    }
    private List<String> getNumbers(String numbers){
        if(numbers.startsWith(DOUBLE_SLASH)){
            String[] numbersWithCustomDelimiters = numbers.split(NEW_LINE_SEPERATOR);
            String customDelimiters = numbersWithCustomDelimiters[0].substring(2);
            return Arrays.asList(numbersWithCustomDelimiters[1].split(getAllDelimiters(customDelimiters)));
        }
        return Arrays.asList(numbers.split(getAllDelimiters("")));
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
