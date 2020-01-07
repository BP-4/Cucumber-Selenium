Feature: Seccion del header
  Como usuario quiero ingresar a todas las secciones en el header de Ciudad

  Scenario: Ingresar a la seccion En Vivo desde el header de la home
    Given  El usuario se encuentra en la pagina home de ciudad
    When   Hace click en el boton EN VIVO
    Then   Se debe redirigir a la seccion En Vivo

  Scenario: Ingresar a la seccion Lo Ultimo desde el header de la home
    Given  El usuario se encuentra en la pagina home de ciudad
    When   Hace click en el boton LO ULTIMO
    Then   Se debe redirigir a la seccion Lo Ultimo

  Scenario: Ingresar a la seccion Internacional desde el header de la home
    Given  El usuario se encuentra en la pagina home de ciudad
    When   Hace click en el boton Internacional
    Then   Se debe redirigir a la seccion Internacional

  Scenario: Ingresar a la seccion Qué Look el header de la home
    Given  El usuario se encuentra en la pagina home de ciudad
    When   Hace click en el boton Qué Look
    Then   Se debe redirigir a la seccion Qué Look

  Scenario: Ingresar a la seccion Videos el header de la home
     Given  El usuario se encuentra en la pagina home de ciudad
     When   Hace click en el boton Videos
     Then   Se debe redirigir a la seccion Videos

  Scenario: Ingresar a la seccion Portfolio el header de la home
     Given  El usuario se encuentra en la pagina home de ciudad
     When   Hace click en el boton Portfolio
     Then   Se debe redirigir a la seccion Portfolio