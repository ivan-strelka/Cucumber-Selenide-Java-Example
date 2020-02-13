package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {

    private SelenideElement emailInput = $(By.xpath("//input[@id='form_email']"));
    private SelenideElement passwordInput = $(By.xpath("//input[@id='form_password']"));


    public void typeEmailInput(String email) {

        this.emailInput.val(email);

    }

    public void typePasswordInput(String password) {

        this.passwordInput.val(password);

    }


}
