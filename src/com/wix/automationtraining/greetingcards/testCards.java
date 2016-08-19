package com.wix.automationtraining.greetingcards;

/**
 * Created by mikhails on 19.08.2016
 */
public class testCards {
    public static void main(String[] args) {

        ValentineCard valentine = new ValentineCard("Mary", "Love you!");
        ValentineCard valentine2 = new ValentineCard("Ann", "");
        HolidayCard holiday1 = new HolidayCard("Christmas");
        BirthdayCard grandmaBirthday = new BirthdayCard(95);

        System.out.println(valentine.getGreeting() + " --- " + valentine.getShape());
        System.out.println(valentine2.getGreeting() + " --- " + valentine2.getShape());
        System.out.println(holiday1.getGreeting());
        System.out.println(grandmaBirthday.getGreeting());


    }
}
