package com.leonelmperalta.jokes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Joke {
    private String setup;
    private String delivery;

    public Joke(){};

    public String getSetup() {
        return setup;
    }
    public void setSetup(String setup) {
        this.setup = setup;
    }
    public String getDelivery() {
        return delivery;
    }
    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }
}
