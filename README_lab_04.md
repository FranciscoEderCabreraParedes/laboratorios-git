Implementing and testing application security

Scenario 1: Pseudo-Code for Authentication System

    FUNCTION authenticateUser(username, password):
      QUERY database WITH username AND password
      IF found RETURN True
      ELSE RETURN False
  
    Análisis: en el pseudocode propuesto se pueden observar principalmente vulnerabilidades en donde estamos mandando la información sin encriptar y permitiendo la inyección SQL.
    Solución: La solución es convertit el query a una consulta con un framework (springdata) o parametrizar la consulta para evitar principalmente la inyeccipon SQL. 

      FUNCTION authenticateUser(username, password)
          query = QUERY database WITH username = ? AND password = ?
          query.setParameter(1, username)
          query.setParameter(2, password)
          found = query.execute
          IF found RETURN True
          ELSE RETURN False

Scenario 2: JWT Authentication Schema

    DEFINE FUNCTION generateJWT(userCredentials):
    IF validateCredentials(userCredentials):
      SET tokenExpiration = currentTime + 3600 // Token expires in one hour
      RETURN encrypt(userCredentials + tokenExpiration, secretKey)
    ELSE:
      RETURN error

      Analisis: Se están validando las credenciales pero no se está cumpliendo con firmar el secret con algún metodo de cifrado.
      Solución: Agregar un metodo de crifrado al validar las credenciales.

    DEFINE FUNCTION generateJWT(userCredentials):
    IF validateCredentials(userCredentials):
      SET tokenExpiration = currentTime + 3600 // Token expires in one hour
      RETURN encrypt(userCredentials + tokenExpiration, sign(HS512, secretKey))
    ELSE:
      RETURN error  

Scenario 3: Secure Data Communication Plan

    Se propone la parte complementaria para el plan de comunicación seguro. 
    
    PLAN secureDataCommunication:
    IMPLEMENT lastest version of SSL/TLS for all data in transit
    USE strong encrypted storage solutions for data at rest
    ENSURE all data exchanges comply with HTTPS protocols
    USE httpOnly
    USE strong cipher suites
    USE manage encryption keys
    INCLUDE Transparent Data Encryption for SQL
    USE encryption features for NoSQL
