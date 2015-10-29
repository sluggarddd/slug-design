package com.slug.design.strategy;

/**
 * Created by sluggarddd on 2015/10/30.
 */
public class QuarkLoadly implements QuarkBehavior {
    @Override
    public void quark() {
        System.out.println("quark loudly");
    }
}
