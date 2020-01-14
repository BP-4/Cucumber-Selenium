Feature: Estructura Nota
  Como usuario quiero verificar la estructura de la nota

  Scenario: Ingresar a la primera nota de la home de Ciudad
    Given El usuario se encuentra en la pagina home de ciudad
    When  Ingresa a la primera nota
    And   Ingresa a FaceBook
    And   Ingresa a Instagram
    And   Ingresa a YouTube
    And   Ingresa a Twitter
    Then  Se debe comprobar la estructura de la nota