package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("I have completed the document upload and processing")
    public void completeDocumentUploadAndProcessing() {
        page.uploadDocuments();
        page.processDocuments();
    }

    @When("the system processes the request")
    public void processRequest() {
        page.clickProcessRequestButton();
    }

    @Then("the system should generate an 'Output Slip'")
    public void validateOutputSlipGeneration() {
        Assert.assertTrue(page.isOutputSlipGenerated());
    }

    @Then("the original documents should be saved in the request history")
    public void validateOriginalDocumentsSavedInHistory() {
        Assert.assertTrue(page.areOriginalDocumentsSavedInHistory());
    }

    @Then("the extracted data should be stored in the request history")
    public void validateExtractedDataStoredInHistory() {
        Assert.assertTrue(page.isExtractedDataStoredInHistory());
    }
}