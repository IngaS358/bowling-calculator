package com.swedbank;

/**
 * Created by p998iuc on 2016.02.09.
 */
public class RollFrame {

    private String firstRoll;
    private String secondRoll;


    public void RollFrame(String firstRoll, String secondRoll){
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
    }
    public String getFirstRoll() {
        return firstRoll;
    }

    public String getSecondRoll() {
        return secondRoll;
    }

    public void setFirstRoll(String firstRoll) {
        this.firstRoll = firstRoll;
    }

    public void setSecondRoll(String secondRoll) {
        this.secondRoll = secondRoll;
    }


}

