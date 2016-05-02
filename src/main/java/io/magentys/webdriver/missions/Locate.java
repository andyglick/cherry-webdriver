package io.magentys.webdriver.missions;

import io.magentys.Agent;
import io.magentys.Mission;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class Locate implements Mission<WebElement> {

    private final By by;

    public Locate(final By by){
        this.by = by;
    }

    @Override
    public WebElement accomplishAs(Agent agent) {
        WebDriver webDriver = agent.usingThe(WebDriver.class);
        return webDriver.findElement(by);
    }
}
