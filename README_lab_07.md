Integrating Design Patterns in a Project Scenario 

Design Challenges:

  Global Configuration Management: Design a system that ensures a single, globally accessible configuration object without access conflicts.
  
  Dynamic Object Creation Based on User Input: Implement a system to dynamically create various types of user interface elements based on user actions.
  
  State Change Notification Across System Components: Ensure components are notified about changes in the state of other parts without creating tight coupling.
  
  Efficient Management of Asynchronous Operations: Manage multiple asynchronous operations like API calls which need to be coordinated without blocking the main application     
  workflow.

Sistema de movilidad  <br/><br/>
1 - Se crea un ENUM para establecer la distancia que varios vehiculos pueden moverse, esta ENUM ejemplifica en singleton pattern. <br/>
<img width="453" alt="image" src="https://github.com/FranciscoEderCabreraParedes/laboratorios-git/assets/140001025/e59a05b5-616c-4da0-a586-055331fdba5d"><br/>

2 - Se crean una interfaz con un metodo move() y las direrentes implementaciones con distintos vehiculos como moto, cart y plane para poder ejemplificar el dinamismo en la creación de objetos a través del factory pattern. <br/>
<img width="493" alt="image" src="https://github.com/FranciscoEderCabreraParedes/laboratorios-git/assets/140001025/d8b78982-49b7-44f4-84d2-c4f7ae73ddfb"> <br/>
<img width="506" alt="image" src="https://github.com/FranciscoEderCabreraParedes/laboratorios-git/assets/140001025/df0be348-dcdc-4107-ba30-c276c628a224"> <br/>
<img width="674" alt="image" src="https://github.com/FranciscoEderCabreraParedes/laboratorios-git/assets/140001025/80f48ef8-443a-4e83-be4f-f383a1dd18a4"> <br/>
<img width="720" alt="image" src="https://github.com/FranciscoEderCabreraParedes/laboratorios-git/assets/140001025/3a3f37a6-ed63-4323-b8a4-8f7b02cb7bea"> <br/>

3 - Se implementa un Observer pattern para notificar un movimiento a nuestros componentes involucrados en la api. <br/>
<img width="536" alt="image" src="https://github.com/FranciscoEderCabreraParedes/laboratorios-git/assets/140001025/169ab109-e58c-4498-9dc1-d9f5fae4c9a7"> <br/>
<img width="739" alt="image" src="https://github.com/FranciscoEderCabreraParedes/laboratorios-git/assets/140001025/5b8e27c5-c489-4727-acde-e5d1af8d5a87"> <br/>

4 - Creamos de manera dinamica nuestros vehiculos para agregarlos al oberser y notificarles su movimiento. <br/>
<img width="691" alt="image" src="https://github.com/FranciscoEderCabreraParedes/laboratorios-git/assets/140001025/32465c7b-c981-4f3a-a899-5630f13f8cc2">










