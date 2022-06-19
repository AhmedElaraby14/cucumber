package pages;

import helper.GUIActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MainMenu {
   private final WebDriver driver;
    private final GUIActions guiActions;
    private final Actions actions;


    public MainMenu(WebDriver driver) {
        this.driver = driver;
        guiActions = new GUIActions(driver);
         actions = new Actions(driver);
    }


    public UserPage  openUserPage() {
        WebElement adminList =  driver.findElement(By.id("menu_admin_viewAdminModule"));
        WebElement userManagement =  driver.findElement(By.id("menu_admin_UserManagement"));
        WebElement user =  driver.findElement(By.id("menu_admin_viewSystemUsers"));
        actions.moveToElement(adminList).moveToElement(userManagement).click(user).build().perform();
        return new UserPage(driver);

    }


}
