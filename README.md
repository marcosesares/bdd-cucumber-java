# BDD-Cucumber-Java

Example usage of BDD with Cucumber and JUnit!

## Use Maven

Open a command window and run:

    ./mvnw test

This runs Cucumber features using Cucumber's JUnit Platform Engine. The `Suite`
annotation on the `CucumberRunnerTest` class tells JUnit to kick off Cucumber.

## Use Gradle

Open a command window and run:

     ./gradlew test --rerun-tasks --info

This runs Cucumber features using Cucumber's JUnit Platform Engine.
