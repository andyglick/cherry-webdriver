package io.magentys.examples;

import io.magentys.webdriver.WebScreen;
import io.magentys.webdriver.WebScreenFactory;
import io.magentys.webdriver.annotations.Url;

@Url("https://magentys.gitbooks.io/cherry/content/")
public class CherryFrameworkDocs extends WebScreen {

     public TableOfContents toc = new WebScreenFactory().init(new TableOfContents());

     public MainChapterContent mainChapterContent = new WebScreenFactory().init(new MainChapterContent());

}
