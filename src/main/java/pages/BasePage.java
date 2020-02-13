package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.conditions.Visible;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    public void clickElement(String text) {
        $(By.xpath("//div[contains(text(),'" + text + "')]")).click();
    }

    public void clickSpan(String text) {
        $(By.xpath("//span[text()='" + text + "']/..")).click();
    }

    public void visibleElement(String text) {
        $(By.xpath("//*[text()='" + text + "']")).shouldBe(Condition.appear);
    }


}
