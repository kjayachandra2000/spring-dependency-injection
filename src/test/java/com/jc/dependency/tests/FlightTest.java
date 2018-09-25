package com.jc.dependency.tests;

import com.jc.dependency.steps.FlightStatusSteps;
import com.jc.dependency.steps.HomeSteps;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class FlightTest extends BaseTest {

    @Autowired
    HomeSteps homeSteps;

    @Autowired
    FlightStatusSteps flightStatusSteps;

    @Test
    @Tag("smoke")
    void smokeTest() {
        homeSteps
                .openFlightStatus();
        flightStatusSteps
                .checkFlightByNumber("203");
    }

    @Test
    void sampleTest() {
        homeSteps
                .openFlightStatus();
        flightStatusSteps
                .checkFlightByNumber("203");
    }
}
