Analizyng Docker Integration CI/CD

Lab Instructions
  1. Review Simulated CI/CD Pipeline Configuration:
    Build Stage:
      Code Commit: Developers commit code to a version control system, triggering the CI pipeline.
      Docker Image Creation: Dockerfiles define the environment and dependencies, and Docker builds an image which encapsulates the application and its runtime.
    
   Test Stage:
     Automated Testing: Docker images are used to spin up containers where automated tests are conducted, ensuring that the application behaves as expected in an environment 
      identical to production.
    
  Deployment Stage:
     Container Registry: Successfully tested Docker images are tagged and pushed to a Docker registry.
     Orchestration and Deployment: Tools like Kubernetes or Docker Swarm manage the deployment of these images into containers across different environments, handling scaling 
     and load balancing.
    
  2. Analyze Enhancements and Potential Issues:
  Enhancements:
      - Se asegura que en cada ambiente quede la misma versión del servicio evitando estár trabajando con diferentes versiones
      - Se asegura que en todos los ambientes cuenten con lo necesario para el correcto funcionamiento del servicio
      - Portabilidad del contenedor a cualquier servidor con docker instalado
      - Facilita el proceso de despliegues en todos los ambientes de desarrollo
      - Independencia entre nuestro contenedores
      - Escalabilidad con cada uno de los contenedores
  
  Potential Issues: 
      - Vulnerabilidad con ciertas versiones de alguna imagen
      - Alta complejidad de administración en proyectos con varios servicios
  
  3. Write an Analysis Report:
  Summarizes how Docker is integrated into each stage of the CI/CD pipeline.
    - Para el primer stage se integra docker para la construcción de nuestra imagen a través del dockerFile con todas las dependencias y librerias necesarias para si correcto 
      funcionamiento. Se puede configurar el pipeline para construir y desplegar en cada uno de los ambientes según sea la necesidad menteniendo la independencia de versiones 
      en cada ambiente.
    - Para el segundo escenario configuramos las pruebas SAST/DAST para la detección temprana de vulnerabilidades de nuestro servicio, estableciendo algunas reglas como 
      coverages para permitir pasar el pipeline a la etapa de despliegue
    - Para el tercer escenario se integra dockers para el registro y despliegue de nuestra imagen en el ambiente correspondiente, el ambiente se puede establecer a través de 
      varables de entorno propias de donde se esté ejecutando el pipe

  Analyzes the benefits and potential challenges identified during the review.
    - El reto principal es el mantener al minimo nuestras vulnerabilidades, con un buen escaneo y actualización constante de nuestras dependencias requeridas, también 
      manetener con lo minimo necesario nuestra imagen en cuestión a permisos. 
  
  Suggests theoretical solutions or best practices to overcome the challenges.
     - Monitoreos constantes para detección de posibles errores o caidas de servicios.
     - Una buena estrategia de escalabilidad y balance de carga en nuestros contenedores.
     - Una buena estrategia de despliegues en nustros ambientes productivos por ejemplo Canary para evitar las caidas de servicio ante posibles errores o malas configuraciones 
       no detectadas en nuestro conteneder


