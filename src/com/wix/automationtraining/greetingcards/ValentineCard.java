package com.wix.automationtraining.greetingcards;

/**
 * Created by mikhails on 19.08.2016
 */
public class ValentineCard extends Card {

    public ValentineCard(String girlName, String customizedGreeting) {
       setGirlName(girlName);
       setCustomizedGreeting(customizedGreeting);
    }

    private String girlName;
    private String customizedGreeting;

    // getters
    public String getCustomizedGreeting() {
        return customizedGreeting;
    }

    public String getGirlName() {
        return girlName;
    }

    // setters
    public void setCustomizedGreeting(String customizedGreeting) {
        if (customizedGreeting.equals("")) {
            this.customizedGreeting = super.GREETING;
        } else this.customizedGreeting = customizedGreeting;
    }

    public void setGirlName(String girlName) {
        this.girlName = girlName;
    }

    @Override
    public String getGreeting() {
        return customizedGreeting + " Love you, " + girlName;
    }

    @Override
    public Shapes getShape() {
        return Shapes.PINE;
    }
}
