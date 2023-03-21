package Daily;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

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
        WebElement cookieaccept = driver.findElement(By.xpath("//*[@id=\"cookieModal\"]/div/div/div/div/div/div/div/button[1]"));
        cookieaccept.click();

        SignUp sign = PageFactory.initElements(driver, SignUp.class);
        sign.Signu();

        if (!test){
            test = true;
            Daily();
        }

        driver.get("https://stage.nativeteams.com/login");
        Login logStage = PageFactory.initElements(driver, Login.class);
        logStage.enterEmail("artyom.harutyunyan+22@nteams.com");
        logStage.enterPassword("Password1!");
        EmpStatus empStage = PageFactory.initElements(driver, EmpStatus.class);
        empStage.employedstatus();
        empStage.setupempstatus();
        empStage.checkCountries("0.5", "250000");

        driver.get("https://app.nativeteams.com/login");
        Login log = PageFactory.initElements(driver, Login.class);
        log.enterEmail("artyom.harutyunyan+32@nteams.com");
        log.enterPassword("Password1!");
        EmpStatus emp = PageFactory.initElements(driver, EmpStatus.class);
        emp.employedstatus();
        emp.setupempstatus();
        emp.checkCountries("0.5", "250000");

        System.exit(200);
    }

}
