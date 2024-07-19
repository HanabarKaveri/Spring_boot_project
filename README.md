## AquaUnity: Collaborative Efforts for Clean Water and Sanitation Solutions
### Problem Statement:
The lack of access to clean water and sanitation continues to be a pressing global issue, particularly impacting vulnerable communities. Our proposed solution is to develop a unified online platform that connects volunteers, facilitates donations, and implements sustainable projects. 
### Objectives:
 * The platform will aggregate data on polluted lakes, rivers, and other water bodies, enabling users to pinpoint areas in urgent need of cleanup.
 * The platform should be able to display the volunteers who is near to the location of the polluted water resource.
   
### Sustainable Development Goal:6
#### Clean water and sanitization:
This goal directly addresses the need for universal access to safe and affordable drinking water and adequate sanitation for all. By ensuring access to clean water and sanitation facilities, SDG 6 aims to improve health outcomes, reduce water-related diseases, and enhance overall well-being.
#### Target : 6.3 
By 2030, improve water quality by reducing pollution, eliminating dumping and minimizing release of hazardous chemicals and materials, halving the proportion of untreated wastewater and substantially increasing
recycling and safe reuse globally.
####  Performance Indicator(PI) : 6.3.2 
Proportion of bodies of water with good ambient water quality.
###  Issues:
#### 1) Social
* Improved Public Health: Access to clean water is essential for drinking, sanitation, and hygiene practices, reducing the incidence of water-related illnesses and improving overall well-being.
#### 2) Economic
* Public Health Savings: Healthy populations are more productive and require fewer medical interventions, resulting in long-term savings for healthcare systems and individuals.
#### 3) Environment
* Biodiversity Conservation: Cleaner water environments support a diverse range of aquatic species, including fish, amphibians, and invertebrates.
* Improvement of Water Resources: Cleaner water resources resulting from cleanup activities benefit not only aquatic life but also provide essential resources for human communities.
###  Implementation
####  Implementation Platforms
A significant portion of the backend project involved working with Java code and the Spring Boot framework, executed using IntelliJ IDEA. The rest of the development, including the frontend and its integration with the backend, was done using Visual Studio Code. For the database, we used MySQL.
#### Programming Language
 The programming languages used in this project include:
  * React framework for frontend.
  * Java for backend.
  * Swagger for APIs testing.
#### Packages/Libraries
These dependencies cover the necessary libraries for building a Spring Boot application with JPA for database access, email functionality, web services, logging,API documentation, development tools, MySQL connectivity, and reduced boiler plate code with Lombok.
1) Spring Boot Dependencies
   * spring-boot-starter-data-jpa
   * Spring-boot-starter-mail
   * Spring-boot-starter-web
2) Additional Libraries
   * mysql-connector-j
   * Lombok
3) Build Plugins
   * Maven
### Implementation Process
To initialize a Spring Boot project, we used the Spring Initializer tool. This tool helps to generate a project structure with the necessary configurations. When setting up the project, we selected inbuilt dependencies like Spring Web for building web applications and RESTful services, Spring Data JPA for database interactions and ORM capabilities, Java Mail Sender for handling email functionalities, and a database driver ( MySQL) for managing data storage. These dependencies provide a robust foundation for developing a full-featured application efficiently by leveraging Spring Boot’s integration capabilities. This runs on port : 8080 by default.
### Testing
The tools we used for testing were Swagger and Selenium.
#### 1) Swagger:
Swagger simplifies API testing through its interactive Swagger UI, generated from the OpenAPI Specification. This UI allows developers to send requests (GET,POST, etc.) to API endpoints, input parameters, headers, and view expected responses and status codes. It serves as a comprehensive testing interface, enabling thorough validation of API functionality and facilitating exploratory testing by modifying inputs in real-time. Swagger’s integration with the OpenAPI Specification ensures consistent documentation and automated testing, enhancing API development efficiency and reliability.
#### 2) Selenium:
After testing the APIs we tested the tools Selenium for testing over website. Our test cases encompassed a range of scenarios, such as user authentication, form submissions, data retrieval. This holistic approach ensured thorough testing coverage across both backend APIs and frontend user interactions.
###  Results And Outcomes:
The website developed for water cleanliness and sanitation has catalyzed community involvement through several key outcomes. Firstly, it has significantly increased community engagement by providing a platform where members can participate in initiatives and discussions related to water management and sanitation. Secondly, the website has improved access to critical information by offering resources on effective sanitation solutions, sustainable water practices, and ongoing community projects.
Moreover, it has streamlined processes for donations and volunteer registrations, thereby encouraging active participation and support from community members. The platform’s role as an educational hub has also been pivotal, raising awareness about the importance of clean water and proper sanitation practices. Quantifiable metrics, such as increased website traffic, volunteer sign-ups, and donations, underscore the website’s tangible impact on community involvement and project outcomes.




