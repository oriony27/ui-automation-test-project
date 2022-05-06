package com.epam.rd.enumerations;

public enum SupportedWebDrivers {
    CHROME("chrome"),
    FIREFOX("firefox");

    private String driverName;

    SupportedWebDrivers(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverName() {
        return driverName;
    }
}
