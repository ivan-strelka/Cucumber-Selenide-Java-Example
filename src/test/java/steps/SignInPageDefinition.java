package steps;

import io.cucumber.java.en.Then;
import pages.SignInPage;

import static config.UserConfig.USER_EMAIL;
import static config.UserConfig.USER_PASSWORD;

public class SignInPageDefinition {

    SignInPage signInPage = new SignInPage();

    @Then("User type email on Sign in page")
    public void userTypeEmailSignInPage() {
        signInPage.typeEmailInput(USER_EMAIL);


    }

    @Then("User type password on Sign in page")
    public void userTypePasswordSignInPage() {
        signInPage.typePasswordInput(USER_PASSWORD);

    }


}
