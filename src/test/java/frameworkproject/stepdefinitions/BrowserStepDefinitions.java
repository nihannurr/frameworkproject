package frameworkproject.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
// import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.assertEquals;

public class BrowserStepDefinitions {
    
    private WebDriver driver;

    @Given("Open the {string} browser")
    public void open_the_chrome_browser(String browser) {
        //burada örnek olarak kullanıcının Chrome gönderdigi varsayıldı, gelebilecek baska tarayıcı isimlerine gore method duzenlenebilir.
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @When("Navigate to {string}")
    public void navigate_to(String url) {
        driver.get(url);
    }

    @Then("Check title for {string}")
    public void title_should_be(String expectedTitle) {
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
        driver.quit();
    }



}
