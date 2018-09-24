package com.jc.dependency.steps;

import com.jc.dependency.pages.FlightStatusPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FlightStatusSteps {

    private FlightStatusPage flightStatusPage;

    @Autowired
    public FlightStatusSteps(FlightStatusPage flightStatusPage) {
        this.flightStatusPage = flightStatusPage;
    }

    public void checkFlightByNumber(String flightNumber) {
        flightStatusPage
                .selectFlightNumber()
                .setFlightNumber(flightNumber)
                .checkFlightStatus();
    }
}
