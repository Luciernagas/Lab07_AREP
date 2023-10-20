## APLICACIÓN DISTRIBUIDA SEGURA EN TODOS SUS FRENTES

El siguiente proyecto es una aplicación Web segura que cuenta con los siguientes items:

1. Acceso seguro desde el browser a la aplicación. Es decir garantiza autenticación, autorización e integridad de usuarios.
2. Dos computadores comunicacndose entre ellos y acceso de servicios remotos garantizando: autenticación, autorización e integridad entre los servicios. Nadie puede invocar los servicios si no está autorizado.

con la siguiente estructura:

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
### Construido con
* Maven - Gestión de dependencias

* * *
### Autores
♡ Luisa Valentina De la hoz Rocha ♡

