<h1 align="center"> ScreenMatch Alura latam</h1>
<h2>Instalación</h2>
<li>Crear proyecto spring boot: <a href="https://start.spring.io/">Spring Initializr</a></li>
<li>Copiar los archivos del repositorio al proyecto</li>
<h2>Requisitos</h2>
<li>Java JDk 17</li>
<li>Maven instalado <strong>(No tenerlo instalado puede dar error, no deja ejecutar el proyecto)</strong></li>
<h2>Dependencias</h2>
<li>Jackson</li>
<li>Spring</li>
<li>Spring Boot</li>
<h2>Funcionalidades</h2>
<li><code>Funcionalidad 1:</code> Se hace un peticion a la api de OMDB con http</li>
<li><code>Funcionalidad 2:</code> Se utiliza Jackson para descerializar los datos de la peticion</li>
<li><code>Funcionalidad 3:</code> Se trabajo con tipos generios, los utilizamos para evitar repetir codigo en caso de escalar la aplicacion y no usar solo series sino peliculas, etc.</li>