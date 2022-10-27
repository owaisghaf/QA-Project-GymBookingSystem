# Gym Services Booking Application
### Created by Mohammed Owais Ghafoor

## 1. Project Introduction


The purpose of this application is to allow for multiple customers to create bookings for different services and classes at the gym such as: PT sessions, Swimming, Boxing and High Intensity Interval Training (HIIT).
This is a Back-End system which was created using Spring Boot.  This system can be linked to a Front-End interface in order to make API calls to customer and booking databases, allowing for a more efficient and simplified user experience.  
It utilises CRUD functionality where the 'customer' has a one-to-many relationship with 'Booking'. This aplication will allow the gym itself to access the database and Create, Read, Update or Delete customer and booking information when needed.<br>
<br>

## 2. Application Features

***Customer***

* Create new customers <br>
* Read a specific customer's information using a unique id <br>
* Read a specific customer's information using their name <br>
* Read all customer information <br>
* Update customer information <br>
* Delete customer using unique id <br>


***Booking***

* Create new bookings <br>
* Read a specific booking's information using a unique id <br>
* Read all booking information for a specific type of booking <br>
* Read all booking information <br>
* Update booking information <br>
* Delete booking using unique id <br>
<br>

## 3. Project Structure

***The structure of the project can be seen below***

<details>
<summary>Click to see project structure</summary>
<p align="center">
<img width="550" src=imgs/Project-Structure.jpg>
</p>
</details>

## 4. Database Structure - ERD Model

An ERD model was created for the project which incorporates all of the attributes for both the Customer and Booking classes. It demonstrates visually the one to many relationship between Customer and Booking, outlining the primary keys and unique values.<br>
<br>

<details>
<summary>Click to see Database structure</summary>
<br>
<p align="center">
<img width="550" src=imgs/Database-Diagram.jpg>
</p>
</details>

## 5. CRUD Execution

As outlined previously in section 2 a number of features are available within the application which utilise CRUD functinality. Multiple CRUD operations have been tested on both the customer and booking databases. <br>


<details>
<summary>Click for the direct Postman requests</summary>

shorturl.at/suwRT

</details>


<details>
<summary>Alternatively click to see a picture of the Postman requests</summary>

<img width="550" src=imgs/AllRequests.jpg>

</details>

<br> 

### Customer Database

The CRUD operations carried out for the Customer database can be seen below. Expand each of the operations to see snapshots of the functions in action.<br>


#### Create/Add a new customer <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width="550" src=imgs/Customer-CreateAdd.jpg>
</details>


#### Read a specific customer's information using their unique id <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width="550" src=imgs/Customer-ReadByID.jpg>
</details>


#### Read a specific customer's information using their name <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width="550" src=imgs/Customer-ReadByName.jpg>
</details>


#### Read all customer information <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width="550" src=imgs/Customer-ReadallCustomers.jpg>
</details>


#### Update customer information <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width="550" src=imgs/Customer-Update.jpg>
</details>


#### Delete customer information using their unique id <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width="550" src=imgs/Customer-DeleteByID.jpg>
</details>

<br> 

### Booking Database

The CRUD operations carried out for the Booking database can be seen below. Expand each of the operations to see snapshots of the functions in action.<br>


#### Create/Add a new Booking <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width="550" src=imgs/Booking-CreateAdd.jpg>
</details>


#### Read Booking information using the unique booking id <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width="550" src=imgs/Booking-ReadByID.jpg>
</details>


#### Read Booking information using the booking type <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width="550" src=imgs/Booking-ReadByType.jpg>
</details>


#### Read all Booking information <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width="550" src=imgs/Booking-ReadAllBookings.jpg>
</details>


#### Update Booking information <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width="550" src=imgs/Booking-Update.jpg>
</details>


#### Delete Booking information using the unique booking id <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width="550" src=imgs/Booking-DeleteByID.jpg>
</details>

<br>

## 6. Testing

#### Customer: Service layer unit tests <br> 

All unit tests were completed and passed for the customer service layer.

<details>
<summary>Click for an image of the execution</summary>
<img width = 550 src=imgs/CustomerServiceUnitTest.jpg> <br>
</details>

#### Booking: Service layer unit tests <br> 

All unit tests were completed and passed for the booking service layer.

<details>
<summary>Click for an image of the execution</summary>
<img width = 550 src=imgs/BookingServiceUnitTest.jpg> <br>
</details>

#### Booking Controller integration test <br>

<details>
<summary>Click for an image of the execution</summary>
<img width = 550 src=[------------------------------]> <br>
</details>

#### Customer Controller integration test <br>

<details>
<summary>Click for an image of the execution</summary>
<img width = 550 src=[------------------------------]> <br>
</details>

## 7. Tools Utilised

* Java 8.0 <br>
* Spring Boot 2.7.0 <br>
* MySQL 8.0.30 <br>
* Maven 4.0.0 <br>
* Postman 10.0.38 <br>
* Github <br>
* Git Bash <br>

## 8. Reflection and Future Outlook

