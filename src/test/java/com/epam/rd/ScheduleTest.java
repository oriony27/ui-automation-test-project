package com.epam.rd;

import com.epam.rd.pages.CartPage;
import com.epam.rd.pages.HomePage;
import com.epam.rd.pages.ProductPage;
import com.epam.rd.pages.SearchResultsPage;
import org.junit.jupiter.api.Test;

public class ScheduleTest extends BaseTest {

    @Test
    public void checkThatPageCanBeOpened() {
        driver.get("https://rozetka.com.ua/");
        new HomePage(driver).search("Ноутбук");
        new SearchResultsPage(driver).clickOnSpecificProduct(1);
        new ProductPage(driver).clickBuyButton();
        new HomePage(driver).clickCartButton();
        new CartPage(driver).verifyPriceEquals();
    }

    @Test
    public void checkNavigation() {
        driver.get("https://rozetka.com.ua/");
        new HomePage(driver)
                .search("Машина")
                .clickCartButton();
    }

}
