package lt.inga.pom.pages;

import org.openqa.selenium.By;

public class Locators {
    public class Demoqa {
        public class TextBox {
            public static By inputUserName = By.xpath("//input[@id='userName']");

            public static By buttonSubmit = By.xpath("//button[@id='submit']");
            public static By paragraphName = By.xpath("//p[@id='name']");
            public static By inputUserEmail = By.xpath("//input[@id='userEmail']");

            public static By paragraphEmail = By.xpath("//p[@id='email']");
        }
    }

    public static class SeleniumEasy {
        public static class BasicFirstForm {
            public static By inputUserMessage = By.xpath("//input[@id='user-message']");
            public static By buttonShowMessage = By.xpath("//form[@id='get-input']//button");
            public static By spanDisplay = By.xpath("//span[@id='display']");
            public static By inputValueA = By.xpath("//input[@id='value1']");
            public static By inputValueB = By.xpath("//input[@id='value2']");
            public static By buttonGetTotal = By.xpath("//button[contains(text(),'Get Total')]");

            public static By spanDisplayTotal = By.xpath("//span[@id='displayvalue']");
        }
    }
}
