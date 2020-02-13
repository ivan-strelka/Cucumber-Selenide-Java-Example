package steps;

import io.cucumber.java.Before;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;

public class Hooks {


    @Before
    public void setUp() {
        baseUrl = "https://grinfer.com";
        open("/home");
        browser = "chrome";
        browserSize = "1000x500";
        timeout = 5000;
        screenshots = false;
        savePageSource = false;
        clearBrowserLocalStorage();
        clearBrowserCookies();


    }


}
