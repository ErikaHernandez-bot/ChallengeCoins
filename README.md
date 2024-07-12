<h1 align="center"> Challenge Conversor de Monedas </h1>

<h2> Descripcion del proyecto </h2>
Conversor de Monedas. Se realizan solicitudes a una API de tasas de cambio, se manipulan los datos JSON y, finalmente, se filtran y muestran las monedas de interés.

<h2> Estado del proyecto </h2>
Finalizado. Se podría agregar una función donde el usuario escriba la moneda que desea u no se le limite a 5 opciopnes, por supúesto se debería mejorar la lógica para 
que la consulta se realice en menos tiempo.

<h2> Funcionalidad </h2>: 
Construyendo el Cliente para Solicitudes (HttpClient)

Se empleó la clase HttpClient para realizar solicitudes a la API de libros y obtener datos y optimizar el proceso de la solicitud.

Construyendo la Solicitud (HttpRequest)

Se usó la clase HttpRequest para configurar y personalizar las solicitudes a la API de libros. 

Construyendo la Respuesta (HttpResponse)
Se usó la interfaz HttpResponse para gestionar las respuestas recibidas de la API. Se puede trabajar con códigos de estado, 
encabezados y el cuerpo de la respuesta, que normalmente se presenta en formato JSON.

<h3>Analizando la respuesta en formato JSON y convirtiendo datos</h3>

Con la biblioteca Jackson, se realizó el mapeo eficiente de los datos JSON a objetos Java, facilitando así la extracción y manipulación de la información con clases como ObjectMapper, para acceder a las distintas propiedades de la respuesta JSON.
Fue fundamental crear métodos específicos para manejar estos datos (getters, setters and toString())
Se usaron las anotaciones @JsonIgnoreProperties y @JsonAlias para obtener los atributos deseados del cuerpo de respuesta json.

<h2> Acceso al proyecto </h2>: 
Una vez instaladas todas las herramientas de desarrollo, recomiendo leer la documentación de la API para entender de que forma se pueden edificar consultas y tener nociones básicas de como manejar Postman.


<h2> Tecnologías utilizadas </h2>: 
Java JDK
Biblioteca Gson 
Postman 
IntelliJ IDEA
