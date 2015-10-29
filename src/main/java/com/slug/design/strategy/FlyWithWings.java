package com.slug.design.strategy;

/**
 * Created by sluggarddd on 2015/10/30.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly with wings");
    }
}
