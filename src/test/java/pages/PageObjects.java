package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class PageObjects {
    SelenideElement boxA = $("#column-a");
    SelenideElement boxB = $("#column-b");
    // SelenideElement checkBox = $("#columns");

    public void drapAndDrop() {
        boxA.dragAndDropTo(boxB);
        // actions().moveToElement(boxA).clickAndHold().moveToElement(boxB).release().perform();
        // actions().moveToElement($("#column-a")).clickAndHold().moveToElement($("#column-b")).release().perform();
        //  actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(175, 0).release().perform();
    }

    public void checkBox() {
        boxA.shouldHave(text("B"));
        boxB.shouldHave(text("A"));
        // checkBox.$("header").shouldHave(text("B")).click();
    }
}
