package com.jc.dependency.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class FlightStatusPage extends BasePage {

    @FindBy(css = "label[for='flight-status-number-radio']")
    private WebElement radioFlightNumber;

    @FindBy(name = "Flight number")
    private WebElement txtFlightNumber;

    @FindBy(css = "div[class='widget__sticky-footer']>button[class*='submit-flight-status']")
    private WebElement btnCheckStatus;

    public FlightStatusPage(WebDriver driver) {
        super(driver);
    }

    public FlightStatusPage selectFlightNumber() {
        clickOn(radioFlightNumber);
        return this;
    }

    public FlightStatusPage setFlightNumber(String flightNumber) {
        typeInto(txtFlightNumber, flightNumber);
        return this;
    }

    public void checkFlightStatus() {
        clickOn(btnCheckStatus);
    }
}
