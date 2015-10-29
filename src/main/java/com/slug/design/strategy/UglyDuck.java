package com.slug.design.strategy;

/**
 * Created by sluggarddd on 2015/10/30.
 */
public class UglyDuck extends Duck {

    public UglyDuck(){
        flyBehavior = new FlyWithWings();
        quarkBehavior = new QuarkLoadly();
    }
}
