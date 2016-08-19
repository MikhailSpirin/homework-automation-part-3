package com.wix.automationtraining.greetingcards;

/**
 * Created by mikhails on 19.08.2016
 */
public class BirthdayCard extends Card{

    public BirthdayCard(int age) {
        setAge(age);
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 1; // for babies!
        } else if (age > 100) {
            System.out.println("you're kidding me, it's a error");
            this.age = 100;
        } else this.age = age;
    }

    @Override
    public String getGreeting() {
        return super.GREETING + " Today is you birthday! You're " + this.age;
    }

    @Override
    public Shapes getShape() {
        return Shapes.BOOKLET;
    }
}
