package io.magentys.webdriver;

import io.magentys.screens.annotations.ScreenElement;

/**
 * Created by kostasmamalis on 02/05/16.
 */
public class WebScreenElement implements ScreenElement{
    private String alias;
    private String defaultValue;
    private Locator locator;
    private String memoryKey;

    @Override
    public String getAlias() {
        return alias;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public Locator getLocator() {
        return locator;
    }

    public ScreenElement withAlias(String alias){
        this.alias = alias;
        return this;
    }

    public ScreenElement withDefaultValue(String defaultValue){
        this.defaultValue = defaultValue;
        return this;
    }

    @Override
    public ScreenElement withMemoryKey(String memoryKey) {
        this.memoryKey = memoryKey;
        return this;
    }

    public ScreenElement withLocator(Locator locator){
        this.locator = locator;
        return this;
    }
}
