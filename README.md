##### Runs a Docker container that contains PostgreSQL
`docker-compose -f postgres-compose.yml up -d`

##### Runs liquibase to update database according to change log
`mvn liquibase:update`

- Configuration used to connect to database are kept in `liquibase.properties` file
