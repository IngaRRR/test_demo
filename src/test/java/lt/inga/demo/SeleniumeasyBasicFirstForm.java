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

public class SeleniumeasyBasicFirstForm {

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
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    @Test
    public void testSingleInputField() {

        String message = "Labas vakaras";
        String expectedResult = "Labas vakaras";
        String actualResult;

        WebElement inputMessage = driver.findElement(By.xpath("//input[@id='user-message']")); // xpath
        inputMessage.sendKeys(message);
        WebElement buttonSubmit = driver.findElement(By.xpath("(//button)[2] ")); // //form[@id='get-input']
        // susirandam mygtuka
        buttonSubmit.click();

        WebElement spanDisplay = driver.findElement(By.xpath("//span[@id='display']"));
        actualResult = spanDisplay.getText(); // Labas vakaras
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTwoInputFieldsPositive() {

        String enterA = "10";
        String enterB = "15";
        String expectedResult = "25";
        String actualResult;

        WebElement inputNumberA = driver.findElement(By.xpath("//input[@id='sum1']")); // xpath
        inputNumberA.sendKeys(enterA);

        WebElement inputNumberB = driver.findElement(By.xpath("//input[@id='sum2']")); // xpath
        inputNumberB.sendKeys(enterB);

        WebElement buttonSubmit = driver.findElement(By.xpath("//button[contains(text(),'Get Total')]"));

        buttonSubmit.click();

        WebElement spanDisplay = driver.findElement(By.xpath("//span[@id='displayvalue']"));
        actualResult = spanDisplay.getText(); // 25
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testTwoInputFieldsNegative() {

        String enterA = "10";
        String enterB = "abc";
        String expectedResult = "NaN";
        String actualResult;

        WebElement inputNumberA = driver.findElement(By.xpath("//input[@id='sum1']")); // xpath
        inputNumberA.sendKeys(enterA);

        WebElement inputNumberB = driver.findElement(By.xpath("//input[@id='sum2']")); // xpath
        inputNumberB.sendKeys(enterB);

        WebElement buttonSubmit = driver.findElement(By.xpath("//button[contains(text(),'Get Total')]"));

        buttonSubmit.click();

        WebElement spanDisplay = driver.findElement(By.xpath("//span[@id='displayvalue']"));
        actualResult = spanDisplay.getText(); // 25
        Assert.assertEquals(actualResult, expectedResult);
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
