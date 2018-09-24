package com.jc.dependency.steps;

import com.jc.dependency.pages.HomePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomeSteps {

    private HomePage homePage;

    @Autowired
    public HomeSteps(HomePage homePage) {
        this.homePage = homePage;
    }

    public void openFlightStatus() {
        homePage
                .openFlightStatus();
    }
}
