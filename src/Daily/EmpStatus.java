package Daily;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EmpStatus {
    private WebDriver driver;
    @FindBy(how= How.XPATH, xpath="//*[@id=\"app\"]/div/main/div/div[1]/div[1]/nav/div[2]/ul[3]/li[1]/a/span")
    WebElement employedstatus;
    @FindBy(how=How.XPATH, xpath="//*[@id=\"app\"]/div/main/div/div[1]/div[2]/div/div[1]/div/button")
    WebElement setupempstatus;
    @FindBy(how=How.XPATH, xpath="//*[@id=\"app\"]/div/main/div/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[1]/form/ul/li[1]")
    WebElement Albania;
    @FindBy(how=How.XPATH, xpath="//*[@id=\"app\"]/div/main/div/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/div[3]/button")
    WebElement Continue;
    @FindBy(how=How.XPATH, xpath="//*[@id=\"app\"]/div/main/div/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/div[1]/div[2]/button")
    WebElement Calculate;
    @FindBy(how=How.XPATH, xpath="//*[@id=\"app\"]/div/main/div/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/div[1]/div[2]/div[1]/input")
    WebElement inputAlb;
    @FindBy(how=How.XPATH, xpath="//*[@id=\"app\"]/div/main/div/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/div[3]/button[2]")
    WebElement CalcContinue;



    public EmpStatus(WebDriver driver)
    {
        this.driver=driver;
    }

    public void employedstatus()
    {
        waitForVisible(driver, employedstatus);
        Actions actions=new Actions(driver);
        actions.moveToElement(employedstatus);
        actions.click();
        actions.build().perform();
    }

    public void setupempstatus()
    {
        waitForVisible(driver, setupempstatus);
        Actions actions=new Actions(driver);
        actions.moveToElement(setupempstatus);
        actions.click();
        actions.build().perform();
    }
    public void Albania(String belowmin, String abovemin) {
        waitForVisible(driver, Albania);
        Actions actions=new Actions(driver);
        actions.moveToElement(Albania).click().perform();
        waitForVisible(driver, Continue);
        actions.moveToElement(Continue).click().perform();
        waitForVisible(driver, inputAlb);
        actions.moveToElement(inputAlb).click();
        actions.sendKeys(belowmin);
        actions.moveToElement(Calculate).click().perform();

        Actions actions2 = new Actions(driver);
        actions2.moveToElement(inputAlb);
        actions2.click();
        actions2.sendKeys(abovemin);
        actions.build().perform();
        actions2.moveToElement(Calculate).click().perform();
        waitForVisible(driver, CalcContinue);
        actions2.moveToElement(CalcContinue).click().perform();

    }

        public void waitForVisible(WebDriver driver, WebElement element) {
        try {
            Thread.sleep(1000);
            System.out.println("Waiting for element visibility");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }



}
