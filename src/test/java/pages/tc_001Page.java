package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {
    WebDriver driver;

    By loadDocumentsOption = By.id("loadDocuments");
    By singleFileOption = By.id("singleFile");
    By multipleFileOption = By.id("multipleFiles");
    By singleFileBox = By.id("singleFileBox");
    By multipleFileBoxes = By.className("multipleFileBox");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectLoadDocumentsOption() {
        driver.findElement(loadDocumentsOption).click();
    }

    public boolean isSingleAndMultipleUploadOptionsDisplayed() {
        return driver.findElement(singleFileOption).isDisplayed() &&
               driver.findElement(multipleFileOption).isDisplayed();
    }

    public void chooseSingleFileUpload() {
        driver.findElement(singleFileOption).click();
    }

    public boolean isSingleFileUploadBoxEnabled() {
        return driver.findElement(singleFileBox).isEnabled();
    }

    public void chooseSeparateFilesUpload() {
        driver.findElement(multipleFileOption).click();
    }

    public boolean areMultipleDocumentUploadBoxesDisplayed() {
        return driver.findElements(multipleFileBoxes).size() > 0;
    }
}