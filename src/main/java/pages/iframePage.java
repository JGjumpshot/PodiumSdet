package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class iframePage {
    private WebDriver driver;
    private By podiumBtn = By.id("Website-Widget-(desktop)");

    public iframePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButton() {
        Actions actions = new Actions(driver);
        WebElement podiumBtn = driver.findElement(this.podiumBtn);
        actions.moveToElement(podiumBtn).perform();
        driver.findElement(podiumBtn).click();
    }
}
