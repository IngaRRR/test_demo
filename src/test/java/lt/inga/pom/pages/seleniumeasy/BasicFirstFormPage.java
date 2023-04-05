package lt.inga.pom.pages.seleniumeasy;

import lt.inga.pom.pages.Common;
import lt.inga.pom.pages.Locators;

public class BasicFirstFormPage {

    public static void open() {
        Common.setUpDriver();
        Common.openUrl("http://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

       public static void enterMessage(String message) {
        Common.sendKeysToElement(
                Locators.SeleniumEasy.BasicFirstForm.inputUserMessage,
                message
        );
    }

    public static void clickOnButtonShowMessage() {

        Common.clickOnElement(Locators.SeleniumEasy.BasicFirstForm.buttonShowMessage);
    }

    public static String readMessage() {

        return Common.getTextFromElement(Locators.SeleniumEasy.BasicFirstForm.spanDisplay);
    }

    public static void enterValueA(String value) {
        Common.sendKeysToElement(Locators.SeleniumEasy.BasicFirstForm.inputValueA,
                value
        );
    }

    public static void enterValueB(String value) {
        Common.sendKeysToElement(
                Locators.SeleniumEasy.BasicFirstForm.inputValueB,
                value
        );
    }

    public static void clickOnButtonGetTotal() {
        Common.clickOnElement(
                Locators.SeleniumEasy.BasicFirstForm.buttonGetTotal);
    }

    public static String readMessageTotal() {
        return Common.getTextFromElement(Locators.SeleniumEasy.BasicFirstForm.spanDisplayTotal);
    }
}
