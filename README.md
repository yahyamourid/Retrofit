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

## Lancement du projet:
Clonez ce dépôt sur votre machine locale:
```
https://github.com/yahyamourid/Retrofit.git
```
### Lancement de backend springboot
- Accéder au dossie BackEnd-Spring à l'aide d'un IDE
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





