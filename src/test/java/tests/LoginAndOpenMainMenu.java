package tests;

import org.testng.annotations.Test;
import pages.MainMenu;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class LoginAndOpenMainMenu extends BaseTests {
    MainMenu hoverPage;
    LoginPage loginPage;
    @Test(priority = 1)
    public void loginSuccessfully()
    {
        loginPage = new LoginPage(driver);
        loginPage.setUsername("Admin");
        loginPage.setUserpassword("admin123");
        var dashboardAreaPage = loginPage.clickLoginButton();
        assertTrue(dashboardAreaPage.getAlertText().contains("Dashboard"), "incorrect login");
    }
    @Test(priority = 2)
    public void openUserPage()
    {
        hoverPage = new MainMenu(driver);
       var userPage = hoverPage.openUserPage();
        assertTrue(userPage.getAlertText().contains("System Users"), "incorrect page");

    }


}
