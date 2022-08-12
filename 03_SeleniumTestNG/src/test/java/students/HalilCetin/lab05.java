package students.HalilCetin;


import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab05 {
    //Go to Amazon //enter Desk in search box //Then search for desks (Use this task with TestNG framework)
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.Amazon.com/");
    }
    @Test
    public void TC1(){
        WebElement searchBox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        String searchItem="desks";
        searchBox.sendKeys(searchItem, Keys.ENTER);
        boolean b=driver.getTitle().contains(searchItem);
        Assert.assertTrue(b);

        System.out.println(driver.getTitle());

    }
    @AfterMethod
    public void closing() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();

        
    }

}
