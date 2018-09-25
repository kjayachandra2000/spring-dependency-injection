package com.jc.dependency.steps;

import com.jc.dependency.pages.HomePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomeSteps {

    @Autowired
    private HomePage homePage;

    public void openFlightStatus() {
        homePage
                .openFlightStatus();
    }
}
