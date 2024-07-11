package org.icrc.hrspace.LOGIN_TEST;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import steps.HeaderSteps;
import steps.HomeSteps;
import steps.LoginSteps;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SerenityRunner.class)
public class LoginTest {
    @Managed
    WebDriver webDriver;

    @Steps
    LoginSteps loginSteps;

    @Steps
    HeaderSteps headerSteps;

    @Test
    public void LoginTesting(){
        String CH_NAME = "Philippe SALLET";
        String CH_USERNAME = "A949359";
        String CH_PASSWORD = "nrt2023HRIS+";

        loginSteps.given_that_Im_logged_in_to_HR_space(CH_NAME, CH_USERNAME, CH_PASSWORD);
        headerSteps.when_I_set_the_header_module("My Employee File");

    }

}
