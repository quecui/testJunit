//package com.uet;

import junit.framework.TestCase;

public class TestGame extends TestCase {
    private Ship fighter;
    public void setUp()  {
        this.fighter = new Ship("001");
    }

    public void testCreateFighter() {
        System.out.println("Begin testCreateFigher()");
        assertEquals("002", this.fighter.getId());
        System.out.println("End testCreateFighter()");
    }


}
