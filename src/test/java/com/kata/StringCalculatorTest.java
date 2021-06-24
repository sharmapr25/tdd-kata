package com.kata;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for string calculator  .
 */
public class StringCalculatorTest
{
    @Test
    public void add_shouldReturnZero_WhenGivenInputNumbersAreEmpty(){
        StringCalculator stringCalculator = new StringCalculator();
        int sum = stringCalculator.add("");
        assertEquals(0, sum);
    };

    @Test
    public void add_shouldReturnOne_WhenGivenInputHasNumberOne(){
        StringCalculator stringCalculator = new StringCalculator();
        int sum = stringCalculator.add("1");
        assertEquals(1, sum);
    }

    @Test
    public void add_shouldReturnThree_WhenGivenInputHaveNumberOneAndTwo(){
        StringCalculator stringCalculator = new StringCalculator();
        int sum = stringCalculator.add("1,2");
        assertEquals(3, sum);
    }

    @Test
    public void add_shouldReturnThree_WhenGivenNumbersStringAreOneAndTwoWithNextLineDelimiter() {
        StringCalculator stringCalculator = new StringCalculator();
        int sum = stringCalculator.add("1\n2");
        assertEquals(3, sum);
    }

    @Test
    public void add_shouldReturnSix_WhenGivenNumbersStringAreOneTwoAndThreeWithNextLineAndCommaDelimiter(){
        StringCalculator stringCalculator = new StringCalculator();
        int sum = stringCalculator.add("1\n2,3");
        assertEquals(6, sum);
    }
}
