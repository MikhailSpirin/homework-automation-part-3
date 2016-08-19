package com.wix.automationtraining;

import java.util.Random;

/**
 * Created by mikhails on 19.08.2016
 */
public class Trickortreat {
    public Trickortreat() {
        for (int i = 0; i < 10; i++) {
            this.numbersArray[i] = (new Random()).nextInt(10);
        }
    }

    private int [] numbersArray = new int[10];
    private String [] textArray = new String[10];

    public int calculateTotal() {
        int result = 0;
        for (int item : this.numbersArray) {
            result += item;
        }
        return result;
    }

    public int calculateTotal(int additionalInt) {
        return calculateTotal() + additionalInt;
    }

    public String[] convertToName() {
        for (int i = 0; i < this.numbersArray.length ; i++) {
            switch (this.numbersArray[i]) {
                case 0: this.textArray[i] = "zero"; break;
                case 1: this.textArray[i] = "one"; break;
                case 2: this.textArray[i] = "two"; break;
                case 3: this.textArray[i] = "three"; break;
                case 4: this.textArray[i] = "four"; break;
                case 5: this.textArray[i] = "five"; break;
                case 6: this.textArray[i] = "six"; break;
                case 7: this.textArray[i] = "seven"; break;
                case 8: this.textArray[i] = "eight"; break;
                case 9: this.textArray[i] = "nine"; break;
                default: this.textArray[i] = "no such in db";
            }
        }
        return this.textArray;
    }

    public String getNumOccurances() {
        String result = "";
        for (int j = 0; j < 10; j++) {
            int count = 0;
            for (int item : this.numbersArray) {
                if (item == j) count += 1;
            }
            if (count > 0) result += j + " occur " + count + " time(s) | ";
        }
        return result;
    }

    public boolean equals(int int1, int int2) {
        return int1 == int2;
    }

    public boolean equals(String int1, String int2) {
        return Integer.parseInt(int1) == Integer.parseInt(int2);
    }

    // i didn't get the task)) here is what i think of it:
    public int[][] toTwoDimensional() {
        return new int[][]{numbersArray, numbersArray};
    }

    public String numbersShowTime() {
        String result = "";
        for (int item : numbersArray) {
            result += item + " ";
        }
        return result;
    }

    public String stringsShowTime() {
        String result = "";
        for (String item : textArray) {
            result += item + " ";
        }
        return result;
    }

}
