package lt.inga.pom.pages.demoqa;

import lt.inga.pom.pages.Common;
import lt.inga.pom.pages.Locators;

public class TextBoxPage {
    public static void open() {
        Common.setUpDriver();
        Common.openUrl("https://demoqa.com/text-box");
    }

    public static void closeDriver() {
        Common.closeDriver();
    }

    public static void enterFullName(String text) {
        Common.sendKeysToElement(
                Locators.Demoqa.TextBox.inputUserName,
                text
        );
    }

    public static void clickOnButtonSubmit() {
        Common.clickOnElement(Locators.Demoqa.TextBox.buttonSubmit);
    }

    public static String readFullNameMessage() {
        return Common.getTextFromElement(Locators.Demoqa.TextBox.paragraphName);
    }

    public static void enterEmailAdress(String email) {
        Common.sendKeysToElement(
                Locators.Demoqa.TextBox.inputUserEmail,
                email
        );
    }

    public static String readEmailMessage() {
        return Common.getTextFromElement(
                Locators.Demoqa.TextBox.paragraphEmail
        );
    }
}

