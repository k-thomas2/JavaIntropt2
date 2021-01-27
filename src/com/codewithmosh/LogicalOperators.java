package com.codewithmosh;

public class LogicalOperators {
    public static void main(String[] args){
        int temperature = 22;
        boolean isWarm = temperature > 20  && temperature < 30;
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord; //has high income or good credit and does not have criminal record
    }
}
