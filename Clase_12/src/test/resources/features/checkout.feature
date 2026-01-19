# ============================================================
# CHECKOUT.FEATURE - Scenarios del proceso de compra
# ============================================================
#
# Este archivo contiene todos los scenarios relacionados
# con el proceso de checkout en SauceDemo.
#
# Archivo: src/test/resources/features/checkout.feature


Feature: Proceso de compra
  Como usuario con productos en el carrito
  Quiero poder completar la compra
  Para recibir mis productos


  # ============================================================
  # BACKGROUND: Usuario logueado con productos en carrito
  # ============================================================
  Background:
    Given estoy logueado como "standard_user"
    And tengo "Sauce Labs Backpack en el carrito

   # ============================================================
   # SCENARIO 1: Checkout exitoso (camino feliz)
   # ============================================================

  Scenario: Checkout exitoso con datos completos
    When voy al carrito
    And procedo al checkout
    And completo el formulario con nombre "Juan" apellido "Perez" y codigo postal "5000"
    And hago click en continuar
    And confirmo la compra
    Then debería ver el mensaje "Thank you for your order!"

  # ============================================================
  # SCENARIO 2: Cancelar checkout
  # ============================================================

  Scenario: Cancelar el proceso de checkout
    When voy al carrito
    And procedo al checkout
    And hago click en cancelar
    Then debería ver el carrito
    And debería ver "Sauce Labs Backpack" en la lista

  # ============================================================
  # SCENARIO 3: Checkout sin nombre
  # ============================================================