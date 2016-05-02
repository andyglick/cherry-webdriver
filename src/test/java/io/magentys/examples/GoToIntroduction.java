package io.magentys.examples;

import io.magentys.Agent;
import io.magentys.Mission;
import io.magentys.webdriver.WebScreenFactory;
import org.openqa.selenium.WebElement;

import static io.magentys.webdriver.missions.WebDriverMissions.*;


public class GoToIntroduction implements Mission<Agent> {

    CherryFrameworkDocs cherryFrameworkDocs = new WebScreenFactory().init(new CherryFrameworkDocs());
    @Override
    public Agent accomplishAs(Agent agent) {
        navigateTo(cherryFrameworkDocs).accomplishAs(agent);
        WebElement webElement = locate(cherryFrameworkDocs.toc.introductionLink).accomplishAs(agent);
        webElement.click();
        return agent;
    }


}
