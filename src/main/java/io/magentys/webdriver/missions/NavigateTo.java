package io.magentys.webdriver.missions;

import io.magentys.Agent;
import io.magentys.Mission;
import io.magentys.webdriver.WebScreen;
import org.openqa.selenium.WebDriver;

/**
 * Created by kostasmamalis on 02/05/16.
 */
public class NavigateTo implements Mission<Agent> {

    private String url;

    public NavigateTo(final WebScreen webScreen){
        this.url = webScreen.getUrl();
    }

    @Override
    public Agent accomplishAs(Agent agent) {
        WebDriver webDriver = agent.usingThe(WebDriver.class);
        webDriver.get(url);
        return agent;
    }
}
