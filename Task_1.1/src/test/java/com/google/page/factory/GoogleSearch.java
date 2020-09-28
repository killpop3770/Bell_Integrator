package com.google.page.factory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class GoogleSearch {

    private WebDriver driver;

    @FindBy(how = How.XPATH, using="//*[@class=\"gLFyf gsfi\"]")
    WebElement inputField;

    @FindAll(@FindBy(how = How.XPATH, using="//*[@class=\"LC20lb DKV0Md\"]/span"))
    List<WebElement> refs;

    public GoogleSearch(WebDriver driver){
        this.driver=driver;
    }

    public void findGladiola(String key){
        inputField.click();
        inputField.sendKeys(key);
        inputField.sendKeys(Keys.ENTER);
    }

    public List<WebElement> getRefs(){
        return refs;
    }

}
