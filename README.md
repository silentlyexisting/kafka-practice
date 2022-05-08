# kafka-practice

## Description:

Repo created for educational purposes.

Kafka project with Configure Topics, Producers and Consumers + Spring Boot and Restful API

Producer receives the json from the client and sends it to the Consumer, which adds it to the database.

## Run application with Docker compose
```
docker-compose up
```

## Configuration:

Producer `server.port` is `7000`

Consumer `server.port` is `7001`


## POST: /api/v1/students
```json
{
  "firstName": "Michael",
  "lastName": "Reed",
  "city": "Chicago",
  "college": {
    "name": "University of Chicago",
    "grade": 3,
    "attendance": 75,
    "subjects": [
      "English",
      "Geometry",
      "Physics",
      "World History"
    ]
  }
}
```
