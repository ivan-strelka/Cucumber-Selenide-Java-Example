package steps;

import io.cucumber.java.en.Then;
import pages.BasePage;

public class BasicPageDefinition {

    BasePage basePage = new BasePage();

    @Then("Click {string} button on Main Page")
    public void clickButtonOnMainPage(String nameButton) {
        basePage.clickElement(nameButton);
    }


    @Then("click {string} button on Sign in page")
    public void clickButtonSingInOnSingInPage(String nameButton) {
        basePage.clickSpan(nameButton);

    }


    @Then("User sees {string} text content")
    public void userSeesTextContent(String arg0) {
        basePage.visibleElement(arg0);

    }
}
