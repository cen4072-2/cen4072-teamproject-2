package test.java.cen4072.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderNavigation {
  private WebDriver driver;

  public HeaderNavigation(WebDriver driver) {
    this.driver = driver;
  }

  public void clickProfileLink() {
    WebElement profileButton = driver.findElement(By.cssSelector("a.mi.iconset-gruser > b"));
    profileButton.click();
  }

  public void logout(){
      WebElement clickLogoutButton = driver.findElement(By.cssSelector("span.mi.iconset-logout"));
      clickLogoutButton.click();
  }

}
