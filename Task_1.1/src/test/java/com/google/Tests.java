package com.google;

import com.google.page.factory.GoogleSearch;
import com.google.page.object.GoogleAfterSearch;
import com.google.page.object.GoogleBeforeSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;

public class Tests extends BaseTest {

    @Test
    public void findGladiolaPO(){

        driver.get("https://www.google.com/");

        GoogleBeforeSearch googleBeforeSearch = new GoogleBeforeSearch(driver);
        googleBeforeSearch.findGladiola("Гладиолус");

        GoogleAfterSearch googleAfterSearch = new GoogleAfterSearch(driver);
        //googleAfterSearch.getRefs().forEach(x-> System.out.println(x.getText()));
        Assertions.assertTrue(
                googleAfterSearch.getRefs().stream().anyMatch(x->x.getText().contains("Шпажник — Википедия")),
                "Значение не найдено!"
        );
    }

    @Test
    public void findGladiolaPF(){

        driver.get("https://www.google.com");

        GoogleSearch googleSearch = PageFactory.initElements(driver, GoogleSearch.class);
        googleSearch.findGladiola("Гладиолус");
        googleSearch.getRefs().forEach(x-> System.out.println(x.getText()));
        Assertions.assertTrue(
                googleSearch.getRefs().stream().anyMatch(x->x.getText().contains("Шпажник — Википедия")),
                "Значение не найдено!"
        );
    }


}
