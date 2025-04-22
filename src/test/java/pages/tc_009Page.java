package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class tc_009Page {
    
    WebDriver driver;
    
    public tc_009Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToFileUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadFile(int sizeMB) {
        // Code to simulate uploading a file of the specified MB size
        // Start a stopwatch here to measure time
        // Implement file upload actions
    }

    public boolean isUploadWithinTime() {
        // Check if the upload and process time is within limits
        return true; // placeholder
    }

    public void measurePreviewTime() {
        // Start a stopwatch to measure the response time from file selection to preview
    }

    public boolean isPreviewTimeWithinLimit() {
        // Check if the response time is under 1 second for small files
        return true; // placeholder
    }
}