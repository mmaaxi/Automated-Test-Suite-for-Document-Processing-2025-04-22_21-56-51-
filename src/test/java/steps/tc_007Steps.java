import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_007Steps {
    WebDriver driver;
    tc_007Page ocrPage;

    @Given("^El navegador está abierto en la página de carga de archivos$")
    public void abrir_pagina_de_carga() {
        driver = new ChromeDriver();
        ocrPage = new tc_007Page(driver);
        ocrPage.navegarPaginaCarga();
    }

    @When("^Subo un archivo corrupto$")
    public void subir_archivo_corrupto() {
        ocrPage.subirArchivoCorrupto();
    }

    @Then("^El sistema detecta el fallo y notifica el error al Bróker$")
    public void verificar_notificacion_error() {
        Assert.assertTrue(ocrPage.esErrorNotificado());
    }

    @Then("^El sistema finaliza el procesamiento$")
    public void verificar_procesamiento_finalizado() {
        Assert.assertTrue(ocrPage.esProcesamientoFinalizado());
        driver.quit();
    }
}