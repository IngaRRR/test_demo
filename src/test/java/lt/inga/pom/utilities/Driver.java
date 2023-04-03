package lt.inga.pom.utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver {

    private static WebDriver driver; // sukurem objekta

    public static void setDriver(){ // seteris

        WebDriverManager.chromedriver().setup();// susetapinam
//      System.setProperty("webdriver.http.factory", "jdk-http-client");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("start-maximized"); // puslapis per visa langa
        options.addArguments("--force-device-scale-factor=0.75"); // keicia zooma, sumazina iki 70 %, jei didinti 50 % - 1.5

        driver = new ChromeDriver(options);  // sukuriam objekta, irasom options i skliaustus
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public static WebDriver getDriver() { // geteris, kad pasiimti elementa
        return driver;
    }
    public static void closeDriver(){ // uzdarymo metodas
        driver.quit();
    }

}
