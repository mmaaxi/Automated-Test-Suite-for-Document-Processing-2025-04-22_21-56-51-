package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class tc_008Page {

    private WebDriver driver;

    private By uploadButton = By.id("uploadButton");
    private By filePreview = By.cssSelector(".file-preview");
    private By deleteButton = By.cssSelector(".file-delete");

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToFileUploadPage() {
        driver.get("https://example.com/file-upload");
    }

    public void uploadDocuments() {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys("/path/to/document1,/path/to/document2");
    }

    public boolean verifyFilePreviewDetails() {
        List<WebElement> previews = driver.findElements(filePreview);
        for (WebElement preview : previews) {
            if (!preview.getText().contains("Nombre:") || !preview.getText().contains("Tamaño:") || !preview.getText().contains("Tipo:")) {
                return false;
            }
        }
        return true;
    }

    public void deleteFile() {
        WebElement fileToDelete = driver.findElements(deleteButton).get(0);
        fileToDelete.click();
    }

    public boolean verifyFileDeletion() {
        List<WebElement> previews = driver.findElements(filePreview);
        return previews.size() < 2; // Assumes initial state had 2 files, and 1 should remain
    }
}