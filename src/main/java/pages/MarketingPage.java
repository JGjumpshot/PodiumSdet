package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MarketingPage {
    private WebDriver driver;
    private By firstName = By.name("FirstName");
    private By lastName = By.name("LastName");
    private By email = By.name("Email");
    private By company = By.name("Company");
    private By mobile = By.name("MobilePhone");

    public MarketingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillOutForm(String name1, String name2, String contact, String institution, String phone) {
        driver.findElement(firstName).sendKeys(name1);
        driver.findElement(lastName).sendKeys(name2);
        driver.findElement(email).sendKeys(contact);
        driver.findElement(company).sendKeys(institution);
        driver.findElement(mobile).sendKeys(phone);
    }
}
