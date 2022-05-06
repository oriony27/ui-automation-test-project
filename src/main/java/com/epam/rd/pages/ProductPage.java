package com.epam.rd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    private By buyButton = By.xpath("//span[contains(text(),' Купить ')]");

    public ProductPage clickBuyButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIME_TO_WAIT));
        WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(buyButton));
        button.click();

        return this;
    }
}
