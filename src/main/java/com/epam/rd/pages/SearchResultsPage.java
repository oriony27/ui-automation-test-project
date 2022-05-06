package com.epam.rd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchResultsPage extends BasePage {

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    private By productTitle = By.className("goods-tile__title");

    public SearchResultsPage clickOnSpecificProduct(int productIndex) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIME_TO_WAIT));
        List<WebElement> products = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(productTitle));

        products.get(productIndex).click();

        return this;
    }
}
