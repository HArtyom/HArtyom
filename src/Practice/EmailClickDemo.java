package Practice;


import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;

public class EmailClickDemo {

    @Test
    public void clickEmail() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mail.google.com");
        GmailPageObj gp= PageFactory.initElements(driver, GmailPageObj.class);
        gp.enterEmail("nemfr4@gmail.com");//Replace with your email id
        gp.enterPassword("Marcel123456");//Replace with your password
        gp.clickEmail("Security alert");//Replace with email subject you want to click


    }

}
