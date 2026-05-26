



Folder PATH listing for volume Windows
Volume serial number is DA0D-6406
C:.
|   !toc.md
|   
+---.files
|   \---json
+---.idea
|       .gitignore
|       Camel_By_in28min.iml
|       compiler.xml
|       encodings.xml
|       jarRepositories.xml
|       misc.xml
|       modules.xml
|       vcs.xml
|       workspace.xml
|       
+---camel-microservice-a
|   |   .gitattributes
|   |   .gitignore
|   |   camel-main-in28min.zip
|   |   HELP.md
|   |   mvnw
|   |   mvnw.cmd
|   |   pom.xml
|   |   README.md
|   |   
|   +---.idea
|   |       .gitignore
|   |       compiler.xml
|   |       encodings.xml
|   |       jarRepositories.xml
|   |       misc.xml
|   |       vcs.xml
|   |       workspace.xml
|   |       
|   +---.mvn
|   |   \---wrapper
|   |           maven-wrapper.properties
|   |           
|   +---files
|   |   +---input
|   |   |   \---.camel
|   |   |           1000.json
|   |   |           1000.xml
|   |   |           1001.json
|   |   |           1001.xml
|   |   |           1002.json
|   |   |           1002.xml
|   |   |           data.csv
|   |   |           single-line.csv
|   |   |           
|   |   +---output
|   |   |       1000.json
|   |   |       1000.xml
|   |   |       1001.json
|   |   |       1001.xml
|   |   |       1002.json
|   |   |       1002.xml
|   |   |       data.csv
|   |   |       single-line.csv
|   |   |       
|   |   \---test
|   |           1000.json
|   |           
|   +---src
|   |   +---main
|   |   |   +---java
|   |   |   |   \---camel_microservice_a
|   |   |   |       |   CamelMicroserviceAApplication.java
|   |   |   |       |   
|   |   |   |       \---route
|   |   |   |           +---a
|   |   |   |           |       MyFirstRouter.java.txt
|   |   |   |           |       MyFirstRouter2026.java
|   |   |   |           |       
|   |   |   |           +---b
|   |   |   |           |       MyFileRouter.java
|   |   |   |           |       
|   |   |   |           \---c
|   |   |   |                   ActiveMqSenderRouter.java
|   |   |   |                   ActiveMqSenderRouter.java.txt
|   |   |   |                   
|   |   |   \---resources
|   |   |       |   application.properties
|   |   |       |   
|   |   |       +---static
|   |   |       \---templates
|   |   \---test
|   |       \---java
|   |           \---camel_microservice_a
|   |                   CamelMicroserviceAApplicationTests.java
|   |                   
|   \---target
|       +---classes
|       |   |   application.properties
|       |   |   
|       |   \---camel_microservice_a
|       |       |   CamelMicroserviceAApplication.class
|       |       |   
|       |       \---route
|       |           +---a
|       |           |       GetCurrentTimeBean.class
|       |           |       MyFirstRouter2026.class
|       |           |       SimpleLoggingProcessor.class
|       |           |       SimpleLoggingProcessorComponent.class
|       |           |       
|       |           +---b
|       |           |       MyFileRouter.class
|       |           |       
|       |           \---c
|       |                   ActiveMqSenderRouter.class
|       |                   
|       +---generated-sources
|       |   \---annotations
|       +---generated-test-sources
|       |   \---test-annotations
|       +---maven-status
|       |   \---maven-compiler-plugin
|       |       +---compile
|       |       |   \---default-compile
|       |       |           createdFiles.lst
|       |       |           inputFiles.lst
|       |       |           
|       |       \---testCompile
|       |           \---default-testCompile
|       |                   createdFiles.lst
|       |                   inputFiles.lst
|       |                   
|       +---surefire-reports
|       |       camel_microservice_a.CamelMicroserviceAApplicationTests.txt
|       |       TEST-camel_microservice_a.CamelMicroserviceAApplicationTests.xml
|       |       
|       \---test-classes
|           \---camel_microservice_a
|                   CamelMicroserviceAApplicationTests.class
|                   
+---camel-microservice-b
|   |   .gitattributes
|   |   .gitignore
|   |   HELP.md
|   |   mvnw
|   |   mvnw.cmd
|   |   pom.xml
|   |   
|   +---.idea
|   |       .gitignore
|   |       compiler.xml
|   |       encodings.xml
|   |       jarRepositories.xml
|   |       misc.xml
|   |       workspace.xml
|   |       
|   +---.mvn
|   |   \---wrapper
|   |           maven-wrapper.properties
|   |           
|   +---src
|   |   +---main
|   |   |   +---java
|   |   |   |   \---camel_microservice_b
|   |   |   |       |   CamelMicroserviceBApplication.java
|   |   |   |       |   CurrenyExchange.java
|   |   |   |       |   
|   |   |   |       \---routes
|   |   |   |               ActiveMqReceiverRouter.java
|   |   |   |               
|   |   |   \---resources
|   |   |       |   application.properties
|   |   |       |   
|   |   |       +---static
|   |   |       \---templates
|   |   \---test
|   |       \---java
|   |           \---camel_microservice_b
|   |                   CamelMicroserviceBApplicationTests.java
|   |                   
|   \---target
|       |   camel-microservice-b-0.0.1-SNAPSHOT.jar
|       |   camel-microservice-b-0.0.1-SNAPSHOT.jar.original
|       |   
|       +---classes
|       |   |   application.properties
|       |   |   
|       |   \---camel_microservice_b
|       |       |   CamelMicroserviceBApplication.class
|       |       |   CurrenyExchange.class
|       |       |   
|       |       \---routes
|       |               ActiveMqReceiverRouter.class
|       |               
|       +---generated-sources
|       |   \---annotations
|       +---generated-test-sources
|       |   \---test-annotations
|       +---maven-archiver
|       |       pom.properties
|       |       
|       +---maven-status
|       |   \---maven-compiler-plugin
|       |       +---compile
|       |       |   \---default-compile
|       |       |           createdFiles.lst
|       |       |           inputFiles.lst
|       |       |           
|       |       \---testCompile
|       |           \---default-testCompile
|       |                   createdFiles.lst
|       |                   inputFiles.lst
|       |                   
|       +---surefire-reports
|       |       camel_microservice_b.CamelMicroserviceBApplicationTests.txt
|       |       TEST-camel_microservice_b.CamelMicroserviceBApplicationTests.xml
|       |       
|       \---test-classes
|           \---camel_microservice_b
|                   CamelMicroserviceBApplicationTests.class
|                   
\---files
    +---json
    \---test
