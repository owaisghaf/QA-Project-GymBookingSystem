# Gym Services Booking Application
### ```Created by Mohammed Owais Ghafoor```

## 1. Project Introduction


The purpose of this application is to allow for multiple customers to create bookings for different services and classes at the gym such as: PT sessions, Swimming, Boxing and High Intensity Interval Training (HIIT).
This is a Back-End system which was created using Spring Boot.  This system can be linked to a Front-End interface in order to make API calls to customer and booking databases, allowing for a more efficient and simplified user experience.  
It utilises CRUD functionality where the 'customer' has a one-to-many relationship with 'Booking'. This aplication will allow the gym itself to access the database and Create, Read, Update or Delete customer and booking information when needed.<br>
<br>

## 2. Application Features

#### Customer

* Create new customers <br>
* Read a specific customer's information using a unique id <br>
* Read a specific customer's information using their name <br>
* Read all customer information <br>
* Update customer information <br>
* Delete customer using unique id <br>


#### Booking

* Create new bookings <br>
* Read a specific booking's information using a unique id <br>
* Read all booking information for a specific type of booking <br>
* Read all booking information <br>
* Update booking information <br>
* Delete booking using unique id <br>
<br>


## 3. Project Structure

Both a descriptive and visual representative of the project structure can be seen below.

1. Entities were created for both Customer and Bookings as data will need to be inputted, read, updated and deleted from the subsequent tables represented by the two classes.<br>
```[Booking.java & Customer.Java]```

2. Controllers were then created for both in order for the user to access the Spring application externally via HTTP requests. This will later be accessed and implemented by other classes.<br>
```[BookingController.java & CustomerController.Java]```

3. Services essentially contain the main logic of a Spring boot application and in this case it takes the relevant CRUD functionality contained in the controllers and implements that logic.<br>
```[BookingService.java & CustomerService.Java]```

4. Repositories provide the methods in order for the program to interact with the Customer and Booking databases.<br>
```[BookingRepository.java & CustomerRepository.Java]```

5. Data Transfer Objects (DTO) were created for both in order to create a set structure for the data which is provided by the API for both customers and bookings.<br>
```[BookingDTO.java & CustomerDTO.Java]```

6. Custom Exceptions were created for both customer and booking which will throw an exception whenever a customer or booking that doesn't exist is attempted to be accessed.<br>
```[BookingNotFoundException.java & CustomerNotFoundException.Java]```

<details>
<summary>Click to see project structure</summary>
<br>
<p align="center">
<img width="550" src=imgs/Project-Structure.jpg>
</p>
</details>

<br>

## 4. Database Structure - ERD Model

An ERD model was created for the project which incorporates all of the attributes for both the Customer and Booking Entities. It demonstrates visually the one to many relationship between Customer and Booking, outlining the primary keys and unique values.<br>
<br>

<details>
<summary>Click to see Database structure</summary>
<br>
<p align="center">
<img width="550" src=imgs/Database-Diagram.jpg>
</p>
</details>

## 5. How to Execute the project

* Ensure that port 8080 is free
* Using MySQL create a database with the name ***'gymbooking'*** running on port 3306. <br>
(These ports can all be configured in the application properties file located in src/main/resources/application.properties)
* Always run the project as a Spring Boot App
* The HTTP requests (CRUD functionality) can now be created and communicated to the database. One way to do this is through the Postman API. <br>

Examples are shown below.

## 6. CRUD Execution

As outlined previously in section 2 a number of features are available within the application which utilise CRUD functinality. Multiple CRUD operations have been tested on both the customer and booking databases. <br>

Click to access the [Postman requests](https://www.postman.com/lively-shadow-848998/workspace/3fb55edd-659f-4740-a253-ac1a1a1f087f/collection/23177939-a4ae2d59-e9cc-46c2-a124-6046c2ab5357?action=share&creator=23177939)


<details>
<summary>Alternatively click to see a picture of the Postman requests</summary>
<br>
<img width="450" src=imgs/AllRequests.jpg>

</details>

<br> 

### Customer Database

The CRUD operations carried out for the Customer database can be seen below. Expand each of the operations to see snapshots of the functions in action.<br>


#### Create/Add a new customer <br> 
<details>
<summary>Click for an image of the execution</summary>
<br>
<img width="550" src=imgs/Customer-CreateAdd.jpg>
</details>


#### Read a specific customer's information using their unique id <br> 
<details>
<summary>Click for an image of the execution</summary>
<br>
<img width="550" src=imgs/Customer-ReadByID.jpg>
</details>


#### Read a specific customer's information using their name <br> 
<details>
<summary>Click for an image of the execution</summary>
<br>
<img width="550" src=imgs/Customer-ReadByName.jpg>
</details>


#### Read all customer information <br> 
<details>
<summary>Click for an image of the execution</summary>
<br>
<img width="550" src=imgs/Customer-ReadallCustomers.jpg>
</details>


#### Update customer information <br> 
<details>
<summary>Click for an image of the execution</summary>
<br>
<img width="550" src=imgs/Customer-Update.jpg>
</details>


#### Delete customer information using their unique id <br> 
<details>
<summary>Click for an image of the execution</summary>
<br>
<img width="550" src=imgs/Customer-DeleteByID.jpg>
</details>

<br> 

### Booking Database

The CRUD operations carried out for the Booking database can be seen below. Expand each of the operations to see snapshots of the functions in action.<br>


#### Create/Add a new Booking <br> 
<details>
<summary>Click for an image of the execution</summary>
<br>
<img width="550" src=imgs/Booking-CreateAdd.jpg>
</details>


#### Read Booking information using the unique booking id <br> 
<details>
<summary>Click for an image of the execution</summary>
<br>
<img width="550" src=imgs/Booking-ReadByID.jpg>
</details>


#### Read Booking information using the booking type <br> 
<details>
<summary>Click for an image of the execution</summary>
<br>
<img width="550" src=imgs/Booking-ReadByType.jpg>
</details>


#### Read all Booking information <br> 
<details>
<summary>Click for an image of the execution</summary>
<br>
<img width="550" src=imgs/Booking-ReadAllBookings.jpg>
</details>


#### Update Booking information <br> 
<details>
<summary>Click for an image of the execution</summary>
<br>
<img width="550" src=imgs/Booking-Update.jpg>
</details>


#### Delete Booking information using the unique booking id <br> 
<details>
<summary>Click for an image of the execution</summary>
<br>
<img width="550" src=imgs/Booking-DeleteByID.jpg>
</details>

<br>

## 7. Testing

#### Customer: Service layer unit tests <br> 
All unit tests were completed and passed for the customer service layer.

<details>
<summary>Click for an image of the execution</summary>
<br>
<img width = 550 src=imgs/CustomerServiceUnitTest.jpg> <br>
</details>

#### Booking: Service layer unit tests <br> 
All unit tests were completed and passed for the booking service layer.

<details>
<summary>Click for an image of the execution</summary>
<br>
<img width = 550 src=imgs/BookingControllerInitialisationTest.jpg> <br>
</details>

#### Customer Controller Initialisation test <br>
Customer rest controller initialisation tests were completed and passed without issues.

<details>
<summary>Click for an image of the execution</summary>
<br>
<img width = 550 src=imgs/CustomerControllerInitialisationTest.jpg> <br>
</details>

#### Booking Controller Initialisation test <br>
Booking rest controller initialisation tests were completed and passed without issues.

<details>
<summary>Click for an image of the execution</summary>
<br>
<img width = 550 src=imgs/BookingControllerIntegrationTest.jpg> <br>
</details>

<br>

## 8. Tools Utilised

* Java 8.0 <br>
* Spring Boot 2.7.0 <br>
* MySQL 8.0.30 <br>
* Maven 4.0.0 <br>
* Postman 10.0.38 <br>
* Github <br>
* Git Bash <br>

<br>

## 9. Reflection and Future Outlook

Upon reflection, I can say that it took some time to fully understand object-oriented programming principles as well as how and when to use different methods, both in built and user created. This was expected given this is my first ever Java project and the first time learning Java. 
A lot of time was spent more so around trying to understand how to properly structure the code and solving errors. However, this got easier and easier the more the project progressed.

Changes are needed on the Controller Integration testing code as I know it is not the application that is causing this due to all manual HTTP requests functioning without issues. Therefore, I will attempt to put in more time to understand why (maybe its something small as it usually is) and rectify the issue.  

There is definitely a lot of scope for improvement and expansion of the application to incorporate additional features. Some of these are: <br>

* Incorporate a Membership Entity which will allow for customers to create gym memberships of different types and durations, seperate from classes and sessions.
* Incorporate a payment gateway through which customer payment details can be stored and used to conduct payment of memberships and other services. This payment gateway would link with the customer, booking and membership entities.
* Build a Front-End interface which would allow for a more interative, efficient and simplified user/customer experience.
* Incorporate employees as an Entity and tie this to the membership and services data. This will allow for in house bookings and membership creations to be linked to employees providing data points which can be audited and analysed for use with things like performance management and security purposes. 
