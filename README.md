**Revenge of the Pancakes**
Some notes on this exercise: 
I did the exercise but added some additional code (Unit Tests) which I think plays into the role of a SDET or QADEV.  They test a class called Flips in /src/main/java.
All unit tests are located in src/test/java
Code coverage report is located in org.test, just open the index.html

Resource files are located in src/test/resources.  This is a folder where the test suite files reside for testNG.  The suite files control how tests are run from maven command line.

Tests can be run in multiple ways:

In IDE be sure to setup a testng runtime configuration specifying a suite file such as /src/test/resources/unit.xml
From Maven Command Line using "mvn test"

If you would like to see any other code that I have worked on recently here are some links:
https://github.com/deanml/DeployCheck - A Springboot service to do quality gate validation in Sonarqube via restful endpoints.
https://github.com/deanml/HallowHue - A Python project to interact with the hue API's for light control.
https://github.com/deanml/nodequotes - A full stack node.js service with react.js front end.
https://github.com/deanml/springbootangularapp - A full stack springboot Angular application.
https://github.com/deanml/TestCatalog - An integration test catalog service with React front end for recording, running and reporting on integration tests that run as docker containers.