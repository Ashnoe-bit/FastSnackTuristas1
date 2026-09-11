# FastSnackTuristas

Sistema de Comida Rápida

Grupo: Las Turistas

Problemática

Los locales de comida rápida necesitan una forma organizada y eficiente de gestionar a sus clientes, productos y pedidos. Cuando estos procesos se realizan manualmente, pueden presentarse problemas como errores al registrar los pedidos, pérdida de información, dificultades para calcular correctamente los valores de una compra y poca organización de los datos.

A partir de esta necesidad se desarrolló FastSnack, una aplicación de escritorio creada en Java que permite gestionar de manera sencilla el proceso de compra de comida rápida. El sistema permite registrar usuarios, iniciar sesión, seleccionar productos, realizar pedidos y generar los comprobantes correspondientes. Además, cuenta con un acceso para empleados que permite administrar y consultar la información relacionada con las compras.

La aplicación busca mejorar la organización del local, reducir errores durante el proceso de venta y facilitar el manejo de la información mediante una conexión con una base de datos MySQL.

Tecnologías utilizadas
Lenguaje de programación: Java.
Interfaz gráfica: Java Swing mediante formularios JFrame.
Base de datos: MySQL y Aiven.
Conexión: JDBC.
Driver: mysql-connector-j.
Entorno de desarrollo: NetBeans.
Control de versiones: Git.
Funcionalidades

FastSnack cuenta con diferentes funcionalidades para gestionar el proceso de compra:

Pantalla de bienvenida: permite al usuario acceder a las diferentes opciones de la aplicación.
Registro: permite crear una cuenta ingresando nombre, apellido, correo, usuario y contraseña.
Inicio de sesión: permite que los clientes ingresen utilizando sus credenciales.
Inicio de sesión de empleado: permite que el personal autorizado acceda a las funciones correspondientes.
Menú: muestra los productos disponibles para que el cliente pueda seleccionar los que desea comprar.
Carrito de compras: permite agregar productos y revisar los elementos seleccionados.
Personalización del pedido: permite agregar indicaciones o modificaciones al pedido.
Cálculo del pedido: realiza el cálculo del subtotal, IVA del 15 %, envío y total.
Número de pedido: permite identificar cada compra mediante un número automático.
Método de pago: permite seleccionar el método de pago correspondiente.
Factura: muestra la información de la compra de forma organizada.
Recibo: genera un comprobante con los datos principales del pedido.
Base de datos: almacena la información de usuarios, productos y pedidos en MySQL.
Estructura del proyecto

El proyecto está organizado mediante una separación por capas, lo que permite mantener el código ordenado y facilitar su mantenimiento.

Modelo

Contiene las clases encargadas de representar los datos y objetos utilizados en el sistema:

Persona: clase abstracta que contiene información común.
Usuario: representa a los usuarios registrados y hereda de Persona.
Producto: contiene la información de los productos.
ItemPedido: representa cada producto incluido en un pedido.
Sesion: mantiene la información relacionada con el usuario que inició sesión y el carrito.
Catalogo: permite organizar los productos disponibles.
DocumentoInvalidoException: excepción personalizada para controlar documentos que no cumplen las condiciones establecidas.
BD

Contiene las clases encargadas de la conexión y comunicación con la base de datos:

Conexion: establece la conexión con MySQL.
UsuarioDAO: administra las operaciones relacionadas con los usuarios.
ProductoDAO: administra la información de los productos.
PedidoDAO: administra el registro y consulta de los pedidos.
Vista

Contiene las ventanas y formularios que utiliza el usuario:

FrmBienvenida: pantalla de bienvenida.
FrmRegistro: formulario para registrar usuarios.
FrmLogin: inicio de sesión del cliente.
FrmMenu: menú principal para seleccionar productos.
FrmEmpleado: acceso y panel del empleado.
FrmFactura: muestra la factura.
FrmRecibo: muestra el recibo.

La separación de estas capas permite que cada parte del programa tenga una función específica y evita concentrar todo el código en una sola clase.

Conceptos técnicos aplicados

Durante el desarrollo de FastSnack se aplicaron diferentes conceptos de programación orientada a objetos y conexión con bases de datos.

Patrón Singleton:
Se aplica en la clase Conexion, cuyo objetivo es controlar la creación de la conexión con la base de datos. La clase posee un constructor privado y una única instancia que puede obtenerse mediante getInstancia(). Esto permite centralizar la conexión y evitar crear múltiples instancias innecesarias.

Herencia:
La clase Usuario hereda de Persona mediante extends Persona. Esto permite reutilizar los atributos y métodos comunes definidos en la clase padre.

Clase abstracta:
Persona es una clase abstracta que contiene información común y define métodos que deben ser implementados por las clases que heredan de ella.

Polimorfismo:
Se utiliza cuando una clase hija puede implementar su propia versión de un método definido en la clase padre. En este proyecto, Usuario implementa el método getTipoUsuario() definido en Persona.

Manejo de excepciones:
Se utiliza try-catch para controlar errores que pueden producirse durante las operaciones con la base de datos y otras operaciones del sistema. Esto evita que la aplicación se cierre inesperadamente.

Excepción personalizada:
Se creó DocumentoInvalidoException para controlar específicamente los casos en los que un documento ingresado no cumple con el formato establecido.

Throw:
Se utiliza throw para lanzar manualmente una excepción cuando se detecta una situación que debe ser controlada por el programa.

JDBC:
JDBC permite establecer la comunicación entre Java y MySQL. Gracias a esta tecnología, la aplicación puede guardar, consultar y modificar información de la base de datos.

Maven y dependencias:
Maven permite administrar las dependencias utilizadas en el proyecto. Una de las principales es mysql-connector-j, que permite conectar Java con MySQL mediante JDBC.

Separación por capas:
La aplicación está dividida en Modelo, BD y Vista. Esta organización permite separar los datos, la conexión con la base de datos y la interfaz gráfica, haciendo que el proyecto sea más ordenado y fácil de mantener.

Cómo se ejecutó el proyecto

Para ejecutar el proyecto FastSnack se siguieron varios pasos.

Primero, se creó la base de datos en MySQL y se ejecutó el script fastfood.sql, el cual contiene la estructura necesaria para almacenar la información de usuarios, productos y pedidos.

Después, se configuró la conexión en la clase Conexion.java, colocando los datos correspondientes para acceder a la base de datos. También se configuró la dependencia mysql-connector-j mediante Maven para permitir la comunicación entre Java y MySQL.

El proyecto fue desarrollado utilizando NetBeans y se trabajó con Git para el control de versiones y la colaboración entre los integrantes del grupo.

Una vez configurada la base de datos y las dependencias, se ejecutó la clase principal Main. Al iniciar el programa aparece la pantalla de bienvenida, desde donde el usuario puede acceder al registro o al inicio de sesión.

El cliente puede registrarse, iniciar sesión, ingresar al menú, seleccionar los productos que desea comprar, agregarlos al carrito, personalizar su pedido, seleccionar el método de pago y obtener la factura y el recibo correspondientes.

Por otro lado, el empleado cuenta con su propio inicio de sesión y puede ingresar al panel correspondiente para consultar y gestionar la información relacionada con las facturas y recibos.

Finalmente, toda la información generada durante el funcionamiento de la aplicación se almacena en la base de datos MySQL mediante la conexión JDBC.

Autoras

Dayanna Maldonado, Scarleth Montiel, Milena Tómala, Maily Bacusoy, Jiang Jiamei y Ashley Navarro.

Tercero de Informática A
