import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_004Page;

public class tc_004Steps {

    WebDriver driver;
    tc_004Page page;

    public tc_004Steps() {
        this.driver = Hooks.getDriver();
        page = new tc_004Page(driver);
    }

    @Given("I am on the file upload page")
    public void i_am_on_the_file_upload_page() {
        page.openUploadPage();
    }

    @When("I upload a compressed file containing multiple documents")
    public void i_upload_a_compressed_file_containing_multiple_documents() {
        page.uploadCompressedFile("path_to_compressed_file.zip");
    }

    @Then("the system should automatically extract the file")
    public void the_system_should_automatically_extract_the_file() {
        Assert.assertTrue(page.isExtractionSuccessful());
    }

    @Then("list each document for validation")
    public void list_each_document_for_validation() {
        Assert.assertTrue(page.areDocumentsListed());
    }
}