package steps;

import io.cucumber.java.Before;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.clearBrowserCookies;

public class Hooks {

    @Before
    public void setUp() {
        baseUrl = "https://grinfer.com/";
        timeout = 5000;
        browser = "firefox";
        browserSize = "1000x800";
        screenshots = false;
        savePageSource = false;



        clearBrowserCookies();

    }


}
