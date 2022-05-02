package com.epam.rd.utils;

import com.epam.rd.enumerations.SupportedWebDrivers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public final class WebDriverProvider {
    private static WebDriverProvider INSTANCE;

    private static WebDriver driver;

    private WebDriverProvider() {

    }

    public static WebDriverProvider getInstance() {
        if (INSTANCE != null) {
            return INSTANCE;
        }

        INSTANCE = new WebDriverProvider();
        return INSTANCE;
    }

    public static WebDriver getDriver(SupportedWebDrivers webDriver) {

        switch (webDriver) {
            case CHROME : {
                driver = WebDriverManager.chromedriver().create();
                return driver;
            }

            default : {
                throw new IllegalStateException("Invalid driver!");
            }
        }
    }
}
