package com.slug.design.strategy;

/**
 * Created by sluggarddd on 2015/10/30.
 */
public class Duck {

    FlyBehavior flyBehavior;
    QuarkBehavior quarkBehavior;

    public void fly() {
        flyBehavior.fly();
    }

    public void quark() {
        quarkBehavior.quark();
    }

    public void setFly(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

}
