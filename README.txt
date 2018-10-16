HOW TO RUN
    1)Clone the project in folder.
    2)Go to IntellijIde and import project.
    3)Choose Maven and press next.
    4)Wait when project will all loaded.
    4)Edit src\main\resources\application.properties file.Write your db connection parameters.
        datasource.url    - after "localhost:3306/" write your db name.
        driver-class-name - make sure that your mysql server in 5 version.If not just change version of "mysql" dependency in pom.xml file.
        datasource.username - set your db username.
        datasource.password - set your db password.
    5)Run project.