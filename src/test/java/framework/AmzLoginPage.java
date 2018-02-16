package framework;

import org.openqa.selenium.By;

/**
 * Created by howardguzman on 2/13/18.
 */
public class AmzLoginPage extends BasePage {

    private By emailTextField = By.xpath("//input[@type='email']");
//    private By emailTextField = By.id("ap_email");
    private By continueButton = By.xpath("//input[@id='continue']");
    private By thereWasAProblemTextBox =  By.xpath("//span[@class='a-list-item']");

    // set email on login page

    public void enterEmailAddress(String enterEmail) { sendText(emailTextField, enterEmail); }


    // This method clicks the  Continue button
    public void clickOnContinueButton() {
        clickOn(continueButton);
    }


    // This methods detects the There was a problem text box
    public void verifyErrorMsg() {
        getTextFromElement(thereWasAProblemTextBox);
    }

}
