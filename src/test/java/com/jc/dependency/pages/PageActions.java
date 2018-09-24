package com.jc.dependency.pages;

import org.openqa.selenium.WebElement;

public class PageActions {

    public void clickOn(WebElement element) {
        element.click();
    }

    public void typeInto(WebElement element, String string) {
        element.sendKeys(string);
    }
}
