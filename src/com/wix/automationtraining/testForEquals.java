package com.wix.automationtraining;

/**
 * Created by mikhails on 19.08.2016
 */

public class testForEquals {
    public static void main(String[] args) {
        Address add = new Address("karla", "dnepr", "-", 25, 15);
        Student std1 = new Student("Mikha", add, 123123, 18, 1009, 18.5);
        Student std2 = new Student("Mikha", add, 123123, 18, 1009, 18.5);

        System.out.println(std1);
        System.out.println(std2);
        System.out.println(std1 == std2); //? says false, should be true
    }
}
