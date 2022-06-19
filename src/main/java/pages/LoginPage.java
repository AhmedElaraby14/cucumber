package pages;

import helper.GUIActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static helper.GUIActions.*;

public class LoginPage  {

    private final WebDriver driver;
    private final GUIActions guiActions;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        guiActions =new GUIActions(driver);
    }

    private final By usernameField = By.id("txtUsername");
    private final By passwordField = By.id("txtPassword");
    private final By loginButton = By.id("btnLogin");
    private final By textAlert = By.id("logInPanelHeading");

    public void setUsername(String username) {
      setText(usernameField,username);
    }

    public void setUserpassword(String password) {
        setText(passwordField,password);
    }

    public DashboardAreaPage clickLoginButton() {
       clickButton(loginButton);
        return new DashboardAreaPage(driver);
    }

    public String getAlertText() {
        return getText(textAlert);
}
}
