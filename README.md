**CREANDO UN WEB SERVICE CON JAX-WS**

1) Ejecute el comando `mvn clean verify`

2) Compile la imagen `docker build . --build-arg artifact_id=ws-project --build-arg artifact_version=1.1 -t ws-project:1.1`

3) Súbalo a su Container Registry preferido para el despliegue.

![Drag Racing](./docs/jaxws-simpleClientAndService.gif)