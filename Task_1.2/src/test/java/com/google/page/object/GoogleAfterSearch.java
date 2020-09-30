package com.google.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleAfterSearch extends GoogleBeforeSearch{

    List<WebElement> arrOfVal;

    public GoogleAfterSearch(WebDriver driver){
        super(driver);

        arrOfVal = driver.findElements(By.xpath("//span[@class=\"main-page-exchange__rate\"]"));
    }

    public boolean getCondition(){
        double a = Double.parseDouble(arrOfVal.get(0).getText().replace(",","."));
        double b = Double.parseDouble(arrOfVal.get(1).getText().replace(",","."));
        return a < b;
    }
}
