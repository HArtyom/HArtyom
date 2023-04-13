package Daily;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class Main {

    boolean test = false;

    @Test
    public void Daily() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        if (test){
            driver.get("https://nativeteams.com/pricing");
        }
        else{
            driver.get("https://www-stage.nativeteams.com/pricing");
            Thread.sleep(10000);
        }
        WebElement cookieaccept = driver.findElement(By.xpath("//*[@id=\"acceptCookies\"]"));
        cookieaccept.click();

        SignUp sign = PageFactory.initElements(driver, SignUp.class);
        sign.Signu();

        if (test){
            driver.get("https://app.nativeteams.com/login");
        }
        else{
            driver.get("https://stage.nativeteams.com/login");
            Thread.sleep(10000);
        }

        EmpStatus emp = PageFactory.initElements(driver, EmpStatus.class);
        emp.EmpStatus();

        if (!test){
            test = true;
            Daily();
        }

        System.exit(200);
    }

}
