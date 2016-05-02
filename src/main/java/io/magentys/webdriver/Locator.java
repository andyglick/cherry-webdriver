package io.magentys.webdriver;

public interface Locator<T> {

    public T value();
    public void setValue(T t);

}

