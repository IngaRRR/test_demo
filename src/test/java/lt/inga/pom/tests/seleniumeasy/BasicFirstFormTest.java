package lt.inga.pom.tests.seleniumeasy;

import lt.inga.pom.pages.seleniumeasy.BasicFirstFormPage;
import lt.inga.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicFirstFormTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
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

    @Test
    public void testTwoInputFieldsPositive() {

        String inputA = "10";
        String inputB = "15";
        String expectedResult = "25";
        String actualResult;

        BasicFirstFormPage.enterValueA(inputA);
        BasicFirstFormPage.enterValueB(inputB);
        BasicFirstFormPage.clickOnButtonGetTotal();
        actualResult = BasicFirstFormPage.readMessageTotal();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTwoInputFieldsNegative() {

        String inputA = "10";
        String inputB = "abc";
        String expectedResult = "NaN";
        String actualResult;

        BasicFirstFormPage.enterValueA(inputA);
        BasicFirstFormPage.enterValueB(inputB);
        BasicFirstFormPage.clickOnButtonGetTotal();
        actualResult = BasicFirstFormPage.readMessageTotal();

        Assert.assertEquals(actualResult, expectedResult);
    }


}
