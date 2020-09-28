package com.google.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleAfterSearch extends GoogleBeforeSearch {

    List<WebElement> refs;

    public GoogleAfterSearch(WebDriver driver){
        super(driver);
        refs = driver.findElements(By.xpath("//*[@class=\"LC20lb DKV0Md\"]/span"));
    }
    //"//*[@class=\"product-layout product-list col-xs-12\"]//*[@class=\"short__desc\"]"

    public List<WebElement> getRefs() {
        return refs;
    }
}
