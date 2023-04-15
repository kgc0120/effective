package com.inflearn.effective.item03;

import com.inflearn.effective.item03.field.IElvis;

/**
 * @author bumblebee
 */
public class MockElvis implements IElvis {

    @Override
    public void leaveTheBuilding() {

    }

    @Override
    public void sing() {
        System.out.println("You ain`t nothin` but a hound dog.");
    }
}
