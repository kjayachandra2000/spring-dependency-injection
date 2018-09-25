package com.jc.dependency.tests;

import com.jc.dependency.config.SpringConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = SpringConfig.class)
@TestPropertySource("file:${user.dir}/config.properties")
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class BaseTest {

    @Autowired
    private WebDriver driver;

    @Autowired
    private Environment env;

    @BeforeEach
    public void beforeEach() {
        driver.get(env.getProperty("url"));
    }

    @AfterEach
    public void afterEach() {
        driver.close();
        driver.quit();
    }
}
