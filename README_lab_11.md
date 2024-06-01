

Designing and Simulating AWS Cloud 

Part 1: Designing Cloud Infrastructure

   Se define la infraestructura con los siguientes componentes:  <br/>

   1 - ELB para el balanceo de carga a cada EC2  <br/>
   2 - EC2 para contener nuestros componentes web necesarios (servicios)  <br/>
   3 - S3 para almacenamiento de archivos requeridos en la aplicación  <br/>
   4 - RDS para la disponibilidad de bases de datos en nuestra aplicación  <br/>
   5 - VPC para aislar y controlar el acceso de recursos sensibles de nuestra aplicación <br/> <br/>
    

<img width="847" alt="image" src="https://github.com/FranciscoEderCabreraParedes/laboratorios-git/assets/140001025/ee5e9890-e333-4294-b783-90bfa723993c">


Part 2: IAM Configuration

  Se definenn las politicas y persmisos para cada rol del sistema Desarrollador, Administrador, EC2

  - Desarrollador:
        EC2 / S3 / RDS

  - Administrador:
        EKS / ELB / EC2 / RDS / VPC

  - EC2:
        S3 / RDS


Part 3: Resource Management Strategy

  - Se configura Auto Scaling para la administración de los EC2 de acuerdo a la demanda del sistema y mantener una alta disponibildiad.
  - Se configura ELB para el balanceo de carga a los EC2 y administrar la disponibilidad y tolerancia a fallos.
  - Se configura AWS Budgets para el monitoreo y alertas de los costos que vayan generando las aplicaciones.

Part 4: Theoretical Implementation

  - Se accede a las apis a través de ips publicas definidas en el ELB
  -  El ELB se encarga de balancear y enviar las peticiones a los EC2 de acuerdo a las carga disponible.
  -  Los EC2 contienen los componenctes web encargados de funcionamientos propios de las apis como acceder a S3 para lecturas o escrituras, accesos a bases de datos en RDS para lecturas y escrituras
  -  S3 se encarga de almacenar nustros archivos requeridos en las apis.
  -  RDS se encarga de gestioanr las bases de datos requeridos en las apis.
  -  VPC se encarga de controlar los accesos en la red para la infraestructura.

Part 5: Discussion and Evaluation
  - AWS nos ofrece varias solicionoes para nuestro desarrollo en la nube, la arquitectura propuesta podría ser como la mínima necesaria para una buena implementación de nuestras apis sin dejar atras la seguridad controlando los permisos de cada rol (IAM) y los controles de acceso a la red de ciertos componentes de nuestra api (VPC).

  - La arquitectura ofrece una alta disponibilidad a tráves de la configuración de auto-scaling y el balanceo ELB.

  - También nos permite una configuración y monitore de costos personalizados a través de AWS budgets para mantener cierto control con el presupuesto establecido.  

     

