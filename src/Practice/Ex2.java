package Practice;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class Ex2 {

    public static void main(String[] args) throws InterruptedException {

//        System.setProperty("webdriver.chrome.driver", " C:\\Users\\User\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//        WebDriver driver = new EdgeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");


        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(ops);

        driver.get("https://nativeteams.com/pricing");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(700);
        js.executeScript("scrollBy(0, 400)");
        Thread.sleep(700);

        WebElement cookieaccept = driver.findElement(By.xpath("//*[@id=\"cookieModal\"]/div/div/div/div/div/div/div/button[1]"));
        cookieaccept.click();

        driver.findElement(By.xpath("//*[@id=\"individuals-tab-pane\"]/div/div[1]/div/div[4]/div/a")).click();
        WebDriverWait createaccountwait = new WebDriverWait(driver, Duration.ofSeconds(5));
        createaccountwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"start-free-modal\"]/div/div")));
        createaccountwait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#start-free-modal > div > div")));
        WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"free-input-first-name\"]"));
        FirstName.sendKeys("Afr");
        WebElement LastName = driver.findElement(By.xpath("//*[@id=\"free-input-last-name\"]"));
        LastName.sendKeys("Test");
        WebElement Email = driver.findElement(By.xpath("//*[@id=\"free-input-email\"]"));

        LocalDateTime myObj = LocalDateTime.now();
        String cdate = myObj.toString();
        cdate = cdate.replaceAll(":", "").replaceAll("-", "").replaceAll("-", "").replace(".", "").replaceAll("T", "");

        String currentMail = String.format("artyom.harutyunyan+%s", cdate + "@nteams.com");
        Email.sendKeys(currentMail);

        WebElement Password = driver.findElement(By.xpath("//*[@id=\"free-input-password\"]"));
        Password.sendKeys("Password1!");
        driver.findElement(By.xpath("//*[@id=\"btn-start-free\"]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"start-free-success-modal\"]/div/div/button")).click();
        Thread.sleep(3000);
        js.executeScript("scrollBy(0, 500)");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"crisp-chatbox\"]/div/a/span[1]/span/span/span/span[1]/span/span[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#individuals-tab-pane > div > div:nth-child(3) > div > div.bottomm > div.button")).click();
        Thread.sleep(500);

        WebElement FirstNameRem = driver.findElement(By.xpath("//*[@id=\"input-first-name\"]"));
        FirstNameRem.sendKeys("Arem");
        WebElement LastNameRem = driver.findElement(By.xpath("//*[@id=\"input-last-name\"]"));
        LastNameRem.sendKeys("Test");

        WebElement EmailRem = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        LocalDateTime myObjrem = LocalDateTime.now();
        String cdate2 = myObjrem.toString();
        cdate2 = cdate2.replaceAll(":", "").replaceAll("-", "").replaceAll("-", "").replace(".", "").replaceAll("T", "");
        String currentMail2 = String.format("artyom.harutyunyan+%s", cdate2 + "@nteams.com");
        EmailRem.sendKeys(currentMail2);

        WebElement PasswordRem = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        PasswordRem.sendKeys("Password1!");
        driver.findElement(By.xpath("//*[@id=\"btn-register\"]")).click();

        Thread.sleep(4000);
        WebElement Coupon = driver.findElement(By.cssSelector("#coupon-code-input"));
        Coupon.sendKeys("productteam");
        driver.findElement(By.xpath("//*[@id=\"btn-check-code\"]/div")).click();
        Thread.sleep(1000);
        WebElement CardHolder = driver.findElement(By.xpath("//*[@id=\"billing-card-name\"]"));
        CardHolder.sendKeys("Pelagonian Limited");

        driver.switchTo().frame(0);
        WebElement numbercard = driver.findElement(By.xpath("//*[@id=\"root\"]/form/span[2]/div/div[2]/span/input"));
        numbercard.sendKeys("5116743567844845");
        driver.switchTo().parentFrame();
        Thread.sleep(1000);
        driver.switchTo().frame(1);
        WebElement ExpiryDate = driver.findElement(By.xpath("//*[@id=\"root\"]/form/span[2]/span/input"));
        ExpiryDate.sendKeys("07/24");
        driver.switchTo().parentFrame();
        Thread.sleep(1000);
        driver.switchTo().frame(2);
        WebElement CVC = driver.findElement(By.xpath("//*[@id=\"root\"]/form/span[2]/span/input"));
        CVC.sendKeys("106");
        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("//*[@id=\"btn-checkout\"]")).click();
        Thread.sleep(15000);
        driver.findElement(By.xpath("//*[@id=\"start-free-success-modal\"]/div/div/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"teams-tab\"]")).click();

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        Thread.sleep(700);
        js2.executeScript("scrollBy(0, 400)");
        Thread.sleep(700);

        driver.findElement(By.xpath("//*[@id=\"teams-tab-pane\"]/div/div[2]/div/div[4]/div[2]/a")).click();
        Thread.sleep(3000);
        WebElement EmpFirstName = driver.findElement(By.xpath("//*[@id=\"input-first-name\"]"));
        EmpFirstName.sendKeys("Aemp");
        WebElement EmpLastName = driver.findElement(By.xpath("//*[@id=\"input-last-name\"]"));
        EmpLastName.sendKeys("Test");

        WebElement EmpEmail = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        LocalDateTime myObjemp = LocalDateTime.now();
        String cdate3 = myObjemp.toString();
        cdate3 = cdate3.replaceAll(":", "").replaceAll("-", "").replaceAll("-", "").replace(".", "").replaceAll("T", "");
        String currentMail3 = String.format("artyom.harutyunyan+%s", cdate3 + "@nteams.com");
        EmpEmail.sendKeys(currentMail3);

        WebElement EmpPassword = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        EmpPassword.sendKeys("Password1!");
        driver.findElement(By.xpath("//*[@id=\"btn-register\"]")).click();
        Thread.sleep(4000);

        WebElement CouponEmp = driver.findElement(By.cssSelector("#coupon-code-input"));
        CouponEmp.sendKeys("productteam");
        driver.findElement(By.xpath("//*[@id=\"btn-check-code\"]/div")).click();
        Thread.sleep(1000);
        WebElement CardHolderEmp = driver.findElement(By.xpath("//*[@id=\"billing-card-name\"]"));
        CardHolderEmp.sendKeys("Pelagonian Limited");

        driver.switchTo().frame(0);
        WebElement numbercardEmp = driver.findElement(By.xpath("//*[@id=\"root\"]/form/span[2]/div/div[2]/span/input"));
        numbercardEmp.sendKeys("5116743567844845");
        driver.switchTo().parentFrame();
        Thread.sleep(1000);
        driver.switchTo().frame(1);
        WebElement ExpiryDateEmp = driver.findElement(By.xpath("//*[@id=\"root\"]/form/span[2]/span/input"));
        ExpiryDateEmp.sendKeys("07/24");
        driver.switchTo().parentFrame();
        Thread.sleep(1000);
        driver.switchTo().frame(2);
        WebElement CVCEmp = driver.findElement(By.xpath("//*[@id=\"root\"]/form/span[2]/span/input"));
        CVCEmp.sendKeys("106");
        driver.switchTo().parentFrame();

        driver.findElement(By.xpath("//*[@id=\"btn-checkout\"]")).click();
        Thread.sleep(12000);
        driver.findElement(By.xpath("//*[@id=\"start-free-success-modal\"]/div/div/button")).click();

        //*****************MAIL************************************************************************************

        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://mail.google.com");

        WebDriverWait mailtabwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        mailtabwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("initialView")));
        mailtabwait.until(ExpectedConditions.elementToBeClickable(By.id("identifierId")));
        WebElement Emailph = driver.findElement(By.id("identifierId"));
        Emailph.sendKeys("artyom.harutyunyan@nteams.com");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement Pass = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        Pass.sendKeys("Arta147123");
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();

        WebDriverWait mailviewwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        mailviewwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body")));


    }

}


