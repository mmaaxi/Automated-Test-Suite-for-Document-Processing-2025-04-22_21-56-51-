package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_003Page {
    WebDriver driver;
    WebDriverWait wait;

    By uploadButton = By.id("uploadButton");
    By errorMessage = By.id("errorMsg");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToUploadPage() {
        driver.get("https://example.com/upload");
    }

    public void uploadInvalidOrLargeFile() {
        WebElement uploadBtn = driver.findElement(uploadButton);
        uploadBtn.sendKeys("/path/to/invalid/or/large/file.ext");
    }

    public boolean isErrorMessageDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        return driver.findElement(errorMessage).isDisplayed();
    }
}