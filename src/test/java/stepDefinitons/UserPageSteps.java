
package stepDefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.MainMenu;
import pages.UserPage;
import tests.BaseTests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class UserPageSteps extends BaseTests {
    LoginPage loginPage;
    MainMenu mainMenu;
    UserPage userPage;
    @Given("The user is on login page")
    public void the_user_is_on_login_page() {
        this.driver = BaseTests.driver;
        loginPage = new LoginPage(driver);
        assertTrue(loginPage.getAlertText().contains("LOGIN"), "Not login Page");
    }
    @When("The user logins with valid credentials")
    public void the_user_logins_with_valid_credentials() {
        loginPage = new LoginPage(driver);
        loginPage.setUsername("Admin");
        loginPage.setUserpassword("admin123");
        var dashboardAreaPage = loginPage.clickLoginButton();
        assertTrue(dashboardAreaPage.getAlertText().contains("Dashboard"), "incorrect login");
    }


    @And("The user opens user page")
    public void the_user_opens_user_page() {
        mainMenu = new MainMenu(driver);
        var userPage = mainMenu.openUserPage();

    }
    @Then("User is on user page successfully")
    public void user_is_on_user_page_successfully() {
        userPage = new UserPage(driver);
        assertTrue(userPage.getAlertText().contains("System Users"), "incorrect page");
    }


}


