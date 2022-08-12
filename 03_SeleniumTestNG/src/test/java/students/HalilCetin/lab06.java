package students.HalilCetin;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab06 {
    //go to http://demo.guru99.com/test/newtours/register.php
    // click on country dropdown and select Barbados with Select Method
    //Use 3 different Select Method (visible text,index,value)
    //and switch to another countries as you wish
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/newtours/register.php");

    }
    @Test
    public void dropDownCountrySelect() {
        WebElement dropDown = driver.findElement(By.cssSelector("select[name='country']"));
        dropDown.click();
        Select dropDownSelect = new Select(dropDown);
        //By Index
        dropDownSelect.selectByIndex(20);
        System.out.println(dropDownSelect.getFirstSelectedOption().getText());
        //By Value
        dropDownSelect.selectByValue("BARBADOS");
        //By Text
        dropDownSelect.selectByVisibleText("KIRIBATI");
    }

        @AfterMethod
                public void endOfTheTest(){
            driver.quit();
        }



}
