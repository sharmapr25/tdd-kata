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
}
