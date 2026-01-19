# ============================================================
# FLUJO_COMPRA.FEATURE - Scenarios E2E de compra completa
# ============================================================
#
# Este archivo contiene scenarios de flujo completo
# que cubren todo el proceso de compra de principio a fin.
#
# Archivo: src/test/resources/features/flujo_compra.feature
#
# ============================================================

Feature: Flujo completo de compra
  Como usuario de SauceDemo
  Quiero poder realizar una compra completa
  Para obtener los productos que necesito

# ============================================================
# SCENARIO 1: Compra completa de un producto
# Flujo: Login → Agregar → Carrito → Checkout → Confirmar
# ============================================================

  Scenario: Compra exitosa de un producto
    Given estoy en la página de login de SauceDemo
    When ingreso el usuario "standard_user"
    And ingreso la contraseña "secret_sauce"
    And hago click en el botón Login
    And agrego "Sauce Labs Backpack" al carrito
    And voy al carrito
    And procedo al checkout
    And completo el formulario con nombre "Juan" apellido "Perez" y codigo postal "5000"
    And hago click en continuar
    And confirmo la compra
    Then debería ver el mensaje "Thank you for your order!"

# ============================================================
# SCENARIO 2: Compra completa de múltiples productos
# ============================================================