package com.swedbank;

import org.junit.Test;
import com.swedbank.RollFrame;

import static org.junit.Assert.*;

/**
 * Created by p998iuc on 2016.02.09.
 */
public class RollFrameTest {

    @Test
    public void rollFrameExists()throws Exception{
        RollFrame frame = new RollFrame();
        assertNotNull(frame);
    }

    @Test
    public void setedFirstRollMatchesFirstRoll()throws Exception{
        RollFrame rollFrame = new RollFrame();
        rollFrame.setFirstRoll(2);
        assertEquals("First roll is 2",2, rollFrame.getFirstRoll());
    }

    @Test
    public void setedSecondRollMatchesSecondRoll()throws Exception{
        RollFrame rollFrame = new RollFrame();
        rollFrame.setSecondRoll(2);
        assertEquals("First roll is 2",2, rollFrame.getSecondRoll());
    }


}