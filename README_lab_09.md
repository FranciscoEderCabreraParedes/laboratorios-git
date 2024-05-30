Designing and Implementing a Microservices Architecture

Monolithic E-Commerce Application Description:
The application is a traditional e-commerce platform that encompasses all functionalities within a single, unified software architecture. The application handles the following key operations:

  User Management: Manages user profiles, authentication, and authorization. It stores personal information, manages login sessions, and handles user preferences.
  
  Product Catalog: Maintains a comprehensive list of products, including descriptions, pricing, images, and inventory levels. It supports product search and categorization 
  functionalities.
  
  Order Processing: Manages all aspects of the ordering process, from cart management to order placement, payment processing, and order history tracking.
  
  Customer Support: Handles customer inquiries, returns, complaints, and feedback through a ticket-based system integrated with the user and order databases.

  

Para la migración de la arquitectura monolitica a microservicios para este laboratorio se propondría la estrategía de Big-Bang Migration debido a la idea de que el objetivo es migrar todo de un solo proceso.

De acuerdo a la metodologia DDD podemos identificar 4 diferenetes dominios, por lo cual separaremos la funcionalidad en 4 diferentes microservicios priorizandolos en el siguiente orden: <br/>
  - Users
  - Products
  - Orders
  - CustomerSupport

    El microsericio Users con los siguientes paths a desarrollar:<br/>
        /profile<br/>
        /authentication<br/>
        /authorization<br/>

    El microservicio Products con los siguientes paths a desarrollar<br/>
       /products<br/>
       /search<br/>

    El microservicio Orders con los siguientes paths a desarrollar<br/>
      /orders<br/>
      /payments<br/>
      /history<br/>

    El microservicio CustomerSupport con los siguientes paths a desarrollar<br/>
      /inquiries<br/>
      /returns<br/>
      /complaints<br/>

Para la propuesta de la base de datos lo ideal sería una BD por cada microservicio sincronizada a través de tecnologías como kafka, me parecio una buena estrategía también la siguiente propuesta para el manejo de la BD: <br/>

<img width="1150" alt="image" src="https://github.com/FranciscoEderCabreraParedes/laboratorios-git/assets/140001025/b69d068c-66bc-42dd-b1e3-3b6fcf179c08">





      



