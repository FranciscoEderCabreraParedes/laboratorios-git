API Design and documentation Workshop


  Se diseña la versión 1.0 de una API destinada a la administración de una estetica para mascotas. La API cuenta con las opciones para registrar a un usuario y registrar un nuevo servicio de cuidados para una mascota:

    openapi: 3.0.0
    info:
      version: '1.0'
      title: Pet-Care
      description: Servicios para el cuidado de tu mascota
    servers:
      # Added by API Auto Mocking Plugin
      - description: SwaggerHub API Auto Mocking
        url: https://virtserver.swaggerhub.com/FRANCISCOCABRERA/p3tCare/1.0
    components:
      schemas:
        Care:
          type: object
          required:
            - id
            - userId
            - careType
            - petName
            - price
            - comments
            - status
          properties:
            id:
              type: string
              example: "1"
            userId:
              type: string
              example: "eder.cabrera"
            careType:
              type: string
              example: "Baño completo"
            petName:
              type: string
              example: "Peluza"
            price:
              type: integer
              example: 350
            comments:
              type: string
              example: "Adicional cortar uñas y bañar con shampoo antipulgas"
            status:
              type: string
              example: "En proceso"
        User:
          type: object
          required:
            - id
            - name
            - userName
            - password
            - phone
          properties:
            id:
              type: string
              example: "1"
            name:
              type: string
              example: "Eder Cabrera"
            userName:
              type: string
              example: "eder.cabrera"
            password:
              type: string
              example: "********"
            phone:
              type: string
              example: "557685940384"
    paths: 
      /cares:
        get:
          summary: List all cares in process
          operationId: listCares
          responses:
            "200":
              description: A list of cares
              content:
                application/json:
                  schema:
                    type: array
                    items:
                      $ref: "#/components/schemas/Care"
        post:
          summary: Add a new pet care
          operationId: addCare
          requestBody:
            required: true
            content:
              application/json:
                schema:
                  $ref: "#/components/schemas/Care"
          responses:
            "201":
              description: Care registered 
      /cares/{careId}:
        get:
          summary: Retrieve a single care
          operationId: getCare
          parameters:
            - name: careId
              in: path
              required: true
              schema:
                type: string
          responses:
            "200":
              description: Details of a care
              content:
                application/json:
                  schema:
                    $ref: "#/components/schemas/Care"
            "404":
              description: Care not found
        put:
          summary: Update a care info
          operationId: updateCare
          parameters:
            - name: careId
              in: path
              required: true
              schema:
                type: string
          requestBody:
            required: true
            content:
              application/json:
                schema:
                  $ref: "#/components/schemas/Care"
          responses:
            "200":
              description: Cat updated
            "404":
              description: Care to update not found
      /users:
        get:
          summary: List all users
          operationId: listUsers
          responses:
            "200":
              description: A list of users
              content:
                application/json:
                  schema:
                    type: array
                    items:
                      $ref: "#/components/schemas/User"
        post:
          summary: Create User
          operationId: addUser
          requestBody:
            required: true
            content:
              application/json:
                schema:
                  $ref: "#/components/schemas/User"
          responses:
            "201":
              description: User created
      /users/{userId}:
        get:
          summary: Retrieve a single user
          operationId: getUser
          parameters:
            - name: userId
              in: path
              required: true
              schema:
                type: string
          responses:
            "200":
              description: Details of a user
              content:
                application/json:
                  schema:
                    $ref: "#/components/schemas/User"
            "404":
              description: User not found
        put:
          summary: Update a user
          operationId: updateUser
          parameters:
            - name: userId
              in: path
              required: true
              schema:
                type: string
          requestBody:
            required: true
            content:
              application/json:
                schema:
                  $ref: "#/components/schemas/User"
          responses:
            "200":
              description: User updated
            "404":
              description: User to update not found


  De los principales retos para el diseño de esta primera versión de la API involucran en desmenuzar las necesidades de una estetica canina, Diseñando los servicios requeridos que cuenten con la información mínima necesaria para un correcto funcionamiento, sin la necesidad de confundir al usuario o hacer apis pesadas por el uso de demasiada información. Cada componente creado debe contar el tipo de dato mas conveniente para su finalidad, dejar en claro las descripciones de cada path así como sus request necesarios y sus diferentes tipos de respuesta. El definir los posibles errores para poder establecer una estrategia de manejo de cada error.

  Se aplica el principio de API First para el diseño de esta primera versión para dejar claridad entre la partes involucradas el número de paths a utilizar, los tipos de componentes, tipos de datos, tipos de errores a utilizar. A experiencia personal API First tambien nos ayuda a detectar posibles inconsistencias de datos entre cada metodo o calcular que tan grande se puede convertir nuestra API para ir desmenusando o desacoplando mas cada servicio.

  El aprendizaje de este ejercicio es el mantener una documentación consistente, clara, bien versionada la cual es bastante util en la evolución de nuestras APIS, evitando retrabajo en cuestiones a desarrollo, una mala implementación podría llevar a la poca claridad de una API, confusiones entre FRONT - BACK entre lo que se pretende desarrollar y lo que se espera de cada path.

  
