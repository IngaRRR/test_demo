package lt.inga.pom.pages.seleniumeasy;

import lt.inga.pom.pages.Common;
import org.openqa.selenium.By;

public class BasicFirstFormPage {

    public static void open() {
        Common.setUpDriver();
        Common.openUrl("http://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    public static void closeDriver() {

        Common.closeDriver();
    }

    public static void enterMessage(String message) {
        Common.sendKeysToElement(
                By.xpath("//input[@id='user-message']"),
                message
        );
    }

    public static void clickOnButtonShowMessage() {

        Common.clickOnElement(By.xpath("//form[@id='get-input']//button"));
    }

    public static String readMessage() {

        return Common.getTextFromElement(By.xpath("//span[@id='display']"));
    }
}
