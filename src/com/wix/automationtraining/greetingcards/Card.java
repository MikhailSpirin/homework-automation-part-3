package com.wix.automationtraining.greetingcards;

/**
 * Created by mikhails on 19.08.2016
 */
abstract public class Card {
    protected final String GREETING = "We greet you!";
    public abstract String getGreeting();
    public abstract Shapes getShape();

    enum Shapes{
        HEARTSHAPE,
        PINE,
        BOOKLET
    }
}
