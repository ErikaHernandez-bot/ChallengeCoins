package com.erikachallenge.principal;

import com.erikachallenge.tools.ConvertCurrency;
import com.erikachallenge.tools.RequestAPI;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        RequestAPI request = new RequestAPI();
        int option = 0;


        String menu = """
                    ***Write the number of your preferred option***
                    1- Mexican Peso to Singapore Dollar
                    2- Singapore to Mexican Peso
                    3- Mexican Peso to Canadian Dollar
                    4- Canadian Dollar to Mexican Peso
                    5- Mexican Peso to Danish Krone
                    6- Danish Krone to Mexican Peso
                    9- Exit
                    """;
        while( option != 9) {
            System.out.println("***********************");
            System.out.println(menu);
            option = keyboard.nextInt();
            //Print the option type as the machine receive what the customer is giving
            System.out.println(((Object)option).getClass().getSimpleName());


            switch (option){
                case 1:
                    ConvertCurrency.convert("MXN","SGD",request,keyboard);
                    break;
                case 2:
                    ConvertCurrency.convert("SGD","MXN",request,keyboard);
                    break;
                case 3:
                    ConvertCurrency.convert("MXN","CAD",request,keyboard);
                    break;
                case 4:
                    ConvertCurrency.convert("CAD","MXN",request,keyboard);
                    break;
                case 5:
                    ConvertCurrency.convert("MXN","DKK",request,keyboard);
                    break;
                case 6:
                    ConvertCurrency.convert("DKK","MXN",request,keyboard);
                    break;
            }

            }
        }

    }
