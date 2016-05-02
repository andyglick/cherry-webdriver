package io.magentys.webdriver.missions;

import org.openqa.selenium.By;

/**
 * Created by kostasmamalis on 02/05/16.
 */
public class WebDriverMissions {

    public static Locate locate(final By by) { return new Locate(by); }

}
