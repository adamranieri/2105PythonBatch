package dev.ranieri.steps;

import dev.ranieri.runners.BasicRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LanguageSteps {

    @Given("The Guest is on the Wikipedia Home Page")
    public void the_Guest_is_on_the_Wikipedia_Home_Page() {
        BasicRunner.driver.get("https://www.wikipedia.org/");
    }

    @When("The Guest clicks on English")
    public void the_Guest_clicks_on_English() {
        BasicRunner.wikiHomePage.english.click();
    }

    @Then("The Guest should be on the English Home Page")
    public void the_Guest_should_be_on_the_English_Home_Page() {
        String title = BasicRunner.driver.getTitle();
        Assert.assertEquals(title,"Wikipedia, the free encyclopedia");
    }

    @When("The Guest clicks on Spanish")
    public void the_Guest_clicks_on_Spanish() {
        BasicRunner.wikiHomePage.spanish.click();
    }

    @Then("The Guest should be on the Spanish Home Page")
    public void the_Guest_should_be_on_the_Spanish_Home_Page() {
        String title = BasicRunner.driver.getTitle();
        Assert.assertEquals(title,"Wikipedia, la enciclopedia libre");
    }

    @When("The Guest clicks on Italian")
    public void the_Guest_clicks_on_Italian() {
        BasicRunner.wikiHomePage.italian.click();
    }

    @Then("The Guest should be on the Italian Home Page")
    public void the_Guest_should_be_on_the_Italian_Home_Page() {
        String title = BasicRunner.driver.getTitle();
        Assert.assertEquals(title,"Wikipedia, l'enciclopedia libera");
    }



}
