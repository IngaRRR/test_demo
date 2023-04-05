package lt.inga.pom.pages.seleniumeasy;

import lt.inga.pom.pages.Common;
import org.openqa.selenium.By;

public class BasicFirstFormPage {

    public static void open() {
        Common.setUpDriver();
        Common.openUrl("http://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    public static void closeDriver() {
        Common.sleep(3000);
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

    public static void enterValueA(String value) {
        Common.sendKeysToElement(
                By.xpath("//input[@id='value1']"),
                value
        );
    }

    public static void enterValueB(String value) {
        Common.sendKeysToElement(
                By.xpath("//input[@id='value2']"),
                value
        );
    }

    public static void clickOnButtonGetTotal() {
        Common.clickOnElement(
                By.xpath("//button[contains(text(),'Get Total')]"));
            }

    public static String readMessageTotal() {
        return Common.getTextFromElement(By.xpath("//span[@id='displayvalue']"));
    }
}
