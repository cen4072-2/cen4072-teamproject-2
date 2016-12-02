package test.java.cen4072.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PostPage {
  private WebDriver driver;

  public PostPage(WebDriver driver) {
    this.driver = driver;
  }

  public PostPage enterComment(String comment) {
    WebElement commentTextField = driver.findElement(By.id("commentbody"));
    commentTextField.clear();
    commentTextField.sendKeys(comment);

    return this;
  }

  public PostPage clickSubmitCommentButton() {
    WebElement submitComment = driver.findElement(By.cssSelector("span.post"));
    submitComment.click();

    return this;
  }

  public PostPage clickPreviewButton() {
    WebElement previewComment = driver.findElement(By.cssSelector("//div[@id='gmi-TalkPostWrapper']/div[2]/div/a/span"));
    previewComment.click();

    return this;
  }
  public PostPage clickClosePreviewButton(){
    WebElement closeCommentPreview = driver.findElement(By.id("Close_Preview"));
    closeCommentPreview.click();

    return this;
  }

  public PostPage clickEditButton(){
      WebElement editComment = driver.findElement(By.xpath("xpath=(//div[@id='gmi-TalkPostWrapper']/div[2]/div/a/span)[7]"));
      editComment.click();

      return this;
  }

  public String getErrorMessage(){
      WebElement errorMessage = driver.findElement(By.xpath(""));
      return errorMessage.getText();
  }
}