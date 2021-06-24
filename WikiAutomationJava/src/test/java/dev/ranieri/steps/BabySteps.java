package dev.ranieri.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BabySteps {

    @Given("I am somewhere")
    public void i_am_somewhere() {
        System.out.println("I am somewhere");
    }

    @When("I do something")
    public void i_do_something() {
        System.out.println("I did something");
    }

    @Then("Something should appear")
    public void something_should_appear() {
        System.out.println("Something done did happened");
    }
}
