Feature: Validar subida de archivo con formato válido y vista previa

  Scenario: Subida de archivo PDF/DOCX dentro del límite de 50 MB
    Given el usuario está en la página de carga de archivos
    When el usuario selecciona un archivo en formato PDF/DOCX válido
    Then el archivo es cargado exitosamente
    And se muestra la vista previa con el nombre, tamaño y tipo del archivo