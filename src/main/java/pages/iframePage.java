package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class iframePage {
    private WebDriver driver;
    private By podiumIframe = By.id("podium-bubble");
    private By podiumBtn = By.className("ContactBubble__Icon");
    private By name = By.id("Name");
    private By phone = By.id("Mobile Phone");
    private By message = By.id("Message");
    public iframePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButton() {
        driver.switchTo().frame(driver.findElement(podiumIframe));
        WebElement podiumBtn = driver.findElement(this.podiumBtn);
        podiumBtn.click();
//        Actions actions = new Actions(driver);
//        WebElement podiumBtn = driver.findElement(this.podiumBtn);
//        actions.moveToElement(podiumBtn).perform();
//        driver.findElement(this.podiumBtn).click();
    }

    public void fillForm(String fullName, String contact, String reply) {
        driver.findElement(name).sendKeys(fullName);
        driver.findElement(phone).sendKeys(contact);
        driver.findElement(message).sendKeys(reply);
    }
}
