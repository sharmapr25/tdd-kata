package com.kata;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit test for string calculator  .
 */
public class StringCalculatorTest
{
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

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
    };

    @Test
    public void add_shouldReturnThree_WhenGivenInputHaveNumberOneAndTwo(){
        StringCalculator stringCalculator = new StringCalculator();
        int sum = stringCalculator.add("1,2");
        assertEquals(3, sum);
    };

    @Test
    public void add_shouldReturnThree_WhenGivenNumbersStringAreOneAndTwoWithNextLineDelimiter() {
        StringCalculator stringCalculator = new StringCalculator();
        int sum = stringCalculator.add("1\n2");
        assertEquals(3, sum);
    };

    @Test
    public void add_shouldReturnSix_WhenGivenNumbersStringAreOneTwoAndThreeWithNextLineAndCommaDelimiter(){
        StringCalculator stringCalculator = new StringCalculator();
        int sum = stringCalculator.add("1\n2,3");
        assertEquals(6, sum);
    };

    @Test
    public void add_shouldReturnThree_WhenGivenNumbersStringAreOneAndTwoWithDefinedCustomDelimiter() {
        StringCalculator stringCalculator = new StringCalculator();
        int sum = stringCalculator.add("//;\n1;2");
        assertEquals(3, sum);
    };

    @Test
    public void add_shouldThrowNegativeNumbersAreNotAllowed_WhenGivenInputHasMultipleNegativeNumbers() {
        StringCalculator stringCalculator = new StringCalculator();
        exceptionRule.expect(NegativeNumbersAreNotAllowedException.class);
        exceptionRule.expectMessage("negatives are not allowed -1 -2");
        stringCalculator.add("-1,-2");
    };

    @Test
    public void getCalledCount_shouldReturnZero_whenAddMethodNeverGetInvoked(){
        StringCalculator stringCalculator = new StringCalculator();
        int countOfAddMethodCalls = stringCalculator.getCalledCount();
        assertEquals(0, countOfAddMethodCalls);
    };

    @Test
    public void getCalledCount_shouldReturnOne_whenAddMethodGetInvokedOneTime() {
        StringCalculator stringCalculator = new StringCalculator();
        stringCalculator.add("");
        int countOfAddMethodCalls = stringCalculator.getCalledCount();
        assertEquals(1, countOfAddMethodCalls);
    };
}
