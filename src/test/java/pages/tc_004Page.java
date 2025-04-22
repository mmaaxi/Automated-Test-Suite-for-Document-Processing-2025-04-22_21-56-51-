import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class tc_004Page {

    WebDriver driver;
    WebDriverWait wait;

    By uploadButton = By.id("uploadButton");
    By uploadedDocuments = By.id("uploadedDocuments");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void openUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadCompressedFile(String filePath) {
        File file = new File(filePath);
        WebElement uploadElement = driver.findElement(By.id("fileInput"));
        uploadElement.sendKeys(file.getAbsolutePath());
        driver.findElement(uploadButton).click();
    }

    public boolean isExtractionSuccessful() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(uploadedDocuments));
        return driver.findElement(uploadedDocuments).isDisplayed();
    }
  
    public boolean areDocumentsListed() {
        WebElement documentsList = driver.findElement(uploadedDocuments);
        return documentsList.findElements(By.tagName("li")).size() > 0;
    }
}