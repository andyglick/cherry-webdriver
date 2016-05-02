package io.magentys;

import io.magentys.data.MyScreen;
import io.magentys.webdriver.WebScreenFactory;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static io.magentys.webdriver.WebDriverLocator.getByFor;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class WebScreenFactoryTest {

    MyScreen screen;

    @Before
    public void setUp() throws Exception {
        screen = new WebScreenFactory().init(new MyScreen());

    }

    @Test
    public void shouldSetDefaultUrl() throws Exception {
        assertThat(screen.getUrl(), is("http://cherryframe.work"));
    }

    @Test
    public void shouldSetDefaultValueAliasAndLocator() throws Exception {
        assertThat(screen.first.getAlias(), is("My first element"));
        assertThat(screen.first.getDefaultValue(), is("test"));
        assertThat(getByFor(screen.first.getLocator()), is(By.id("test")));
        assertThat(screen.second.getAlias(), is("My second element"));
        assertThat(screen.second.getDefaultValue(), is("test2"));
        assertThat(getByFor(screen.second.getLocator()), is(By.id("test2")));
    }

}

