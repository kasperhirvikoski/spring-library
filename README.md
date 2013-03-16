# spring-library

Maven archetype for a Spring Library (Java 7).

## Install

Install to local repository with `mvn clean install`.

## Usage

Create projects from the archetype with the following command:

    mvn archetype:generate -DarchetypeGroupId=com.kytkemo
                           -DarchetypeArtifactId=spring-library
                           -DarchetypeVersion=1.0.3
                           -DarchetypeRepository=local
                           -DgroupId=com.yourcompany 
                           -DartifactId=ProjectName
                           -Dpackage=com.yourcompany.projectname
