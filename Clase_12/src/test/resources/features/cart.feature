# ============================================================
# CART.FEATURE - Scenarios del carrito de compras
# ============================================================

# Este archivo contiene todos los scenarios relacionados
# con el carrito de compras en SauceDemo.
#
# Archivo: src/test/resources/features/cart.feature

# ============================================================


Feature: Carrito de compras
  Como usuario logueado en SauceDemo
  Quiero poder agregar productos al carrito
  Para luego comprarlos

  Background:
    Given estoy logueado como "standard_user"
    And estoy en la página de inventario

  # ============================================================
  # SCENARIO 1: Agregar un producto
  # ============================================================

  Scenario: Agregar un producto al carrito
    When agrego "Sauce Labs Backpack" al carrito
    Then el contador del carrito debería mostrar "1"

  # ============================================================
  # SCENARIO 2: Agregar multiples producto
  # ============================================================

  Scenario: Agregar multiples productos al carrito
    When agrego "Sauce Labs Backpack" al carrito
    And agrego "Sauce Labs Bike Light" al carrito
    Then el contador del carrito debería mostrar "2"


  # ============================================================
  # SCENARIO 3: Ver contenido del carrito
  # ============================================================

  Scenario: Ver productos en el carrito
    Given tengo "Sauce Labs Backpack" en el carrito
    When voy al carrito
    Then debería ver "Sauce Labs Backpack" en la lista
    And debería ver el precio del producto

  # ============================================================
  # SCENARIO 4: Eliminar producto del carrito
  # ============================================================