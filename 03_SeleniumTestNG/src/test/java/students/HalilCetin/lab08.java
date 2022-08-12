package students.HalilCetin;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab08 {
    //1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php Step 2) Enter Any Customer id. Step 3) After entering the customer ID, Click on the “Submit” button. Step 4) Reject/accept the alert.
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/delete_customer.php");

    }
    @Test
    public void TC1() {
        WebElement custIDbox = driver.findElement(By.cssSelector("input[name='cusid']"));
        custIDbox.sendKeys("Halil21");
        WebElement submitButton = driver.findElement(By.cssSelector("input[value='Submit']"));
        submitButton.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }

        @AfterMethod
                public void endOfTheTest(){
            driver.quit();
        }



    }


