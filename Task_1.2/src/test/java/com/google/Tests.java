package com.google;

import com.google.page.object.GoogleAfterSearch;
import com.google.page.object.GoogleBeforeSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests extends BaseTest{

    @Test
    public void findOpenPO(){

        driver.get("https://www.google.com");

        GoogleBeforeSearch googleBeforeSearch = new GoogleBeforeSearch(driver);
        googleBeforeSearch.findOpen("Открытие");

        GoogleAfterSearch googleAfterSearch = new GoogleAfterSearch(driver);
        Assertions.assertTrue(googleAfterSearch.getCondition(), "Ошибка!");

    }

}
