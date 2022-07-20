## Micronaut MongoDB Sample

This project is intended to demonstrate Micronaut MongoDB support in Intellij IDEA.

### Features

#### Gutter icon for entity to navigate to database

The gutter next to class name navigates to corresponding collection:

![entity-gutter](./etc/entity-gutter.png)

#### Gutter icons for fields to navigate to entity fields

There are gutters for entity properties to navigate to collection fields:

![property-gutters](./etc/property-gutters.png)

#### JSON Injection for Query Annotations with Parameter Highlighting

JSON language dialect is injected into Micronaut MongoDB query annotations
with parameters and operators highlighting:

![json-injection](./etc/json-injection.png)

#### Entity Field and Operators Completion

Entity fields and available operators are completed inside queries:

![fields and operators completion](./etc/fields-and-operators-completion.png)

---

## Setup

### Docker Container Setup

1. Open the `Services` tool window and pull `mongo` docker image

    ![pull-docker-image](./etc/pull-mongodb-image.png)

2. Right-click on the pulled image and select `Create container`

    ![create-container](./etc/create-container.png)

3. Set a name for new container and bind ports

    ![setup-container](./etc/setup-container.png)

4. Run the created container

### MongoDB Setup

1. Add MongoDB datasource

    ![add-mongodb-ds](./etc/create-mongodb-ds.png)

2. Setup connection

    ![setup mongodb connection](./etc/setup-mongodb-connection.png)

3. Open DB console and create database with `use mnbooks`

    ![create db](./etc/create-db.png)

4. Create a collection with `db.createCollection("book")`

    ![create collection](./etc/create-collection.png)

5. Fulfill database with data from `db.js`

    ![fulfill db](./etc/fulfill-db.png)

### Setup App Connection with DB

The connection is configured in the `application.yml` file:

```yaml
mongodb.uri: mongodb://${MONGO_HOST:localhost}:${MONGO_PORT:27017}/mnbooks
```

## Application API

There are few endpoints available to test the application:

![App API](./etc/app-api.png)