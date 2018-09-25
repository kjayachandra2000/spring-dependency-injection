package com.jc.dependency.tests;

import com.jc.dependency.config.SpringConfig;
import com.jc.dependency.support.Settings;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.concurrent.TimeUnit;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BaseTest {

    @Autowired
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        driver.get(Settings.get("url"));
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }
}
