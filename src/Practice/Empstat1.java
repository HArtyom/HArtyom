package Practice;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Empstat1 {
    private WebDriver driver;
    @FindBy(how= How.XPATH, xpath="//*[@id=\"app\"]/div/main/div/div[1]/div[1]/nav/div[2]/ul[3]/li[1]/a/span")
    WebElement employedstatus;
    @FindBy(how=How.XPATH, xpath="//*[@id=\"app\"]/div/main/div/div[1]/div[2]/div/div[1]/div/button")
    WebElement setupempstatus;
    @FindBy(how=How.XPATH, xpath="//*[@id=\"app\"]/div/main/div/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[1]/form/ul/li[1]")
    WebElement Albania;
    @FindBy(how=How.XPATH, xpath="//*[@id=\"app\"]/div/main/div/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[1]/form/ul/li[2]")
    WebElement Armenia;

    @FindBy(how=How.XPATH, xpath="//*[@id=\"app\"]/div/main/div/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[1]/form/ul/li")
    WebElement asd;

    @FindBy(how=How.XPATH, xpath="//*[@id=\"app\"]/div/main/div/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/div[3]/button")
    WebElement Continue;
    @FindBy(how=How.XPATH, xpath="//*[@id=\"app\"]/div/main/div/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/div[1]/div[2]/button")
    WebElement Calculate;
    @FindBy(how=How.XPATH, xpath="//*[@id=\"app\"]/div/main/div/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/div[1]/div[2]/div[1]/input")
    WebElement inputAlb;
    @FindBy(how=How.XPATH, xpath="//*[@id=\"app\"]/div/main/div/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/div[3]/button[2]")
    WebElement CalcContinue;








    public Empstat1(WebDriver driver)
    {
        this.driver=driver;
    }

//    String[] countries = {Albania, Armenia };




    public void employedstatus()
    {
        waitForVisible(driver, employedstatus);
        Actions actions=new Actions(driver);
        actions.moveToElement(employedstatus);
        actions.click();
        actions.build().perform();
    }

//    public void asd(){
//        waitForVisible(driver, asd);
//        Actions actions=new Actions(driver);
//        actions.moveToElement(asd);
//
//        int count = driver.findElements(By.className("countries-selection-list")).size();
//        for (int i = 0; i <= count; i++) {
//        String name = String.valueOf(driver.findElements(By.className("countries-selection-list")).getClass());
//
//        if (name.isEmpty()) {
//        driver.findElements(By.className("countries-selection-list")).get(i).click();
//            break;
//
//        }
//
//        }
//    }

    public void asd(String belowmin, String abovemin){
//        List<WebElement> qwe = driver.findElements(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[1]/form/ul/li"));
//        WebElement q;
//
//        for(WebElement j: qwe){
            System.out.println(asd);


            List<WebElement> countries = driver.findElements(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[1]/form/ul"));
            for( int i = 0; i < countries.size(); i++)
            {

//                countries = driver.findElements(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[1]/form/ul"));
                countries.get(i).click();
                System.out.print(countries.get(i));


            waitForVisible(driver, asd);
            Actions actions=new Actions(driver);
            actions.moveToElement(asd).click().perform();
            waitForVisible(driver, Continue);
            actions.moveToElement(Continue).click().perform();
            waitForVisible(driver, inputAlb);
            actions.moveToElement(inputAlb).click();
            actions.sendKeys(belowmin);
            actions.moveToElement(Calculate).click().perform();
//            driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/p[1]"));
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
//            wait.until(ExpectedConditions.textToBePresentInElement(j, "Please enter a value above the minimum wage."));
//            System.out.println("Pop-up error massage present");
            Actions actions78 = new Actions(driver);

            actions78.click(driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[2]/form/div[2]/div[1]/div[2]/div[1]/input")))
                    .keyDown(Keys.CONTROL)
                    .sendKeys("a")
                    .keyUp(Keys.CONTROL)
                    .sendKeys(Keys.BACK_SPACE)
                    .build()
                    .perform();
            Actions actions2 = new Actions(driver);
            actions2.moveToElement(inputAlb).click().perform();
            actions2.sendKeys(abovemin);
            actions.build().perform();
            actions2.moveToElement(Calculate).click().perform();
            waitForVisible(driver, CalcContinue);
            actions2.moveToElement(CalcContinue).click().perform();
//            driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/div[2]/div/div[1]/div[2]/div/div/div/img"));
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//            wait.until(visibilityOfElementLocated(locator));

            driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]")).click();
            driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]")).click();
//            driver.navigate().back();

//            j.click();
            }
        }
    //}


//for (int j = 1; j <= TotalCount; j++) {
//        WebElement CustomfieldsTextBox = driver.findElement(By.xpath("(//div[@class='fourcolumns']//div//textarea)[" + j + "]"));
//        CustomfieldsTextBox.clear();
//        CustomfieldsTextBox.sendKeys("Testing");
//    }


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
