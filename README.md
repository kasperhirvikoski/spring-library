spring-library
==============

Maven archetype for a Spring library (Java 8 + Spring 4.2.2.RELEASE).

## Install

Install the archetype to your local Maven repository with `mvn clean install`.

## Usage

Create projects from the archetype.

    mvn archetype:generate -DarchetypeGroupId=com.kytkemo
                           -DarchetypeArtifactId=spring-library
                           -DarchetypeVersion=1.1.9
                           -DgroupId=com.yourcompany
                           -DartifactId=ProjectName
                           -Dpackage=com.yourcompany.projectname

## Developing a Project

After creating a project from the archetype you can do the following tasks.

### Run Tests

Run tests with `mvn test`.

### Build

Create a package with `mvn package`.
