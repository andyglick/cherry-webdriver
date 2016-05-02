package io.magentys.data;

import io.magentys.screens.annotations.Alias;
import io.magentys.webdriver.WebScreen;
import io.magentys.webdriver.WebScreenElement;
import io.magentys.webdriver.annotations.DefaultValue;
import io.magentys.webdriver.annotations.LocateBy;
import io.magentys.webdriver.annotations.Url;

@Url("http://cherryframe.work")
public class MyScreen extends WebScreen {

    @DefaultValue("test")
    @LocateBy(id = "test")
    @Alias("My first element")
    public WebScreenElement first;


    @DefaultValue("test2")
    @LocateBy(id = "test2")
    @Alias("My second element")
    public WebScreenElement second;


}
