package io.magentys.examples;

import io.magentys.screens.annotations.Alias;
import io.magentys.webdriver.WebScreen;
import io.magentys.webdriver.WebScreenElement;
import io.magentys.webdriver.annotations.LocateBy;

public class TableOfContents extends WebScreen {

    @Alias("Introduction Link")
    @LocateBy(css = "li[data-level='0'] a")
    public WebScreenElement introductionLink;

    @Alias("First Chapter")
    @LocateBy(css = "li[data-level='1'] a")
    public WebScreenElement firstChapter;

    /*
        more elements go here
     */
}
