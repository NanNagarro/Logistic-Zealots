import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class SeleniumTest {

    @Test
    public void test1() throws IOException {

        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");

        // Launch website
        driver.navigate().to("https://www.nagarro.com/en/services/accelerated-quality-and-test-engineering/calculate-test-automation-roi");
        WebElement element = driver.findElement(By.id("hs-eu-cookie-confirmation-button-group"));
        element.click();
        element = driver.findElement(By.id("startSurvey"));
        element.click();

        testCaseReader.readByProjectIDAutomationRequirements(1);
        // Find the progress bar element
        WebElement progressBar = driver.findElement(By.id("automationCandidates"));
        // Create an instance of the Actions class
        Actions actions = new Actions(driver);
        // Swipe the progress bar by dragging it from left to right
        actions.dragAndDropBy(progressBar, 100, 0).perform();



    }


}
