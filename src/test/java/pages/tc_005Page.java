package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_005Page {

    WebDriver driver;

    By uploadPageLocator = By.id("uploadPage");
    By errorMessageLocator = By.id("errorMessage");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/uploadPage");
    }

    public void attemptToProceedWithoutDocument() {
        WebElement proceedButton = driver.findElement(By.id("proceedButton"));
        proceedButton.click();
    }

    public boolean isErrorMessageDisplayed() {
        WebElement errorMessage = driver.findElement(errorMessageLocator);
        return errorMessage.isDisplayed();
    }
}