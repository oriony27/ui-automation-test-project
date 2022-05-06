package com.epam.rd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private WebElement searchBox = driver.findElement(new By.ByName("search"));
    private By cartButton = By.cssSelector(".header-actions__item.header-actions__item--cart");

    public HomePage search(String text) {
        searchBox.sendKeys(text);
        searchBox.sendKeys(Keys.RETURN);
        return this;
    }

    public HomePage clickCartButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIME_TO_WAIT));
        WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(cartButton));

        button.click();
        return this;
    }
}
