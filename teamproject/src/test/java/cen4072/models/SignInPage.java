package test.java.cen4072.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
  private final String URL = "https://www.deviantart.com/users/login";
  private final String username = "cen4072.2@gmail.com";
  private final String password = "blackbox24";

  private WebDriver driver;

  public SignInPage(WebDriver driver) {
    this.driver = driver;
  }

  public SignInPage open() {
    driver.get(URL);
    return this;
  }

  public void signinDefaultCredentials() {
    signin(username, password);
  }

  public void signin(String username, String password) {
    WebElement userNameTextField = driver.findElement(By.id("login_username"));
    WebElement passwordTextField = driver.findElement(By.id("login_password"));
    WebElement submitButton = driver.findElement(By.cssSelector("input.smbutton"));

    userNameTextField.clear();
    userNameTextField.sendKeys(username);

    passwordTextField.clear();
    passwordTextField.sendKeys(password);

    submitButton.click();
  }
}
