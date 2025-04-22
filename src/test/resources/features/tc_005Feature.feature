Feature: Validar obligatoriedad de documentos en la carga

  Scenario: Iniciar el proceso de carga sin incluir un documento obligatorio
    Given que el usuario está en la página de carga de documentos
    When el usuario intenta avanzar sin cargar un documento obligatorio
    Then el sistema impide avanzar y muestra un mensaje de error respecto al documento faltante