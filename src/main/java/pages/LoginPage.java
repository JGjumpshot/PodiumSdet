package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class LoginPage {
    private WebDriver driver;
    private By nameText = By.name("username");
    private By nextBtn = By.id("signInButton");
    private By password = By.id("passwordInput");
    private By signIn = By.id("signInButton");
    private By error = By.className("sc-htoDjs");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String credentials) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        driver.findElement(nameText).sendKeys(username);
        driver.findElement(nextBtn).click();
        driver.findElement(password).sendKeys(credentials);
        driver.findElement(signIn).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(error));
        assertEquals(driver.findElement(error).getText(), "Incorrect email or password. Please try again.");
    }
}
