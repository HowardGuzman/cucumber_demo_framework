package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.AmzHomePage;
import framework.AmzLoginPage;
import org.testng.Assert;

/**
 * Created by howardguzman on 2/12/18.
 */
public class AmzLoginSD {

    private AmzLoginPage amzLoginPage = new AmzLoginPage();
    private AmzHomePage amzHomePage = new AmzHomePage();

    @Given("^I am on Amazon login page$")
    public void iAmOnAmazonLoginPage() {
//        System.out.println("First page title: " + SharedSD.getDriver().getTitle());
        amzHomePage.clickOnAccountListLink();
//        System.out.println("Second page title: " + SharedSD.getDriver().getTitle());

        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Amazon Sign In", "Invalid Sign In Page");
    }


    @When("^I enter (.+) into (username|password|firstname|lastname|mobile number|new password) text field on login screen$")
    public void enterDataIntoTextFields(String anyText, String textFields) {



        switch (textFields) {
            case "username":
                amzLoginPage.enterEmailAddress(anyText);
                break;
        }

    }


    @And("^I click on Continue button on login screen$")
    public void clickOnContinueButton(){
        amzLoginPage.clickOnContinueButton();
    }

    @Then("^I verify error message on login page$")
    public void verifyErrorMsg() { amzLoginPage.verifyErrorMsg(); }




}
