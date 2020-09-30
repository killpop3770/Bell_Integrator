package com.google.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleBeforeSearch {

    protected WebDriver driver;
    private WebElement inputField;
    private WebElement inputField2;

    public GoogleBeforeSearch(WebDriver driver){
        this.driver = driver;
        try
        {
            this.inputField = driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
        }
        catch (Exception e){e.printStackTrace();}
    }

    public void findOpen(String key){
        inputField.click();
        inputField.sendKeys(key);
        inputField.sendKeys(Keys.ENTER);

        inputField2 = driver.findElement(By.xpath("//h3[@class=\"LC20lb DKV0Md\"]"));
        inputField2.click();
    }

}
