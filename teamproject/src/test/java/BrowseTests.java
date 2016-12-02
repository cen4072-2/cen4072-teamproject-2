package test.java;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import main.java.pages.Browse;

/**
 * Created by Winicius on 11/6/2016.
 */

@RunWith(JUnit4.class)
public class BrowseTests {
    private static WebDriver driver;
    private Browse browsePage;
    @BeforeClass
    public static void oneTimeSetup() {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        System.out.println(System.getProperty("user.dir"));
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/geckodriver.exe");
        driver = new FirefoxDriver();
    }
    @Before
    public void setup() {
        browsePage = new Browse(driver);
        browsePage.open();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void teardown() {
    }

    @AfterClass
    public static void onetimeTeardown() {
        driver.quit();
    }

    @Test
    public void Browse_searchInvalid_BadRequest() throws InterruptedException {
        browsePage = browsePage.browseFor("aaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddddddaaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddddddddddddddaaaaaaaaaaaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddaaaaaaaaddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaadddddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaaaaddddddaaaaaaaaaa");
        Thread.sleep(10000);
        WebElement x = driver.findElement(By.tagName("body"));
        assertTrue(x.getText().contains("Bad request"));
    }

    @Test
    public void Browse_searchValid_NoResults() throws InterruptedException {
        browsePage = browsePage.browseFor("awdawdsefdrgdrg4565464");
        Thread.sleep(10000);
        WebElement x = driver.findElement(By.className("browse-no-results"));
        assertEquals("Sorry, we found no relevant results.",x.getText());
    }

    @Test
    public void Browse_searchValid_OneorMoreResults() throws InterruptedException {
        String pmatch = ".*\\d+.*results";
        browsePage = browsePage.browseFor("witches");
        Thread.sleep(30000);
        WebElement x = driver.findElement(By.className("search-stats"));
        assertTrue(x.getText().matches(pmatch));

        browsePage.clickLink("Newest");
        //WebDriverWait q = (new WebDriverWait(driver, 20));
        //q.until(ExpectedConditions.presenceOfElementLocated(By.className("search-stats")));
        Thread.sleep(10000);
        x = driver.findElement(By.className("search-stats"));
        assertTrue(x.getText().matches(pmatch));

        browsePage.clickLink("Hot");
        Thread.sleep(10000);
        x = driver.findElement(By.className("search-stats"));
        assertTrue(x.getText().matches(pmatch));

        browsePage.clickLink("Undiscovered");
        Thread.sleep(10000);
        x = driver.findElement(By.className("search-stats"));
        assertTrue(x.getText().matches(pmatch));

        browsePage.clickLink("24");
        Thread.sleep(10000);
        x = driver.findElement(By.className("search-stats"));
        assertTrue(x.getText().matches(pmatch));

        driver.get("http://www.deviantart.com/dailydeviations");
//        browsePage.clickLinkExactText("Daily Deviations");
        Thread.sleep(10000);
        String ddeviation = driver.getCurrentUrl();
        assertTrue(ddeviation.contains("dailydeviations"));
    }
}