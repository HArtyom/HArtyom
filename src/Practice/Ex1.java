package Practice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new
        driver.get("http://www.amazon.com");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement Jabrasearch = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        Jabrasearch.sendKeys("Jabra");
        WebElement searchbutton = driver.findElement(By.xpath(" //*[@id=\"nav-search-submit-button\"]"));
        searchbutton.click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2")));
        WebElement elem2click= driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span    "));
        elem2click.click();
        WebElement addtocartbutton= driver.findElement(By.xpath("//*[@id=\"atc-declarative\"]"));
        addtocartbutton.click();

        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://mail.google.com");
        driver.switchTo().window(tabs.get(0));
        driver.close();
        //driver.quit();

    }
}

