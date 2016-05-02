package io.magentys.webdriver;

import io.magentys.screens.Screen;
import io.magentys.screens.ScreenFactory;
import io.magentys.screens.annotations.Alias;
import io.magentys.webdriver.annotations.DefaultValue;
import io.magentys.webdriver.annotations.LocateBy;
import io.magentys.webdriver.annotations.Url;
import org.openqa.selenium.By;

import java.lang.reflect.Field;

public class WebScreenFactory extends ScreenFactory {


    @Override
    protected <T extends Screen> void instantiateAndRemember(T screen, Field field) throws IllegalAccessException {
        String aliasValue = field.isAnnotationPresent(Alias.class) ? field.getAnnotation(Alias.class).value() : null;
        String defaultValue = field.isAnnotationPresent(DefaultValue.class) ? field.getAnnotation(DefaultValue.class).value() : null;

        if (screen.getClass().isAnnotationPresent(Url.class)) {
            String url = screen.getClass().getAnnotation(Url.class).value();
            ((WebScreen) screen).setUrl(url);
        }

        if (isElement(field)) {
            By by = getBy(field);
            WebScreenElement screenElement = new WebScreenElement();
            screenElement.withAlias(aliasValue).withDefaultValue(defaultValue);
            screenElement.withLocator(new WebDriverLocator(by));
            field.set(screen, screenElement);
            screen.addScreenElement(screenElement);
        }
    }

    private static By getBy(Field field) {
        boolean locatorAnnotationIsPresent = field.isAnnotationPresent(LocateBy.class);
        LocateBy annotation = field.getAnnotation(LocateBy.class);
        if (locatorAnnotationIsPresent) {

            if (isNotEqualToDefaultValue(annotation.id())) {
                return By.id(annotation.id());
            }
            if (isNotEqualToDefaultValue(annotation.name())) {
                return By.name(annotation.name());
            }
            if (isNotEqualToDefaultValue(annotation.xpath())) {
                return By.xpath(annotation.xpath());
            }
            if (isNotEqualToDefaultValue(annotation.css())) {
                return By.cssSelector(annotation.css());
            }
            if (isNotEqualToDefaultValue(annotation.className())) {
                return By.className(annotation.className());
            }
            if (isNotEqualToDefaultValue(annotation.linkText())) {
                return By.linkText(annotation.linkText());
            }
            if (isNotEqualToDefaultValue(annotation.partialLinkText())) {
                return By.partialLinkText(annotation.partialLinkText());
            }
        }
        throw new RuntimeException("Couldn't initialize Screen");
    }

    private static boolean isNotEqualToDefaultValue(String s) {
        return !s.equals(LocateBy.defaultValue);
    }
}
