2 profiles spring :
- Test : profil utilisant une base embarqué hsqldb et n'utilise pas liquibase
- Prod : profil utilisant une base mysql et utilise liquibase pour mettre à jour le schema

Commande pour lancer le mode prod : mvn clean  spring-boot:run -Dspring.profiles.active=prod