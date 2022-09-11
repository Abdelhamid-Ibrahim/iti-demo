# Module 06: Entity Lifecycle, Callbacks and Listeners

In this module the author will cover the entity lifecycle and explain how callback annotations and listeners can be used to add business logic to the a domain model.

## Code 

The code of this module follows the [Maven](http://maven.apache.org/) directory structure. The `src/main/` directory contains the main source code while you will find the test class under `src/test/`. The `pom.xml` and `assembly.xml` files are Maven specific describes the project and its dependencies.

Once [Maven](http://maven.apache.org/), [H2 Database](http://www.h2database.com) and a [JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html) are installed and the database is up and running, enter the following Maven commands:

* `mvn help:help` : shows Maven help
* `mvn clean`     : cleans the `target` directory
* `mvn compile`   : compiles the code
* `mvn test`      : runs the test case (make sure the H2 database is up and running)
* `mvn exec:java` : executes the main class

## Demo 

This module contains the following demos:

* Demo 01 shows the `Author` entity with several business methods annotated with callback annotations..
* Demo 02 externalizes business logic to entity listeners. These entity listeners can then be registered in several entities. The `persistence.xml` files refers to the `listeners.xml` file that declares the default listener `LifecycleListener`.


*To execute the `Main` classes, compile the code first using `mvn compile` and then use the `mvn exec:java` Maven goal. But make sure to choose the appropriate `Main` class in the `pom.xml` under the `exec-maven-plugin` configuration.*
