package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Ex3 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.google.com");
        driver.manage().window().maximize();

        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.id("initialView")));
        wait3.until(ExpectedConditions.elementToBeClickable(By.id("identifierId")));
        WebElement Emailph = driver.findElement(By.id("identifierId"));
        Emailph.sendKeys("artyom.harutyunyan@nteams.com");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement Pass = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        Pass.sendKeys("Arta147123");
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();

        WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body")));


        driver.findElement(By.cssSelector("[value*='document.querySelectorAll('table')[document.querySelectorAll('table').length - 1']"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[5]/div/div/div/div/div[2]/div/div[1]/div/div/div[5]/div[1]/div/table/tbody/tr[1]")).click();

    }
}