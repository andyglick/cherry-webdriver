package io.magentys.webdriver;

import io.magentys.screens.Screen;
import io.magentys.screens.annotations.ScreenElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kostasmamalis on 02/05/16.
 */
public class WebScreen implements Screen{
    private List<ScreenElement> screenElements = new ArrayList<ScreenElement>();

    private String url;

    public List<ScreenElement> screenElements() {
        return screenElements;
    }

    public Screen addScreenElements(ScreenElement... screenElements){
        for(ScreenElement screenElement : screenElements){
            if(!this.screenElements.contains(screenElement)){
                this.screenElements.add(screenElement);
            }
        }
        return this;
    }

    public ScreenElement getScreenElementWithAlias(String alias) {
        for(ScreenElement screenElement : screenElements){
            if(alias.equalsIgnoreCase(screenElement.getAlias())) return screenElement;
        }
        throw new RuntimeException("element not found for getAlias '" + alias + "'. Available ones are: " + screenElements);
    }

    public void addScreenElement(ScreenElement screenElement) {
        screenElements.add(screenElement);
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
