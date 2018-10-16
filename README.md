# Local Run instructions
    
    Make sure You have installed MySql Server on your local machine
    
    1. `git clone` by repo link
    2.  Go to IntellijIde and import project.
    3.  Choose Maven and press next until finish.
    4.  Wait till the project full loading.
    5.  Edit src\main\resources\application.properties file.Write your db connection parameters.
        datasource.url      - after "localhost:3306/" write your db name.
        driver-class-name   - make sure your MySQL version >= 5.0 If no, change the dependency in "pom.xml".
        datasource.username - set your db username.
        datasource.password - set your db password.
    5.  Run project.
    6.  `http://localhost:8080/number/give_number?number=5`  open in your browser to save number 5 in table.
    7.  `http://localhost:8080/number/get_smallest_number`   open in your browser to get smallest number.
    9.  `http://localhost:8080/number/get_largest_number`    open in your browser to get largest number.
    10. `http://localhost:8080/number/get_average_of_numbers՝ open in your browser to get average of numbers.