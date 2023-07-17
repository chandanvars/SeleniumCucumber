package com.cucumberTraining.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login;

public class MyStepdefs extends Login {
    @Given("Lambda test home page is opened")
    public void lambdaTestHomePageIsOpened() {
        openUrl();
    }

    @When("User enter {string} and {string}")
    public void userEnterUsernameAndPassword(String username,String password ) {
        firstTestCase(username,password);
    }

    @And("User click on SignUp button")
    public void userClickOnSignUpButton() {
        clickSignUpButton();
    }

    @Then("User should be able sign up to lambda test application")
    public void userShouldBeAbleSignUpToLambdaTestApplication() {

    }
}
