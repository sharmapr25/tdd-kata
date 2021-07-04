package com.kata;

public class NegativeNumbersAreNotAllowedException extends RuntimeException{
  public NegativeNumbersAreNotAllowedException(){
    super();
  };

  @Override
  public String getMessage() {
    return "negatives are not allowed";
  }
}
