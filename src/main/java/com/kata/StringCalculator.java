package com.kata;
import java.util.*;
import java.util.Arrays;

public class StringCalculator{
    private String DEFAULT_DELIMITERS = "\n,";
    private String DOUBLE_SLASH = "//";
    private String NEW_LINE_SEPERATOR = "\n";
    private int calledCount = 0;


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
        this.calledCount += 1;
        if(numbers.length() == 0) return 0;
        List<String> numbersList = getNumbers(numbers);
        int sum = 0;
        String negativeNumbersForException = "";

        for(String number: numbersList){
            if(Integer.valueOf(number) < 0){
                negativeNumbersForException += " "+number;
            }
            else{
                sum += Integer.valueOf(number);
            }
        }
        if(negativeNumbersForException.length() > 0){
            throw new NegativeNumbersAreNotAllowedException(negativeNumbersForException);
        }
        return sum;
    };

    public int getCalledCount(){
        return this.calledCount;
    }
}
