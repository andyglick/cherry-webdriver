package io.magentys.webdriver.missions;

import io.magentys.webdriver.WebScreen;
import io.magentys.webdriver.WebScreenElement;
import org.openqa.selenium.By;

/**
 * Created by kostasmamalis on 02/05/16.
 */
public class WebDriverMissions {

    public static Locate locate(By by){ return new Locate(by); }

    public static Locate locate(WebScreenElement webScreenElement) {
        return new Locate((By) webScreenElement.getLocator().value());
    }

    public static NavigateTo navigateTo(final WebScreen webScreen) {
        return new NavigateTo(webScreen);
    }

}
