package com.slug.design;

import com.slug.design.observer.CurrentConditionsDisplay;
import com.slug.design.observer.WeatherData;
import org.junit.Test;

/**
 * Created by sluggarddd on 2015/11/18.
 */
public class TestObserver {


    @Test
    public void testObserver(){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);


        weatherData.setMesureMents(3,4,5);
    }
}
