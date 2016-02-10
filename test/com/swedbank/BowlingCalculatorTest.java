package com.swedbank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingCalculatorTest {
    BowlingCalculator bowlingCalculator;
    @Before
    public void setUp(){
        bowlingCalculator = new BowlingCalculator();
    }


    @Test
    public void testScoreNumber() throws Exception{
        assertTrue("it had to add 2",bowlingCalculator.roll(2));
        assertFalse("it shouldnt add -5", bowlingCalculator.roll(-5));

        //   assertEquals("Score is 6", 6, bowlingCalculator.roll(6));
    }

    @Test
    public void testGetResult() throws Exception{


//        assertEquals("Result is sum of scores", "", bowlingCalculator.getResult());
    }

    @Test
    public void testFrameHasScore(){

    }



}