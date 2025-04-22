package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_003Page;
import static org.junit.Assert.*;

public class tc_003Steps {
    tc_003Page uploadPage = new tc_003Page();

    @Given("el usuario está en la página de carga de archivos")
    public void usuario_en_pagina_carga_archivos() {
        uploadPage.navigateToUploadPage();
    }

    @When("el usuario intenta subir un archivo no permitido o demasiado grande")
    public void usuario_intenta_subir_archivo_no_permitido_o_grande() {
        uploadPage.uploadInvalidOrLargeFile();
    }

    @Then("se muestra un mensaje de error indicando formato inválido o tamaño excedido")
    public void se_muestra_mensaje_error_formato_invalido_o_tamaño_excedido() {
        assertTrue(uploadPage.isErrorMessageDisplayed());
    }
}