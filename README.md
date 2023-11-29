# Retrofit
Retrofit est une bibliothèque Android développée par Square, Inc., qui simplifie la communication réseau dans les applications Android.Les applications Android modernes nécessitent souvent une communication avec des serveurs distants pour échanger des données. Retrofit facilite cette tâche en simplifiant la mise en œuvre de clients API REST
Retrofit permet de : 
- Simplification de la Communication Réseau
- Gestion Transparente des API REST
- Conversion Automatique des Réponses

## Configuration Requise:
- JDK 1.8 ou supérieur
- Apache Maven 3.x
- MySQL Server installé localement ou distant
- IDE de votre choix pour le backend (Eclipse, IntelliJ, etc.)
- AndroidStudio 

## Lancement de projet:
Clonez ce dépôt sur votre machine locale:
```
https://github.com/yahyamourid/Retrofit.git
```
### Lancement de backend springboot
- Accéder au dossier BackEnd-Spring à l'aide d'un IDE
- Créez une base de données MySQL nommée nom_de_votre_base_de_donnees
- Mettez à jour le fichier `src/main/resources/application.properties` avec les informations de votre base de données :
```
# ===============================
# = DATA SOURCE
# ===============================
# Connection url for the database "boot"
spring.datasource.url = jdbc:mysql://localhost:3306/nom_de_votre_base_de_donnees?serverTimezone=UTC

# Username and password
spring.datasource.username = root
spring.datasource.password =


server.port = 2020
# ===============================
# = JPA / HIBERNATE
# ===============================

# Use spring.jpa.properties.* for Hibernate native properties (the prefix is
# stripped before adding them to the entity manager).

# Show or not log for each sql query
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.show-sql = true
spring.jpa.properties.hibernate.format_sql=true

# Hibernate ddl auto (create, create-drop, update): with "update" the database
# schema will be automatically updated accordingly to java entities found in
# the project
spring.jpa.hibernate.ddl-auto = update

#springdoc.swagger-ui.path=/swagger-ui
```
- Compilez et exécutez l'application avec votre IDE ou avec la console en exécutant les commandes :
```
 mvn clean install
 mvn spring-boot:run
```
### Lancement dans android studio 
- Ouvrir le dossier EmployeApp
- Executer le projet

## L'utilisation de Retrofit
### Dépendances
```
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
```
### Interface ServiceApi pour Retrofit
![image](https://github.com/yahyamourid/Retrofit/assets/128039351/54aa4765-2922-451c-82ce-3a4b3f9950c2)
L'interface ServiceApi est un composant clé lors de l'utilisation de Retrofit dans le développement d'applications Android. Cette interface détaille les points d'accès auxquels l'application peut se connecter pour effectuer des opérations CRUD (Create, Read, Update, Delete) sur des ressources de service.
Les méthodes déclarées dans l'interface sont basées sur les contrôleurs dans le backend:
![image](https://github.com/yahyamourid/Retrofit/assets/128039351/cb74802d-0c99-46f5-8400-4be44888b473)






