package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HaloOglasiBaseTest {
    public static WebDriver driver;
    public static WebDriverWait wdWait;
    public static Actions actions;
    public static JavascriptExecutor scroll;


    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdWait = new WebDriverWait(driver, 30);
        actions = new Actions(driver);
        driver.manage().window().maximize();
        scroll = (JavascriptExecutor) driver;
        driver.get("https://www.halooglasi.com/");
    }
    @After
    public void tearDown(){
        // TODO uncomment this when tests are done
        // driver.quit();
    }

}
