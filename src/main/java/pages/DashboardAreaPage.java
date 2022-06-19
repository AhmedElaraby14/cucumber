package pages;

import helper.GUIActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static helper.GUIActions.getText;

public class DashboardAreaPage {
    private final WebDriver driver;
    private final GUIActions guiActions;

    public DashboardAreaPage(WebDriver driver) {
        this.driver = driver;
        guiActions =new GUIActions(driver);
    }

    private final By statusAlert = By.linkText("Dashboard");

    public String getAlertText() {
        return getText(statusAlert);
    }
}
