package lt.inga.pom.tests.demoqa;

import lt.inga.pom.pages.demoqa.TextBoxPage;
import lt.inga.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        TextBoxPage.open();
    }

    @Test
    public void testFullNameInput_FullNameValueInga() {

        String messageFullName = "Inga Rukiene";
        String expectedResult = "Inga Rukiene";
        String actualResult;

        TextBoxPage.enterFullName(messageFullName);
        TextBoxPage.clickOnButtonSubmit();
        actualResult = TextBoxPage.readFullNameMessage();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResult)
        );
    }

    @Test
    public void testEmailInput_WithValidEmail() {
        String messageEmail = "kerinti.saule@gmail.com";
        String expectedResult = ":kerinti.saule@gmail.com";
        String actualResult;

        TextBoxPage.enterEmailAdress(messageEmail); // irasom maila
        TextBoxPage.clickOnButtonSubmit();// nuspaudziam mygtuka
        actualResult = TextBoxPage.readEmailMessage();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResult)
        );
    }


}
