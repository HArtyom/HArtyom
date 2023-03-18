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
            ((JavascriptExecutor) driver).executeScript("window.open()");
            ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));
            driver.get("https://nativeteams.com/pricing");
        }
        else{
            driver.get("https://www-stage.nativeteams.com/pricing");
            Thread.sleep(10000);
        }
        WebElement cookieaccept = driver.findElement(By.xpath("//*[@id=\"cookieModal\"]/div/div/div/div/div/div/div/button[1]"));
        cookieaccept.click();

        SignUp sign = PageFactory.initElements(driver, SignUp.class);
        sign.StartFree();
        sign.FreeFirstName("Afr");
        sign.FreeLastName("Test");
        sign.FreeEmail();
        sign.FreePass("Password1!");
        sign.FreeSignButton();
        sign.SuccRegModal();
        sign.FreeModalClose();
        sign.GetPaym();
        sign.PaymFN("Apay");
        sign.PaymLN("Test");
        sign.PaymEmail();
        sign.PaymPass("Password1!");
        sign.PaymPrToCheckout();
        sign.PaymCouponCode("productteam");
        sign.PaymCardHolder("Pelagonian Limited");
        sign.PaymCardNumber("5116743567844845");
        sign.PaymExpiryDate("0724");
        sign.PaymCVC("106");
        sign.PaymProceed();
        sign.SuccRegModal();
        sign.PaymModalclose();
        sign.GetRem();
        sign.PaymFN("Arem");
        sign.PaymLN("Test");
        sign.PaymEmail();
        sign.PaymPass("Password1!");
        sign.PaymPrToCheckout();
        sign.PaymCouponCode("productteam");
        sign.PaymCardHolder("Pelagonian Limited");
        sign.PaymCardNumber("5116743567844845");
        sign.PaymExpiryDate("0724");
        sign.PaymCVC("106");
        sign.PaymProceed();
        sign.SuccRegModal();
        sign.PaymModalclose();
        sign.GetTax();
        sign.PaymFN("Atax");
        sign.PaymLN("Test");
        sign.PaymEmail();
        sign.PaymPass("Password1!");
        sign.PaymPrToCheckout();
        sign.PaymCouponCode("productteam");
        sign.PaymCardHolder("Pelagonian Limited");
        sign.PaymCardNumber("5116743567844845");
        sign.PaymExpiryDate("0724");
        sign.PaymCVC("106");
        sign.PaymProceed();
        sign.SuccRegModal();
        sign.PaymModalclose();
        sign.ForTeams();
        sign.GetCN();
        sign.PaymFN("Acn");
        sign.PaymLN("Test");
        sign.PaymEmail();
        sign.PaymPass("Password1!");
        sign.PaymPrToCheckout();
        sign.PaymCouponCode("productteam");
        sign.PaymCardHolder("Pelagonian Limited");
        sign.PaymCardNumber("5116743567844845");
        sign.PaymExpiryDate("0724");
        sign.PaymCVC("106");
        sign.PaymProceed();
        sign.SuccRegModal();
        sign.PaymModalclose();
        sign.ForTeams();
        sign.GetEmp();
        sign.PaymFN("Aemp");
        sign.PaymLN("Test");
        sign.PaymEmail();
        sign.PaymPass("Password1!");
        sign.PaymPrToCheckout();
        sign.PaymCouponCode("productteam");
        sign.PaymCardHolder("Pelagonian Limited");
        sign.PaymCardNumber("5116743567844845");
        sign.PaymExpiryDate("0724");
        sign.PaymCVC("106");
        sign.PaymProceed();
        sign.SuccRegModal();
        sign.PaymModalclose();

        if (!test){
            test = true;
            Daily();
        }

        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));

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
