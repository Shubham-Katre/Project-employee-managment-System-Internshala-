<center>
<h1>Employee Managment</h1>
</center>
<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
</center>
This project is a Employee address built using Spring Boot with Java.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model

The Employee Class And Address Class  is defined inside the model packages which has the following attributes:
   
 
   inside Employee Class:- <br>
   
 id (integer)<br>
 name (string)<br>
 email (string)<br>
 phone (string)<br>
 address (string)
   


---

## Data Flow

1. The user sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

## Functions used :-

### API Endpoints :-
</br>
<b> addEmployees </b>

* PostMapping: /addEmployees 

This endpoint makes a call to method in EmployeeService class which is connected to database. In database we add a new Employee given through API.


* GetMapping: 

This endpoint returns data of specific Employee based on id through API.


* PutMapping: 

This endpoint makes a call to method in EmployeeService class which is connected to database. In database we update Employee.


* DeleteMapping: 

This endpoint makes a call to method in EmployeeService class which is connected to database. In database we delete Employee through API.


---

## CrudRepository extends by IEmployee and IAddress interface.


We have used CrudRepository as a database to implement CRUD Operations.

---

## 📝Project Summary

I have created Employee Managment System Can delete, update.  can find. etc...
