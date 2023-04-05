package lt.inga.pom.tests;

import lt.inga.pom.pages.Common;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {

    @BeforeMethod
    public abstract void setUp(); // abstrakti klase

    @AfterMethod   // uzdarymo metodas
    public void tearDown() {
        Common.closeDriver();
    }
}
