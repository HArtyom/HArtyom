package Daily;


import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDateTime;


public class SignUp {

        private WebDriver driver;

        @FindBy(how= How.XPATH, xpath="//*[@id=\"individuals-tab-pane\"]/div[3]/div/div[4]")
        WebElement StartFree;
        @FindBy(how= How.XPATH, xpath="//*[@id=\"free-input-first-name\"]")
        WebElement FreeFirstName;
        @FindBy(how= How.XPATH, xpath="//*[@id=\"free-input-last-name\"]")
        WebElement FreeLastName;
        @FindBy(how= How.XPATH, xpath="//*[@id=\"free-input-email\"]")
        WebElement FreeEmail;
        @FindBy(how= How.XPATH, xpath="//*[@id=\"free-input-password\"]")
        WebElement FreePass;
        @FindBy(how= How.XPATH, xpath="//*[@id=\"btn-start-free\"]")
        WebElement FreeSignButton;
        @FindBy(how= How.XPATH, xpath="//*[@id=\"start-free-success-modal\"]/div/div/button")
        WebElement FreeModalClose;
        @FindBy(how= How.XPATH, xpath="//*[@id=\"individuals-tab-pane\"]/div[1]/div[2]/div/div[4]/div[2]")
        WebElement GetPaym;
        @FindBy(how= How.XPATH, xpath="//*[@id=\"input-first-name\"]")
        WebElement PaymFN;
        @FindBy(how= How.XPATH, xpath="//*[@id=\"input-last-name\"]")
        WebElement PaymLN;
        @FindBy(how= How.XPATH, xpath="//*[@id=\"input-email\"]")
        WebElement PaymEmail;
        @FindBy(how= How.XPATH, xpath="//*[@id=\"input-password\"]")
        WebElement PaymPass;
        @FindBy(how= How.XPATH, xpath="//*[@id=\"btn-register\"]")
        WebElement PaymPrToCheckout;
        @FindBy(how= How.XPATH, xpath="//*[@id=\"coupon-code-input\"]")
        WebElement PaymCouponCode;
        @FindBy(how= How.XPATH, xpath="//*[@id=\"billing-card-name\"]")
        WebElement PaymCardHolder;
        @FindBy(how= How.XPATH, xpath="//*[@id=\"root\"]/form/span[2]/div/div[2]/span/input")
        WebElement PaymCardNumber;
        @FindBy(how= How.XPATH, xpath="//*[@id=\"root\"]/form/span[2]/span/input")
        WebElement PaymExpiryDate;
        @FindBy(how= How.XPATH, xpath="//*[@id=\"root\"]/form/span[2]/span/input")
        WebElement PaymCVC;
        @FindBy(how= How.XPATH, xpath="//*[@id=\"billing-form\"]/div[5]/div[2]")
        WebElement PaymProceed;
        @FindBy(how= How.XPATH, xpath="//*[@id=\"start-free-success-modal\"]/div/div")
        WebElement SuccRegModal;
        @FindBy(how= How.XPATH, xpath="//*[@id=\"start-free-success-modal\"]/div/div/button")
        WebElement PaymModalclose;
        @FindBy(how= How.XPATH, xpath="//*[@id=\"individuals-tab-pane\"]/div[1]/div[3]/div/div[4]/div[2]")
        WebElement GetRem;
        @FindBy(how= How.XPATH, xpath="//*[@id=\"individuals-tab-pane\"]/div[1]/div[4]/div/div[4]/div[2]")
        WebElement GetTax;
        @FindBy(how= How.XPATH, xpath="//*[@id=\"teams-tab\"]")
        WebElement ForTeams;
        @FindBy(how= How.XPATH, xpath="//*[@id=\"teams-tab-pane\"]/div/div[1]/div/div[4]/div[2]")
        WebElement GetCN;
        @FindBy(how= How.XPATH, xpath="//*[@id=\"teams-tab-pane\"]/div/div[2]/div/div[4]/div[2]")
        WebElement GetEmp;

        public SignUp(WebDriver driver) {this.driver=driver;}

        public void StartFree()
        {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("scrollBy(0, 400)");
                waitForVisible(driver, StartFree);
                Actions actions=new Actions(driver);
                actions.moveToElement(StartFree);
                actions.click();
                actions.build().perform();

        }

        public void FreeFirstName(String FirstName)
        {
                waitForVisible(driver, FreeFirstName);
                Actions actions=new Actions(driver);
                actions.moveToElement(FreeFirstName);
                actions.click();
                actions.build().perform();
                FreeFirstName.sendKeys(FirstName);
        }
        public void FreeLastName(String LastName)
        {
                waitForVisible(driver, FreeLastName);
                Actions actions=new Actions(driver);
                actions.moveToElement(FreeLastName);
                actions.click();
                actions.build().perform();
                FreeLastName.sendKeys(LastName);

        }
        public void FreeEmail()
        {
                waitForVisible(driver, FreeEmail);
                Actions actions=new Actions(driver);
                actions.moveToElement(FreeEmail);
                actions.click();
                actions.build().perform();
                LocalDateTime myObjemp = LocalDateTime.now();
                String Freedate = myObjemp.toString();
                Freedate = Freedate.replaceAll(":", "").replaceAll("-", "").replaceAll("-", "").replace(".", "").replaceAll("T", "");
                String Fremail = String.format("artyom.harutyunyan+%s", Freedate + "@nteams.com");
                FreeEmail.sendKeys(Fremail);
        }
        public void FreePass(String Pass)
        {
                waitForVisible(driver, FreePass);
                Actions actions=new Actions(driver);
                actions.moveToElement(FreePass);
                actions.click();
                actions.build().perform();
                FreePass.sendKeys(Pass);
        }
        public void FreeSignButton()
        {
                waitForVisible(driver, FreeSignButton);
                Actions actions=new Actions(driver);
                actions.moveToElement(FreeSignButton);
                actions.click();
                actions.build().perform();
        }
        public void FreeModalClose()
        {
                waitForVisible(driver, FreeModalClose);
                Actions actions=new Actions(driver);
                actions.moveToElement(FreeModalClose);
                actions.click();
                actions.build().perform();
        }
        public void GetPaym()
        {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("scrollBy(0, 400)");
                waitForVisible(driver, GetPaym);
                Actions actions=new Actions(driver);
                actions.moveToElement(GetPaym);
                actions.click();
                actions.build().perform();
        }
        public void PaymFN(String FirstName)
        {
                waitForVisible(driver, PaymFN);
                Actions actions=new Actions(driver);
                actions.moveToElement(PaymFN);
                actions.click();
                actions.build().perform();
                PaymFN.sendKeys(FirstName);
        }
        public void PaymLN(String LastName)
        {

                waitForVisible(driver, PaymLN);
                Actions actions=new Actions(driver);
                actions.moveToElement(PaymLN);
                actions.click();
                actions.build().perform();
                PaymLN.sendKeys(LastName);
        }
        public void PaymEmail()
        {
                waitForVisible(driver, PaymEmail);
                Actions actions=new Actions(driver);
                actions.moveToElement(PaymEmail);
                actions.click();
                actions.build().perform();
                LocalDateTime myObjemp = LocalDateTime.now();
                String Paymdate = myObjemp.toString();
                Paymdate = Paymdate.replaceAll(":", "").replaceAll("-", "").replaceAll("-", "").replace(".", "").replaceAll("T", "");
                String Paymemail = String.format("artyom.harutyunyan+%s", Paymdate + "@nteams.com");
                PaymEmail.sendKeys(Paymemail);
        }
        public void PaymPass(String Pass)
        {
                waitForVisible(driver, PaymPass);
                Actions actions=new Actions(driver);
                actions.moveToElement(PaymPass);
                actions.click();
                actions.build().perform();
                PaymPass.sendKeys(Pass);
        }
        public void PaymPrToCheckout()
        {
                waitForVisible(driver, PaymPrToCheckout);
                Actions actions=new Actions(driver);
                actions.moveToElement(PaymPrToCheckout);
                actions.click();
                actions.build().perform();
        }
        public void PaymCouponCode(String Couponcode)
        {
                waitForVisible(driver, PaymCouponCode);
                Actions actions=new Actions(driver);
                actions.moveToElement(PaymCouponCode);
                actions.click();
                actions.build().perform();
                PaymCouponCode.sendKeys(Couponcode);
                driver.findElement(By.xpath("//*[@id=\"btn-check-code\"]")).click();
        }

        public void PaymCardHolder(String HolderName)
        {
                waitForVisible(driver, PaymCardHolder);
                Actions actions=new Actions(driver);
                actions.moveToElement(PaymCardHolder);
                actions.click();
                actions.build().perform();
                PaymCardHolder.sendKeys(HolderName);
        }
        public void PaymCardNumber(String CardNumber)
        {
                driver.switchTo().frame(0);
                waitForVisible(driver, PaymCardNumber);
                Actions actions=new Actions(driver);
                actions.moveToElement(PaymCardNumber);
                actions.click();
                actions.build().perform();
                PaymCardNumber.sendKeys(CardNumber);
                driver.switchTo().parentFrame();

        }

        public void PaymExpiryDate(String ExpiryDate)
        {
                driver.switchTo().frame(1);
                waitForVisible(driver, PaymExpiryDate);
                Actions actions=new Actions(driver);
                actions.moveToElement(PaymExpiryDate);
                actions.click();
                actions.build().perform();
                PaymExpiryDate.sendKeys(ExpiryDate);
                driver.switchTo().parentFrame();

        }
        public void PaymCVC(String CVC)
        {
                driver.switchTo().frame(2);
                waitForVisible(driver, PaymCVC);
                Actions actions=new Actions(driver);
                actions.moveToElement(PaymCVC);
                actions.click();
                actions.build().perform();
                PaymExpiryDate.sendKeys(CVC);
                driver.switchTo().parentFrame();
        }
        public void PaymProceed()
        {

                waitForVisible(driver, PaymProceed);
                Actions actions=new Actions(driver);
                actions.moveToElement(PaymProceed);
                actions.click();
                actions.build().perform();
        }
        public void SuccRegModal()
        {
                waitForVisible(driver, SuccRegModal);
                Actions actions=new Actions(driver);
                actions.moveToElement(SuccRegModal);
        }


        public void PaymModalclose()
        {
                waitForVisible(driver, PaymModalclose);
                Actions actions=new Actions(driver);
                actions.moveToElement(PaymModalclose);
                actions.click();
                actions.build().perform();
        }
        public void GetRem()
        {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("scrollBy(0, 400)");
                waitForVisible(driver, GetRem);
                Actions actions=new Actions(driver);
                actions.moveToElement(GetRem);
                actions.click();
                actions.build().perform();
        }

        public void GetTax()
        {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("scrollBy(0, 400)");
                waitForVisible(driver, GetTax);
                Actions actions=new Actions(driver);
                actions.moveToElement(GetTax);
                actions.click();
                actions.build().perform();
        }
        public void ForTeams()
        {
                waitForVisible(driver, ForTeams);
                Actions actions=new Actions(driver);
                actions.moveToElement(ForTeams);
                actions.click();
                actions.build().perform();
        }
        public void GetCN()
        {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("scrollBy(0, 400)");
                waitForVisible(driver, GetCN);
                Actions actions=new Actions(driver);
                actions.moveToElement(GetCN);
                actions.click();
                actions.build().perform();
        }
        public void GetEmp()
        {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("scrollBy(0, 400)");
                waitForVisible(driver, GetEmp);
                Actions actions=new Actions(driver);
                actions.moveToElement(GetEmp);
                actions.click();
                actions.build().perform();
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




