package test.java.cen4072.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {
  private WebDriver driver;

  public ProfilePage(WebDriver driver) {
    this.driver = driver;
  }

  public ProfilePage clickPost() {
    WebElement postPreview = driver.findElement(By.cssSelector("img[alt=\"Penguin by cen4072-2\"]"));
    postPreview.click();
    return this;
  }

}
