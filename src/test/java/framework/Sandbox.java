package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import stepdefinition.SharedSD;

import java.util.Set;

/**
 * Created by howardguzman on 2/12/18.
 */
public class Sandbox {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.darksky.net");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[@class='hours']"));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();


    }
}



//        // Print Home Page Title
//        System.out.println("Got to Home Page.");
//        System.out.println("The tile of this page is:  " + driver.getTitle());
//        System.out.println();
//
//        // Hover over Account & Lists
//        Actions actions = new Actions(driver);
//        actions.moveToElement(driver.findElement(By.xpath("//span[@class='nav-line-1' and text()='Hello. Sign in']"))).perform();
//        System.out.println("I am now hovering on Sign In link.");
//
//        // Click sign in button
//        driver.findElement(By.xpath("//span[@class='nav-line-1' and text()='Hello. Sign in']")).click();
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//
//        // Print Login Page Title
//        System.out.println("Sign In Page title is: "  + driver.getTitle());
//
//
//        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Howard");
//
//
//
//
////        Click continue button
//        driver.findElement(By.id("continue")).click();
//
//
//        System.out.println("The End.");
//
//
//


/*





        String mainWindow = driver.getWindowHandle();

        System.out.println("Main window handle: " + mainWindow.toString());

        // Hover over Account & Lists
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//span[@class='nav-line-1' and text()='Hello. Sign in']"))).perform();

        //         Check if pop-up is displayed
        if ((driver.findElement(By.xpath("//span[@class='nav-action-inner']"))).isDisplayed()) {
            System.out.println("The pop-up is displayed!");
        } else {
            System.out.println("The pop-up is NOT displayed.");
        }


Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more

Feature file content:
  @login-1
  Scenario: Verify Invalid Login
    When I enter mohammad@technosoftacademy.io into username text fields on home screen
    And I enter test1234 into password text fields on home screen
    And I click on login button on home screen
    Then I verify that i am an invalid login page

  @login-2
  Scenario: Verify Invalid Login two
    When I enter chris@technosoftacademy.io into username text fields on home screen
    And I enter abc1234 into password text fields on home screen
    And I click on login button on home screen
    Then I verify that i am an invalid login page

  @login-3
  Scenario Outline: Verify Invalid Login for multiple users
    When I enter <username> into username text fields on home screen
    And I enter <password> into password text fields on home screen
    And I click on login button on home screen
    Then I verify that i am an invalid login page

    Examples:
      | username                      | password |
      | mohammad@technosoftacademy.io | test1234 |
      | chris@technosoftacademy.io    | abc123   |

  @amazon-login
  Scenario: Verify user should not be able to login using invalid credentials
    Given I am on home page of Amazon
    When I Hover over to Accounts & List
    And I click on Sign in button
    And I enter invalid email address
    And I click on continue button
    Then I verify invalid error message



 */