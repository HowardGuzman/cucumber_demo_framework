package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.AmzHomePage;
import org.openqa.selenium.By;
import org.testng.Assert;


import java.util.Set;

import static stepdefinition.SharedSD.getDriver;

/**
 * Created by howardguzman on 2/12/18.
 */
public class AmzHomeSD {

    private AmzHomePage amzHomePage = new AmzHomePage();

    @Given("^I am on Amazon home page$")
    public void iAmOnHomePage() {
        Assert.assertEquals(getDriver().getTitle(), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }


    @When("^I hover over the Account and Lists link on home screen$")
    public void iHoverOverAccountAndListsLink() {
        amzHomePage.hoverOnAccountListLink();
    }


    @Then("^I verify Account and Lists menu is displayed$")
    public void iVerifyMenuIsDisplayed() {
        if(!SharedSD.getDriver().findElement(By.xpath("//span[@class='nav-action-inner']")).isDisplayed()) {
            Assert.fail("Account & Lists window did not display.");
                }
    }





}

