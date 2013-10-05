Spring Transaction Management using Programmatic & Declaration Techniques

- Assumptions
    - Currently using PostgreSQL as the backend.
    - Change the datasource configurations in the respective files to make project compatible with other DBs
    - Remember to specify the respective dependencies in pom.xml (mainly for drivers)
    - Declarative dependency uses Spring own JDBC Template integration
    - Find PostgreSQL compatible DDLs in db folder.

- Build Instructions
    - Run 'mvn test' to test or execute Main classes in the respective folders

- Todos
    - Support a configuration using  embedded H2 so that no changes are required after a git clone.






