package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_002Page {

    WebDriver driver;
    WebDriverWait wait;

    By uploadButton = By.id("uploadButton");
    By fileNameField = By.id("fileName");
    By fileSizeField = By.id("fileSize");
    By fileTypeField = By.id("fileType");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToUploadPage() {
        driver.get("https://example.com/upload");
    }

    public void uploadFile(String filePath) {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys(filePath);
    }

    public boolean isFileUploadedSuccessfully() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(fileNameField));
        return driver.findElement(fileNameField).isDisplayed();
    }

    public String getFileName() {
        return driver.findElement(fileNameField).getText();
    }

    public String getFileSize() {
        return driver.findElement(fileSizeField).getText();
    }

    public String getFileType() {
        return driver.findElement(fileTypeField).getText();
    }
}