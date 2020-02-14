package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By nameText = By.name("username");
    private By nextBtn = By.id("signInButton");
    private By password = By.id("passwordInput");
    private By signIn = By.id("#signInButton");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String credentials) {
        driver.findElement(nameText).sendKeys(username);
        driver.findElement(nextBtn).click();
        driver.findElement(password).sendKeys(credentials);
        driver.findElement(signIn).click();
    }
}
