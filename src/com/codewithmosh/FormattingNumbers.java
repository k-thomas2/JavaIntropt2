package com.codewithmosh;

import java.text.NumberFormat;

public class FormattingNumbers {
    public static void  main(String[] args){

        //currency formatting
       NumberFormat currency = NumberFormat.getCurrencyInstance();
       String result =  currency.format(123456.891);
        System.out.println(result);
        //percentage formatting
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.1);
        System.out.println(result2);
    }
}
