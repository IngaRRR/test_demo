package lt.inga.pom.tests.seleniumeasy;

import lt.inga.pom.pages.seleniumeasy.BasicFirstFormPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicFirstFormTest {

    @BeforeMethod  // paleidziamas pries kiekviena metoda
    public void setUp() {   // pradzioj uzsikraus sitas metodas

        BasicFirstFormPage.open();
    }

    @Test
    public void testSingleInputField() {

        String message = "Labas vakaras";
        String expectedResult = "Labas vakaras";
        String actualResult;

        BasicFirstFormPage.enterMessage(message);
        BasicFirstFormPage.clickOnButtonShowMessage();
        actualResult = BasicFirstFormPage.readMessage();

        Assert.assertEquals(actualResult, expectedResult);
    }


//    @Test
//    public void testTwoInputFieldsPositive() {
//
//        String enterA = "10";
//        String enterB = "15";
//        String expectedResult = "25";
//        String actualResult;
//
//        WebElement inputNumberA = driver.findElement(By.xpath("//input[@id='sum1']")); // xpath
//        inputNumberA.sendKeys(enterA);
//
//        WebElement inputNumberB = driver.findElement(By.xpath("//input[@id='sum2']")); // xpath
//        inputNumberB.sendKeys(enterB);
//
//        WebElement buttonSubmit = driver.findElement(By.xpath("//button[contains(text(),'Get Total')]"));
//
//        buttonSubmit.click();
//
//        WebElement spanDisplay = driver.findElement(By.xpath("//span[@id='displayvalue']"));
//        actualResult = spanDisplay.getText(); // 25
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//    @Test
//    public void testTwoInputFieldsNegative() {
//
//        String enterA = "10";
//        String enterB = "abc";
//        String expectedResult = "NaN";
//        String actualResult;
//
//        WebElement inputNumberA = driver.findElement(By.xpath("//input[@id='sum1']")); // xpath
//        inputNumberA.sendKeys(enterA);
//
//        WebElement inputNumberB = driver.findElement(By.xpath("//input[@id='sum2']")); // xpath
//        inputNumberB.sendKeys(enterB);
//
//        WebElement buttonSubmit = driver.findElement(By.xpath("//button[contains(text(),'Get Total')]"));
//
//        buttonSubmit.click();
//
//        WebElement spanDisplay = driver.findElement(By.xpath("//span[@id='displayvalue']"));
//        actualResult = spanDisplay.getText(); // 25
//        Assert.assertEquals(actualResult, expectedResult);
//    }

    @AfterMethod   // uzdarymo metodas
    public void tearDown() {
        BasicFirstFormPage.closeDriver();
    }

}
