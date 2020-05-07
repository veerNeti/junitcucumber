# junitcucumber
this is a skeliton project
#Java+junit+info cuckes cucumber


###setup for info.cuckes:
- While working with artifacts:
-       info.cukes
- artifactId's used 
-       cucumber-core
-       cucumber-java
-       cucumber-jvm
-       cucumber-junit
-       gherkin
- Version of cucumber 
-       1.2.5
 
User can toggle this to work with io.cucumber:
1. **commenting** the below properties in pom:
``<cucumber.version>1.2.5</cucumber.version>
  <cucumber.groupId>info.cukes</cucumber.groupId>
   <gherkin.groupId>info.cukes</gherkin.groupId>
  ``
2. **Comment** the artifactID:
    `<artifactId>gherkin</artifactId>`
3. **uncomment** the below listed properties:
 ``  <cucumber.groupId>io.cucumber</cucumber.groupId>
     <cucumber.version>5.6.0</cucumber.version>``
3. After making the above listed changes to POM .xml file. 
It is now time to Build your application to manage the imports.

-   Note: You're not allowed to extend classes that define Step Definitions or hooks.

