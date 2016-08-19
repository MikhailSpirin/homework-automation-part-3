package com.wix.automationtraining.trickortreat;

/**
 * Created by mikhails on 19.08.2016
 */
public class NumbersTricks {
    public static void main(String[] args) {
        System.out.println("Initiating array");
        Trickortreat testArray = new Trickortreat();

        System.out.print("Wanna see it? ");
        System.out.println(testArray.numbersShowTime());

        System.out.print("calculate total ");
        System.out.println(testArray.calculateTotal());

        System.out.print("calculate total with add 13 - ");
        System.out.println(testArray.calculateTotal(13));

        System.out.print("go to string? ");
        testArray.convertToName();
        System.out.println(testArray.stringsShowTime());

        System.out.print("how much it is there? |");
        System.out.println(testArray.getNumOccurances());

        System.out.print("equals two ints - 3 and 3 - ");
        System.out.println(testArray.equals(3,3));

        System.out.print("equals two strings - '5' and '5' - ");
        System.out.println(testArray.equals('5', '5'));
    }
}
