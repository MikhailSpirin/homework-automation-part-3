package com.wix.automationtraining.greetingcards;

/**
 * Created by mikhails on 19.08.2016
 */
public class HolidayCard extends Card {

    public HolidayCard(String holidayType) {
        setHolidayType(holidayType);
    }

    private String holidayType;

    public String getHolidayType() {
        return holidayType;
    }

    public void setHolidayType(String holidayType) {
        this.holidayType = holidayType;
    }

    @Override
    public String getGreeting() {
        return super.GREETING + " You have such a wonderful holiday today - " + this.holidayType;
    }

    @Override
    public Shapes getShape() {
        return Shapes.PINE;
    }
}
