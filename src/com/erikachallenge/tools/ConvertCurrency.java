package com.erikachallenge.tools;

import java.util.Scanner;

public class ConvertCurrency {
    public static void convert(String currencyToConvert, String currencyConverted, RequestAPI request, Scanner keyboard){
      double value;

      Request requestNow = request.requestCurrency(currencyToConvert,currencyConverted);
      System.out.println("Please indicate the amount you need to convert ");
      value = keyboard.nextDouble();
      double finalValue = value * requestNow.conversion_rate();
      System.out.println(value +" "+ currencyToConvert+ " are equivalent to "+ finalValue+" "+ currencyConverted);
    }


}
