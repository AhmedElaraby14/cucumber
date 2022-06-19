package pages;

import helper.GUIActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static helper.GUIActions.getText;

public class UserPage {
    private final WebDriver driver;
    private final GUIActions guiActions;
    public UserPage(WebDriver driver) {
        this.driver = driver;
        guiActions =new GUIActions(driver);
    }

    private final By statusAlert = By.id("systemUser-information");

    public String getAlertText() {
        return getText(statusAlert);
    }


}
