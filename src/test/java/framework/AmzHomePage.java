package framework;

import org.openqa.selenium.By;

/**
 * Created by howardguzman on 2/12/18.
 */
public class AmzHomePage extends BasePage {

    private By accountListsLink = By.xpath("//span[@class='nav-line-1' and text()='Hello. Sign in']");
    private By signInLink = By.xpath("//span[@class='nav-action-inner' and text()='Sign In']");

    // This method hovers over the link
    public void hoverOnAccountListLink() {
        hoverOnElement(accountListsLink);
    }

    // This method clicks the  link
    public void clickOnAccountListLink() {
        clickOn(accountListsLink);
    }

    public void clickOnDropDownSignInButton() {
        clickOn(signInLink);
    }





}
