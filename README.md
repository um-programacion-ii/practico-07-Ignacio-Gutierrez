# prog2.2024.practico07
# First Spring Project
Primera implementación de Spring usando Java

## Funcionalidad  
- CRUD básico de una entidad usando el framework Spring
- No hay uso de motor de base de datos, los datos se emulan con un Map
- Enumeración de Clases definidas
  - Controller: define los endpoints utilizados
  - Service: el controller le envía las peticiones recibidas, contiene las reglas de negocio
  - Repository: implementación de un patrón DAO que resuelve la comunicación de la aplicación con la "base de datos"
    - GET findAll(): recupera todos los registros
    - GET findOne(id): recupera sólo los datos del registro con el id indicado
    - POST add(Entity): agrega un registro nuevo a la base de datos devolviendo la entity completa en formato JSON
    - PUT update(Entity, id): actualiza los valores del registro indicado
    - DELETE deleteOne(id): elimina el registro indicado
- El archivo **requests.http** en la raíz del proyecto contiene pruebas válidas para cada uno de los endpoints definidos

- La rama branch está protegida, sólo se puede hacer un PR y luego un merge (settings)
## Tech Stack  
**Client:** curl | postman | insomnia | http

**Server:** Spring, Java, Spring Boot, Spring Web

## Reference  
[Example](https://github.com/dqmdz/spring_java_proof_of_concept/tree/spring-java-proof-of-concept-mysql  
)  