# author: RodrigoTeran
# language: es
# se procede a crear la estructura, prosa y gramatica del gherkin en español, por buenas practicas.
# esto depende mucho de nuestro cliente

@test
Característica: Compra con Autenticación exitosa

  Yo como TAE(Test automation engineer)
  Quiero realizar una prueba de autenticación al sitio web
  Para comprobar la robustes y control de errores del aplicativo web, funcione correctamente


  Antecedentes:
    Dado "Rodrigo" abre el sitio web de pruebas

  @test
  Escenario: Compra con Autenticación de usuario exitosa.
    Cuando Login ingresa las credenciales
    Entonces Compra producto
    Cuando Vayas al carrito de compras llena el formulario
    Entonces Finaliza la compra

