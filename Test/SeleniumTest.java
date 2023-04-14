import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest {

    @Test
    public void test1() {

        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");

        // Launch website
        driver.navigate().to("https://www.nagarro.com/en");

        // Click on the search button
        driver.findElement(By.id("megaMenuAbout")).click();

    }
}
