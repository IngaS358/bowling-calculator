package com.swedbank;

import java.util.ArrayList;
import java.util.List;

public  class BowlingCalculator {

    public int totalScore;

    List<RollFrame> frameList = new ArrayList<RollFrame>();


    public boolean roll(int score) {
        if(score<=10 && score >=0)
            return true;
        else return false;
    }

    public int getResult() {
        return totalScore ;
    }
}
