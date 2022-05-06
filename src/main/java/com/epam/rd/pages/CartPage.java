package com.epam.rd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    private By redPrice = By.xpath("//p[@data-testid='cost']");
    private By blackPrice = By.className("cart-receipt__sum-price");

    public CartPage verifyPriceEquals() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIME_TO_WAIT));

        WebElement red = wait.until(ExpectedConditions.presenceOfElementLocated(redPrice));
        WebElement black = wait.until(ExpectedConditions.presenceOfElementLocated(blackPrice));



        assertEquals(red.getText().replace(" ", ""),
                black.getText().replace(" ", ""),
                "Price is different!");

        return this;
    }
}
