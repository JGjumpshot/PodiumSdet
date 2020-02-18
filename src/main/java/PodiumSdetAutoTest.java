import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;
import java.util.concurrent.TimeUnit;

class PodiumSdetAutoTest {
    private static WebDriver driver = null;
    @BeforeEach
    void setup() {
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.get("https://www.podium.com/");
    }

    @AfterEach
    void teardown() {
        driver.close();
    }

    @Test //Watch demo and fill out form
    void watchDemo() {
        PodiumSplashPage watchDemo = new PodiumSplashPage(driver);
        watchDemo.clickWatchDemo();
        MarketingPage finishForm = new MarketingPage(driver);
        finishForm.fillOutForm("Alphie", "Midgen", "A@midgen.com", "Podium", "8014226366");
    }

    @Test //Search leads
    void searchSolutions() {
        PodiumSplashPage searchSolutions = new PodiumSplashPage(driver);
        searchSolutions.searchLeads();
        String url = driver.getCurrentUrl();
        assert(url).contentEquals("https://www.podium.com/solutions/leads/");
    }

    @Test //enter podium iframe
    void openIframe() {
        iframePage fillFrame = new iframePage(driver);
        fillFrame.clickButton();
        fillFrame.fillForm("Donovan Mitchell", "4352678433", "Ready for gameday");
    }

    @Test //Test Login
    void loginTest() {
        PodiumSplashPage enterLogin = new PodiumSplashPage(driver);
        enterLogin.clickLogin();
        LoginPage completeLogin = new LoginPage(driver);
        completeLogin.login("Jimmy@jammers.com", "J!mmY!sB0mb");
    }

    @Test //Footer form
    void footerForm() {
        MarketingPage finishForm = new MarketingPage(driver);
        finishForm.fillOutForm("Danger", "Joe", "d@j.com", "Barry's Breakfast", "3230001234");
    }

}
