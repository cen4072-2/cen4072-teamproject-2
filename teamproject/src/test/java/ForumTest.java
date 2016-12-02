package test.java;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import main.java.pages.ForumPage;
import main.java.pages.LoginPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;

@RunWith(JUnit4.class)
public class ForumTest {

    private static WebDriver driver;
    private static LoginPage loginpage;
    private static ForumPage fp;

    @BeforeClass
    public static void oneTimeSetup(){
        //Set your path to the geckodriver application
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/geckodriver.exe");
        driver = new FirefoxDriver();
        loginpage = new LoginPage(driver);
        loginpage.open();
        loginpage = loginpage.defaultSignin();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }

    @AfterClass
    public static void teardown(){
        driver.quit();
    }

    @Before
    public void setup(){
        try{ TimeUnit.SECONDS.sleep(5); } catch(Exception e){}  //Give a chance for login to process before changing page
        fp = new ForumPage(driver);
        fp.open();



    }

    @Test
    public void createThread_GoodTopicEmptyContent_Error(){

        String topic = "Hello world!";
        String content = "";
        fp.createThread(topic, content);
        Assert.assertEquals("Please correct all errors to continue", driver.findElement(By.className("form_error")).getText());


    }

    @Test
    public void createThread_EmptyTopicGoodContent_Error(){

        String topic = "";
        String content = "Hello all";

        fp.createThread(topic, content);
        Assert.assertEquals("Please correct all errors to continue", driver.findElement(By.className("form_error")).getText());


    }

    @Test
    public void createThread_GoodTopicGoodContent_ThreadCreated(){
        String topic = "Hello world!";
        String content = "Hello all";
        fp.createThread(topic, content);

        List errors = driver.findElements(By.className("form_error"));
        Assert.assertEquals(0, errors.size());
    }

}