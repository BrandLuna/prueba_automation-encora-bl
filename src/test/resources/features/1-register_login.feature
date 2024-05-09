@Suite @RegisterAndLogin
Feature: CP01 - Validar login y registro de usuario
  Background: Validar que se logre registrar y loguear a un nuevo usuario correctamente

    Given que el usuario se encuentra en el home de la web


    @ValidRegister
    Scenario: 1 - Validar un registro con datos correctos
      When selecciona la opción de nuevo registro
      Then el usuario ingresara sus datos para el registro
      Then el usuario se registrará correctamente

    @ValidLogin
    Scenario: 2 - Validar un login con datos correctos
      When ingresa sus credenciales validas
      Then la aplicacion muestra la pantalla de inicio

