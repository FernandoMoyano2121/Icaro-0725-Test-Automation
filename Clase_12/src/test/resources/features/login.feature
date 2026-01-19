#==========================================================
# LOGIN.FEATURE - Scenarios de autenticación
#==========================================================
#
#
# éste archivo contiene todos los scenrios relacionados con el login
# de usuarios en SauceDemo
#
# Archivos : src/test/resources/features/login.feature
#==========================================================

Feature: Login de usuarios en SauceDemo
  Como usuario de SauceDemo
  Quiero pode iniciar sesion con mis credenciales
  Para acceder a los productos de la tienda


  # ============================================================
  # SCENARIO 1: Login exitoso (camino feliz)
  # ============================================================
  Scenario: Login exitoso con credenciales validas
    Given estoy en la página de login de SauceDemo
    When ingreso el usuario "standar_user"
    And ingreso la contraseña "secret_sauce"
    And hago click en el botón de login
    Then debería ver la página de inventario
    And el título deberia ser "Products"

  # ============================================================
  # SCENARIO 2: Login fallido usuario bloqueado
  # ============================================================

  Scenario: Login fallido con usuario bloqueado
    Given estoy en la página de login de SauceDemo
    When ingreso el usuario "locked_out_user"
    And ingreso la contraseña "secret_sauce"
    And hago click en el botón de login
    Then debería ver el mensaje "Epic sadface: Sorry, this user has been locked out."

  # ============================================================
  # SCENARIO 3: Login fallido - contraseña incorrecta
  # ============================================================

  Scenario: Login fallido con contraseña incorrecta
    Given estoy een la página de login de SauceDemo
    When ingreso el usuario "standar_user"
    And ingreso la contraseña "password_incorrecto"
    And hago click en el botón de login
    Then debería ver el mensaje "Epic sadface:username and password do not match any user in this service"
    And deberia permanecer en la pagina de Login

  # ============================================================
  # SCENARIO 4: Login fallido - campos vacíos
  # ============================================================
   ...
  # ============================================================
  # SCENARIO 5: Login fallido - solo usuario
  # ============================================================
   ...