package com.slug.design;

import com.slug.design.strategy.FlyWithHands;
import com.slug.design.strategy.UglyDuck;
import org.junit.Test;

/**
 * Created by sluggarddd on 2015/10/30.
 */
public class TestStrategy {

    @Test
    public void testDuck(){

        UglyDuck uglyDuck = new UglyDuck();

        uglyDuck.fly();
        uglyDuck.quark();

        uglyDuck.setFly(new FlyWithHands());
        uglyDuck.fly();

    }
}
