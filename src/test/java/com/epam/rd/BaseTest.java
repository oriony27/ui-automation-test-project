package com.epam.rd;

import com.epam.rd.enumerations.SupportedWebDrivers;
import com.epam.rd.utils.WebDriverProvider;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    protected WebDriver driver;

    @BeforeAll
    public void setUpDriver() {
        driver = WebDriverProvider.getDriver(SupportedWebDrivers.CHROME);
    }

    @AfterAll
    public void tearDownDriver() {
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.close();
        }
    }
}
