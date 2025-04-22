package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;

public class tc_010Page {

    private WebDriver driver = DriverFactory.getDriver();

    private By documentUploadInput = By.id("document-upload");
    private By processButton = By.id("process-request");
    private By outputSlip = By.id("output-slip");
    private By requestHistoryOriginalDocuments = By.id("history-original-documents");
    private By requestHistoryExtractedData = By.id("history-extracted-data");

    public void uploadDocuments() {
        WebElement uploadInput = driver.findElement(documentUploadInput);
        uploadInput.sendKeys("/path/to/document");
    }

    public void processDocuments() {
        // Assume some processing steps
    }

    public void clickProcessRequestButton() {
        driver.findElement(processButton).click();
    }

    public boolean isOutputSlipGenerated() {
        return driver.findElement(outputSlip).isDisplayed();
    }

    public boolean areOriginalDocumentsSavedInHistory() {
        return driver.findElement(requestHistoryOriginalDocuments).isDisplayed();
    }

    public boolean isExtractedDataStoredInHistory() {
        return driver.findElement(requestHistoryExtractedData).isDisplayed();
    }
}