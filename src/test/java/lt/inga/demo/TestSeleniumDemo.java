package lt.inga.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSeleniumDemo {
    WebDriver driver;

    @BeforeMethod  // paleidziamas pries kiekviena metoda
    public void setUp() {   // pradzioj uzsikraus sitas metodas

        WebDriverManager.chromedriver().setup();// susetapinam
//      System.setProperty("webdriver.http.factory", "jdk-http-client");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("start-maximized"); // puslapis per visa langa
        options.addArguments("--force-device-scale-factor=0.75"); // keicia zooma, sumazina iki 70 %, jei didinti 50 % - 1.5

        driver = new ChromeDriver(options);  // sukuriam objekta, irasom options i skliaustus
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8)); // kiek laiko laukiam, butinai virs driver.get
        driver.get("https://demoqa.com/text-box");
    }

    @Test
    public void seleniumDemo() {


    }

    @Test
    public void testFullNameInput_FullNameValueInga() {

        String messageFullName = "Inga Rukiene";
        String expectedResult = "Inga Rukiene";
        String actualResult;

        WebElement inputUserName = driver.findElement(By.xpath("//input[@id='userName']")); // xpath
        inputUserName.sendKeys(messageFullName);  // iraso informacija

        WebElement buttonSubmit = driver.findElement(By.xpath("//button[@id='submit']")); // susirandam mygtuka
        buttonSubmit.click();

        WebElement paragraphName = driver.findElement(By.xpath("//p[@id='name']"));
        actualResult = paragraphName.getText(); // Name:Inga Rukiene

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResult)
        );
    }

    @AfterMethod   // uzdarymo metodas
    public void tearDown() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {  // alt ir Enter - try cach
            e.printStackTrace();            // irasom papildomai
            Thread.currentThread().interrupt();
        }
        driver.quit();
    }
}
