package io.magentys.webdriver;

import org.openqa.selenium.By;

public class WebDriverLocator implements Locator<By> {

    private By value;

    @Override
    public By value() {
        return value;
    }

    @Override
    public void setValue(By value) {
        this.value = value;
    }

    public WebDriverLocator(By value){
        setValue(value);
    }

    public static By getByFor(Locator locator){
        return (By) locator.value();
    }
}

