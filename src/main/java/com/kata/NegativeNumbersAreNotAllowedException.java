package com.kata;

public class NegativeNumbersAreNotAllowedException extends RuntimeException{
  private String numbers;

  public NegativeNumbersAreNotAllowedException(String numbers){
    super();
    this.numbers = numbers;
  };

  @Override
  public String getMessage() {
    return "negatives are not allowed"+ numbers;
  }
}
