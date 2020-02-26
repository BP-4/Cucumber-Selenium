Feature: BackOficce
  Como editor quiero crear un nota en el Master de Ciudad

  Background:
    Given El editor se encuentra en el master de Ciudad

    Scenario: Crear nota
      When Ingreso credenciales correctas
      And  Pulso el boton crear nota
      And  Completo el formulario de la nota
      And  Envio la nota
      Then Verifico la nota creada
