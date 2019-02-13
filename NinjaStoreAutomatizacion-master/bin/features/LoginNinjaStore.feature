# Authors: 	sbotero@bancolombia.com.co
 @Feature
Feature: Login de la pagina ninja store
	yo como usuario
	quiero logearme en la pagina de ninja store
	para comprar articulos de la pagina
	
	@Login
  Scenario: ingresar credenciales login
    Given que un usuario quiere comprar productos de la pagina de ninja store
    When el usuario ingrese las credenciales en la pagina 
    Then el vera el catalogo de los productos

