#Author: sbotero@bancolombia.com.co

@tag
Feature: Registro de usuario en pagina web ninja store
  yo como usuario quiero registrarme en la pagina de Ninja Store

Background:
Given que un usuario se quiere registrar en la pagina de ninja para comprar articulos

  @tag1
  Scenario Outline: Registro de un usuario en the ninja store
    When el usuario se autentique en la pagina llenando los campos "<nombre>" "<apellido>" "<direccion>" "<ciudad>" "<pais>" "<estado>" "<correo>" "<contraseña>" correspondientes
    Then debe ver un mensaje de registro exitoso

           Examples:
            | nombre | apellido | direccion | ciudad | pais | estado | correo | contraseña |
            |Juana   | Gonzales | cra 24-12 | New jersey| Estados Unidos| Alabama | Jg@hotmail.com | abcde1234|
            |Juan   | Gonzales | cra 19-12 | New jersey| Estados Unidos| New Jersey | Jg@hotmail.com | abcde1234|  