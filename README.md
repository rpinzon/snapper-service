##### Runs a Docker container that contains PostgreSQL
`docker-compose -f postgres-compose.yml up -d`

##### Runs liquibase to update database according to change log
`mvn liquibase:update`

- Configuration used to connect to database are kept in `liquibase.properties` file

:exclamation: You don't need to run this step manually.. It will execute during application startup

##### Creates image for application service using maven-docker-plugin
`mvn package dockerfile:build`

##### Runs a Docker container that contains snapper service linking the database
`docker run -p 8080:8080 --link postgres-psql:postgres-psql --net snapper-service_default rpinzon/snapper-service:0.1.0-SNAPSHOT` 

#### Connects to Docker container running PosgreSQL
`docker exec -it postgres-psql /bin/bash`
