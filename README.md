
<div align = "center">

<h1> Literalura Challenge Alura </h1>

</div>

### Indice

- [Descripción del proyecto](#descripción-del-proyecto)

- [Estado del proyecto](#Estado-del-proyecto)

- [Características de la aplicación y demostración](#Características-de-la-aplicación-y-demostración)

- [Acceso al proyecto](#acceso-proyecto)

- [Tecnologías utilizadas](#tecnologías-utilizadas)

- [Personas-Desarrolladores del Proyecto](#personas-desarrolladores)


## Descripción del proyecto

<p> Proyecto para registrar libros en una base a partir de una api </p>

<p> Api utilizada: </p>

<ul>

  <li> GUTENDEX </li>

</ul>

<p> Opciones integradas: </p>

<ul>

<li> Buscar libro por titulo </li>
<li> Listar libros registrados </li>
<li> Listar autores registrados </li>
<li> Listar autores vivos en un determinado año </li>
<li> Listar libros por idioma </li>

</ul>


## Estado del proyecto

<p> Proyecto terminado, pero podría retomar un estado de "En desarrollo" en el futuro </p>

## Caracteristicas de la aplicación

 <p> La aplicación consiste en una base de datos manejada en posgres. Al iniciar la aplicación se se desplagara un menu que arroja 6 opciones: </p>

 <ul> 

<li> 1) Buscar libro por titulo </li>
<p> Esta opción permite buscar un libro por su nombre dentro de la api y registrarlo automaticamnete en la base de datos, conectando una tabla da libros, con una tabla de autores, para asi lograr establecer a un autor varios libros sin que estos se repitan dentro de la tabla autores.</p>
<li> 2) Listar libros registrados </li>
<p> Esta opción permite traer todos los libros que se lograron registrar por medio de la primera opción </p>
<li> 3) Listar autores registrados </li>
<p> Esta opción permite traer a todos los autores que se lograron registrar por medio de la primera opcion, siendo en este caso fundamental haber establecido un solo id para un autor y registrarlo en los libro del mismo, para asi mostrar los libros que dicho autor escribio</p>
<li> 4) Listar autores vivos en un determinado año </li>
<p> Esta opción permite traer a todos los autores que se lograron registrar, tal cual como en la opción anterior, pero pidiendo al usuario un valor inicial, que sería de la fecha (año) en que desea ver los autores vivos </p>
<li> 5) Listar libros por idioma </li>
<p> Esta opción arroja varios idiomas tambien como opciones, donde al ingresar una de estas, se mostraran todos los libros en dicho idioma, que se hayan registrado en la base de datos </p>
<li> 0) Salir </li>

 </ul>

<p> La aplicación permite que el usario continue ejecutandola, mientras no marque la opción 0, imprimiendo advertencias y solicitadno nuevamnete los datos si se escriben incorrectamente </p>

## Acceso al proyecto

<p> <a href="https://github.com/DavidIG99/ChallengeLiteralura" > Literalura </a> </p>

## Tecnoligías utilizadas

<p> <a href= "https://docs.oracle.com/en/java/javase/17/docs/api/index.html"> JAVA </a> </p>

<p> <a href= "https://mvnrepository.com/artifact/com.google.code.gson/gson/2.10.1"> Gson.jar </a> </p>

<p> <a href= "https://gutendex.com"> API GUTENDEX </a> </p>

<p> <a href="https://start.spring.io/"> SPRING BOOT </a> </p>

<p> <a href="https://www.postgresql.org"> PosgreSQL</a></p>

## Personas-Desarrolladores del Proyecto

<p> <a href="https://github.com/DavidIG99" > David Idarraga Giraldo </a></p>












