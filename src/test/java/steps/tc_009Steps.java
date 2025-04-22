package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {

    tc_009Page page = new tc_009Page();

    @Given("the user is on the file upload page")
    public void user_on_upload_page() {
        page.navigateToFileUploadPage();
    }

    @When("the user uploads a file of size {int} MB")
    public void user_uploads_small_file(int sizeMB) {
        page.uploadFile(sizeMB);
    }

    @Then("the upload and processing should complete in less than the specified time")
    public void upload_processing_complete_in_time() {
        Assert.assertTrue(page.isUploadWithinTime());
    }

    @When("the user measures the response time for file preview")
    public void user_measures_response_time() {
        page.measurePreviewTime();
    }

    @Then("the response time should be under 1 second for small files")
    public void response_time_within_limit() {
        Assert.assertTrue(page.isPreviewTimeWithinLimit());
    }
}