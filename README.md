## APLICACIÓN DISTRIBUIDA SEGURA EN TODOS SUS FRENTES

El siguiente proyecto es una aplicación Web segura que cuenta con los siguientes items:

1. Acceso seguro desde el browser a la aplicación. Es decir garantiza autenticación, autorización e integridad de usuarios.
2. Dos computadores comunicacndose entre ellos y acceso de servicios remotos garantizando: autenticación, autorización e integridad entre los servicios. Nadie puede invocar los servicios si no está autorizado.

y con la siguiente arquitectura:

![image](https://github.com/Luciernagas/Lab07_AREP/assets/104604359/e9eef3fc-5fa7-4f92-adc9-45bd6078f258)

* * *
### Prerrequisitos
Se debe tener instalado java, maven y git.
* Descargar maven en  http://maven.apache.org/download.html
* Descargar git en https://git-scm.com/book/en/v2/Getting-Started-Installing-Git
  
* * *
### Instalando
~~~
git clone https://github.com/Luciernagas/Lab07_AREP.git
~~~
2. En la terminal se debe ingresar el siguiente comando para compilar y empaquetar el proyecto:
~~~
mvn package
mvn clean install
~~~
3. Ejecutar los siguientes comandos para ejecutar la página web:
~~~
java -cp "./target/classes" org.example.SecureApp.SparkService
java -cp "./target/classes" org.example.AllSecureApp.SparkAll
~~~
4. En tu browser ingresa las siguiente ruta:
https://localhost:5001
![image](https://github.com/Luciernagas/Lab07_AREP/assets/104604359/4fe0b16d-e71c-4b2a-af5d-e2f7c1d5183c)

* * *
### Ejecutando pruebas
Se realizó una prueba de integración probando el correcto funcionamiento del proyecto, para ello se validó un usuario y contraseña aprobados previamente.
![image](https://github.com/Luciernagas/Lab07_AREP/assets/104604359/dfaede43-cd9a-4a4e-8b19-207ea9fde1d8)
![image](https://github.com/Luciernagas/Lab07_AREP/assets/104604359/d1131345-b51c-430c-8ee8-36fe3c703771)

Dado el caso de un usuario no validó:
![image](https://github.com/Luciernagas/Lab07_AREP/assets/104604359/de0728d0-6bd6-408f-90e1-3a48b2d33ecf)

* * *
### Arquitectura del prototipo
Como se habia mencionado anteriormente se tiene la arquitectura del dibujo anterior, pero tambien este proyecto contiene los siguientes componentes:

#### SparkAll:

* Es la entrada principal del programa. Se encarga de configurar el servidor Spark y definir las rutas de la aplicación.
* Configura el manejo de archivos estáticos desde la carpeta /public.
* Define una ruta POST /login que recibe datos de autenticación del cliente y realiza una petición a una URL externa usando la clase URLReader.

#### URLReader:

Contiene dos métodos:
* main: Este método carga un archivo de seguridad dado por certificado (truststore), inicializa un SSLContext y lo establece como el contexto SSL predeterminado.
* readURL: Este método toma una URL como entrada, realiza una conexión a esa URL y lee la respuesta del servidor.

#### SparkService:

* Esta clase también configura un servidor Spark y define rutas.
* Define una ruta POST /login que autentica a los usuarios utilizando un conjunto predefinido de credenciales almacenadas en un HashMap.
* Define una ruta GET /bienvenida que muestra un mensaje de bienvenida para los usuarios autenticados.
  
#### User:

* Esta clase define una entidad User con un nombre de usuario y una contraseña.
* Se utiliza para almacenar las credenciales de los usuarios en SparkService.
  
#### index.html:

* La página HTML proporciona un formulario de inicio de sesión. Cuando el formulario se envía, se realiza una solicitud POST a la ruta /login usando JavaScript y se procesa la respuesta.

* * *

* * *
### Construido con
* Maven - Gestión de dependencias

* * *
### Autores
♡ Luisa Valentina De la hoz Rocha ♡

