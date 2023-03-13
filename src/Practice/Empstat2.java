package Practice;

import org.junit.Test;
import Practice.GmailPageObj;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.zeromq.ZThread;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Empstat2 {
    @Test
    public void EmpSt() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(ops);
        driver.manage().window().maximize();

        driver.get("https://app.nativeteams.com/login");
        EmpstatLogin log = PageFactory.initElements(driver, EmpstatLogin.class);
        log.enterEmail("artyom.harutyunyan+32@nteams.com");
        log.enterPassword("Password1!");
        Empstat1 emp = PageFactory.initElements(driver, Empstat1.class);

        emp.employedstatus();
        emp.setupempstatus();
        emp.asd("0.5", "1000000");



//        emp.asd();
//        emp.Albania("10", "50000");




    }
}

