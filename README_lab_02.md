Advanced Application of All SOLID Principles

TASK 1
  What the issue was
  Which SOLID principle it violated.

  - En el pseudocodigo propuesto se están violando principalmente los siguientes principios:
    - Single Responsability Principle debido a que una sola clase contiene todo el funcionamiento del procesamiento de una orden.
    - Open / Closed Principle debido a que el funcionamiento está abierto tanto a la extensión y modificación.
   
TASK 2
  How your change addresses this violation.
  The benefits your changes bring to the system’s architecture.

  - Para la solución y refactorizacipón del procesamiento de una orden se propone la siguiente arquitectura:

   <img width="369" alt="image" src="https://github.com/FranciscoEderCabreraParedes/laboratorios-git/assets/140001025/6a8828e1-c887-4990-b3be-fd2e9ca4e43e">
  
  Capa DTO
  Contiene el objeto Order en donde se seteara toda la información requerida para el procesamiento de una orden 
  <img width="296" alt="image" src="https://github.com/FranciscoEderCabreraParedes/laboratorios-git/assets/140001025/c9332566-6275-4f8a-9005-69b4d9d27969">


  Capa Repository 
  Contiene el funcionamiento de una Orden que tenga que ver con procesos hacia la base de datos tal como el cambiar el estatus de una orden y validar el inventario de una orden. Se incluye la interfaz con ambos metodos y su implementación solucionando la violación de SRP, OCP y cumpliendo con la DIP  
  <img width="632" alt="image" src="https://github.com/FranciscoEderCabreraParedes/laboratorios-git/assets/140001025/c2cb9531-64c7-4759-93bf-70f1684acf5e">

  Capa de Servicio
  Contiene el funcionamiento para el envio de una notificación de una orden procesada. Se incluye la interfaz con ambos metodos y su implementación solucionando la violación de SRP, OCP y cumpliendo con la DIP  
  <img width="710" alt="image" src="https://github.com/FranciscoEderCabreraParedes/laboratorios-git/assets/140001025/bb0253ee-be7b-4cfd-863d-a5e6ec2edb6d">

  Contien el funcionamiento para procesar los dos tipos de pagos propuestos (Standar y Express), queda abierta a la extensión de funcionamiento y cerrada a la modificación. Se incluye la interfaz con ambos metodos y su implementación solucionando la violación de SRP, OCP y cumpliendo con la DIP <br/>
  <img width="348" alt="image" src="https://github.com/FranciscoEderCabreraParedes/laboratorios-git/assets/140001025/d78c19a6-97e7-42f1-b985-45559d5d4f2c">
  <img width="669" alt="image" src="https://github.com/FranciscoEderCabreraParedes/laboratorios-git/assets/140001025/0807249c-1226-4949-917b-d3a821ff2940">
  <img width="609" alt="image" src="https://github.com/FranciscoEderCabreraParedes/laboratorios-git/assets/140001025/189234eb-10ff-40f4-9633-1b15e0da0dbd">

  Contiene la clase principal OrderService que orquesta todo el procesamiento de una orden. <br/>
    - verifica que exista inventario <br/>
    - procesa el pago seleccionando la implementación correspondiente a través de un factory dependiendo del tipo de orden <br/>
    - actualiza el estatus de la orden e BD <br/>
    - envia la notidicación al customer <br/>
    Se incluye la interfaz con ambos metodos y su implementación solucionando la violación de SRP, OCP y cumpliendo con la DIP <br/>
    <img width="691" alt="image" src="https://github.com/FranciscoEderCabreraParedes/laboratorios-git/assets/140001025/795051be-3cbf-4e79-9cf1-9be594a90ae5">

  Capa Factory
  Contiene la clase factory en la que se implementa el factory pattern para la elección de la implementación correspondiente para el procesamiento de pago. En esta sección damos solución al OCP. <br/>
  <img width="641" alt="image" src="https://github.com/FranciscoEderCabreraParedes/laboratorios-git/assets/140001025/a0969253-47e8-4469-83ef-784e0ffbb04b">

  Podemos comprobar esta arquitectura propuesta a través de la clase MAIN en donde se setean los dos tipos de ordenes y se manda a llamar a la clase OrderService para el procesamiento de cada orden. <br/>
  <img width="550" alt="image" src="https://github.com/FranciscoEderCabreraParedes/laboratorios-git/assets/140001025/81cf6459-55ae-4d5c-bc13-3f5d3e8252c6">


Podemos ejecutar esta clase principal entrando a carpeta demo/src/main/java/example/solid desde cualquier IDE de desarrollo y ejecutar la clase Main.java
