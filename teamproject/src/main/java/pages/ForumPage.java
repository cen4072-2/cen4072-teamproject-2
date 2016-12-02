package main.java.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForumPage {
    private final String URL = "http://forum.deviantart.com/devart/welcome/";
    private WebDriver driver;


    public ForumPage(WebDriver driver) {
        this.driver = driver;
    }

    public ForumPage open() {
        driver.get(URL);
        return this;
    }

    public ForumPage createThread(String topic, String content){
        WebElement input = driver.findElement(By.id("commentsubject"));
        input.sendKeys(topic);

        WebElement input1 = driver.findElement(By.xpath("//div[@class='ccwriter-content']/div[1]"));
        input1.click();
        input1.sendKeys(content);

        driver.findElement(By.xpath("//div[@class='trailing section-foot c']/a[2]")).click();
        return this;
    }
}