# GatherGrid
GatherGrid is a platform that allows users to create, promote, manage and participate in events. This platform offers event organizers a user-friendly way to plan and promote events, while attendees can search, register and interact with various types of events.

# Technologies

<details>
  <summary>Tomcat</summary>

### Overview :
    apache Tomcat is a free and open-source implementation of the Jakarta Servlet.
    
### Version : 
    10.1.14

### Download :
    navigate to this url :
https://tomcat.apache.org/download-10.cgi#10.1.14

### Configuration :
    * extract the files on the correct destination based on operation system
    * navigate to '/tomcat/conf'
    * open and add some users:

```xml
    <role rolename="manager-gui"/>
    <user username="manager" password="manager" roles="manager-gui"/>
    
    <role rolename="admin-gui"/>
    <user username="admin" password="admin" roles="manager-gui,admin-gui"/>
```
### Execution
    * navigate to '/tomcat/bin'
    * run the startup.sh command file
</details>

<details>
  <summary>Jakarta</summary>

### Overview :
    Jakarta EE, formerly Java Platform, Enterprise Edition and Java 2 Platform, Enterprise Edition, is a set of specifications, extending Java SE with specifications for enterprise features.

### Version :
    9.1
### Setup :
    Download intellij or any preferred IDE
    Start a new project type jakarta
        -> Project Name
        -> Template : web application.
        -> Server : choose tomcat and import file we have downloaded and extracted earlier.
        -> JDK 11.
        -> hit next .
    Time to chose implementations and specefications ( listed below in maven section )

### Configuration :
    * extract the files on the correct destination based on operation system
    * navigate to '/tomcat/conf'
    * open and add some users:

```xml
    <role rolename="manager-gui"/>
    <user username="manager" password="manager" roles="manager-gui"/>
    
    <role rolename="admin-gui"/>
    <user username="admin" password="admin" roles="manager-gui,admin-gui"/>
```
### Execution
    * navigate to '/tomcat/bin'
    * run the startup.sh command file
</details>

<details>
  <summary>Maven</summary>

### Overview :
    Maven is a build automation tool used primarily for Java projects.

### How to : 
    if found in the creation of project include it , If not include using [alt+insert -> click dependency] in the pom.xml file
### Dependencies :
    * Hibernate : version 6.2.4
    * jakarta persistence api (JPA) : version 3.1.0
    * Servlet : version 6.0.0
    * mysql : version 8.1.0
</details>

# Architecture
    .
    ├── src
    │   ├── main
    │   │   ├── java
    │   │   │   └── com
    │   │   │       └── example
    │   │   │           └── gathergrid
    │   │   │               ├── conf
    │   │   │               │   └── init
    │   │   │               ├── dao
    │   │   │               ├── domains
    │   │   │               ├── services
    │   │   │               └── servlets
    │   │   ├── resources
    │   │   │   └── META-INF
    │   │   └── webapp
    │   │       └── WEB-INF
    │   └── test
    │       ├── java
    │       └── resources
    .





