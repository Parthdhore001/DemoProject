package utils;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    public static WebDriver driver;

    public static void launchBrowser() {
    	
    		//WebDriverManager.chromedriver().setup(); 
    	 	ChromeOptions options = new ChromeOptions();
        	options.addArguments("--incognito");
       
        	driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    public static void quitBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}