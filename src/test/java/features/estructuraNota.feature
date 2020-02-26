Feature: Estructura Nota
  Como usuario quiero verificar la estructura de la nota
  Background:
    Given El usuario se encuentra en la pagina home de ciudad

  Scenario: Ingresar a la primera nota de la home de Ciudad
    When  Ingresa a la primera nota
    And   Ingresa a FaceBook
    And   Ingresa a Instagram
    And   Ingresa a YouTube
    And   Ingresa a Twitter
    Then  Se debe comprobar la estructura de la nota

  Scenario: Verificar el carroucel de notas top
    When  Ingresa a la primera nota
    And   Cuento las notas Top
    Then  Verificamos la cantidad de notas top