package com.google.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleBeforeSearch {
    protected WebDriver driver;
    private WebElement inputField;

    public GoogleBeforeSearch(WebDriver driver){
        this.driver=driver;
        this.inputField = driver.findElement(By.xpath("//*[@class=\"gLFyf gsfi\"]"));
    }

    public void findGladiola(String key){
        inputField.click();
        inputField.sendKeys(key);
        inputField.sendKeys(Keys.ENTER);
    }
}
