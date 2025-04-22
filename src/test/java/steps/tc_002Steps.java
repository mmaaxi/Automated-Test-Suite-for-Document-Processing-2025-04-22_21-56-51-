package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import pages.tc_002Page;

public class tc_002Steps {

    tc_002Page page = new tc_002Page();

    @Given("el usuario está en la página de carga de archivos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_archivos() {
        page.navigateToUploadPage();
    }

    @When("el usuario selecciona un archivo en formato PDF/DOCX válido")
    public void el_usuario_selecciona_un_archivo_en_formato_pdf_docx_valido() {
        page.uploadFile("ruta/del/archivo/prueba.pdf");
    }

    @Then("el archivo es cargado exitosamente")
    public void el_archivo_es_cargado_exitosamente() {
        assertTrue(page.isFileUploadedSuccessfully());
    }

    @Then("se muestra la vista previa con el nombre, tamaño y tipo del archivo")
    public void se_muestra_la_vista_previa_con_nombre_tamano_y_tipo_del_archivo() {
        assertEquals("prueba.pdf", page.getFileName());
        assertEquals("100 KB", page.getFileSize());
        assertEquals("PDF", page.getFileType());
    }
}