package com.slug.design.observer;

/**
 * Created by sluggarddd on 2015/11/17.
 */
public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObserver();
}
