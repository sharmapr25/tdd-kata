package com.kata;

public class NegativeNumbersAreNotAllowedException extends RuntimeException{
  private String number;

  public NegativeNumbersAreNotAllowedException(String number){
    super();
    this.number = number;
  };

  @Override
  public String getMessage() {
    return "negatives are not allowed "+ number;
  }
}
