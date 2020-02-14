package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Set;

public class iframePage {
    private WebDriver driver;
    private By podiumBubble = By.id("podium-bubble");
    private By podiumModal = By.id("podium-modal");
    private By podiumBtn = By.className("ContactBubble__Icon");
    private By name = By.id("Name");
    private By phone = By.id("Mobile Phone");
    private By message = By.id("Message");
    public iframePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButton() {
        WebElement bubble = driver.findElement(podiumBubble);
        driver.switchTo().frame(bubble);
        WebElement podiumBtn = driver.findElement(this.podiumBtn);
        podiumBtn.click();
    }

    public void fillForm(String fullName, String contact, String reply) {

        driver.switchTo().defaultContent();
        driver.switchTo().frame(2);

        //ExpectedConditions.presenceOfElementLocated(podiumModal);

        Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);
        driver.findElement(name).sendKeys(fullName);
        driver.findElement(phone).sendKeys(contact);
        driver.findElement(message).sendKeys(reply);
    }
}
