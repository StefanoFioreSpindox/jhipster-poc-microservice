# JHipster Microservice POC

This application was generated using JHipster 8.1.0, you can find documentation and help at [https://www.jhipster.tech/documentation-archive/v8.1.0](https://www.jhipster.tech/documentation-archive/v8.1.0).
All the applications folders (products & gateway) have been generated using the command
```
jhipster jdl jhip-microsvc-poc.jdl
```
JHipster CLI uses the jdl file to read all the configurations ans all the applications details.

### Docker-Compose
Docker Compose folder has been created manually with 
```
mkdir docker-compose
```
then populated with JHipster CLI:
```
cd docker-compose
```
and finally
```
jhipster docker-compose
```

### Run the application
#### Prerequisites
- Docker daemon needs to be up & running
- Build microservices images:
Run the following command in each root directory of your microservice application (e.g. in products and gateway folders)
```
./mvnw -ntp -Pprod verify jib:dockerBuild
```

To run the microservice application locally, go to the docker-compose folder
```
cd docker-compose
```
run docker-compose up
```
docker-compose up -d
```

The gateway will be reachable on http://localhost:8080/

To tear down the application (in docker-compose folder)
```
docker-compose down
```