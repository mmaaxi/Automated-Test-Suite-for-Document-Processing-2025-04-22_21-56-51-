Feature: Validar usabilidad de la vista previa y funcionalidad de eliminación de archivos

  Scenario: Vista previa y eliminación de archivos
    Given que el usuario está en la página de carga de archivos
    When el usuario sube documentos
    Then el sistema muestra nombre, tamaño y tipo de cada archivo en la vista previa
    When el usuario elimina uno de los archivos usando la opción de eliminar
    Then el archivo se elimina correctamente de la lista antes de la confirmación