package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PodiumSplashPage {
    private WebDriver driver;
    private By watchDemo = By.cssSelector(".primary-button:nth-child(1)");
    private By solutions = By.cssSelector("#wp-megamenu-item-2423");
    private By leads = By.cssSelector("#wp-megamenu-item-2424 > a");
    private By login = By.cssSelector("#menu-item-1317 > a");
    public PodiumSplashPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickWatchDemo() {
        driver.findElement(watchDemo).click();
    }

    public void searchLeads() {
        Actions actions = new Actions(driver);
        WebElement solutions = driver.findElement(this.solutions);
        actions.moveToElement(solutions).perform();
        driver.findElement(leads).click();
    }

    public void clickLogin() {
        driver.findElement(login).click();
    }
}
