package com.epam.rd.pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected final static long TIME_TO_WAIT = 10;
    protected final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}