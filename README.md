# Gym Services Booking Application
### Created by Mohammed Owais Ghafoor

## 1. Project Introduction

***The purpose of this application is to allow for multiple customers to create bookings for different services and classes at the gym.<br> This includes PT sessions, Swimming, Boxing and High Intensity Interval Training (HIIT). It utilises CRUD functionality where the 'customer' has a one-to-many relationship with 'Booking'. 
This will allow the gym itself to access the database and Create, Read, Update or Delete customer and booking information when needed.***<br>
<br>

## 2. Application Features

***Customer***

* Create/add new customer <br>
* read a specific customer's information using a unique id <br>
* read a specific customer's information using their name <br>
* read all customer information <br>
* update customer information <br>
* delete customer using unique id <br>


***Booking***

* Create/add new booking <br>
* read a specific booking's information using a unique id <br>
* read all booking information for a specific type of booking <br>
* read all booking information <br>
* update booking information <br>
* delete booking using unique id <br>


## 3. Project Structure

***The structure of the project can be seen below***
<br>
<p align="center">
<img width="650" src=imgs/Project-Structure.jpg>
</p>

## 4. Database Structure - ERD

<details>
<summary>"Click to expand"</summary>


</details>

<br>
<p align="center">
<img width="650" src=imgs/Database-Diagram.jpg>
</p>

## 5. CRUD Execution

***As outlined previously in section 2 a number of features are available within the application which utilise CRUD functinality. Multiple CRUD operations have been tested on both the customer and booking databases.*** <br>

<details>
<summary>Click for the direct Postman requests</summary>

shorturl.at/suwRT

</details>

<br> 

### Customer Database

***The CRUD operations carried out for the Customer database can be seen below. Expand each of the operations to see snapshots of the functions in action.***<br>

#### Create/Add a new customer <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width="600" src=imgs/Customer-CreateAdd.jpg>
</details>

#### Read a specific customer's information using their unique id <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width="600" src=imgs/Customer-ReadByID.jpg>
</details>

#### Read a specific customer's information using their name <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width="600" src=imgs/Customer-ReadByName.jpg>
</details>

#### Read all customer information <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width="600" src=imgs/Customer-ReadallCustomers.jpg>
</details>

#### Update customer information <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width="600" src=imgs/Customer-Update.jpg>
</details>

#### Delete customer information using their unique id <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width="600" src=imgs/Customer-DeleteByID.jpg>
</details>

<br> 

### Booking Database

***The CRUD operations carried out for the Booking database can be seen below. Expand each of the operations to see snapshots of the functions in action.***<br>

#### Create/Add a new Booking <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width="600" src=imgs/Booking-CreateAdd.jpg>
</details>

#### Read Booking information using the unique booking id <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width="600" src=imgs/Booking-ReadByID.jpg>
</details>

#### Read Booking information using the booking type <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width="600" src=imgs/Booking-ReadByType.jpg>
</details>

#### Read all Booking information <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width="600" src=imgs/Booking-ReadAllBookings.jpg>
</details>

#### Update Booking information <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width="600" src=imgs/Booking-Update.jpg>
</details>

#### Delete Booking information using the unique booking id <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width="600" src=imgs/Booking-DeleteByID.jpg>
</details>

<br>

## 6. Testing

#### Service layer unit tests: User <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width = 600 src=[------------------------------]> <br>
</details>

#### Service layer unit tests: Account <br> 
<details>
<summary>Click for an image of the execution</summary>
<img width = 600 src=[------------------------------]> <br>
</details>

#### Booking Controller integration test <br>
<details>
<summary>Click for an image of the execution</summary>
<img width = 600 src=[------------------------------]> <br>
</details>

#### Customer Controller integration test <br>
<details>
<summary>Click for an image of the execution</summary>
<img width = 600 src=[------------------------------]> <br>
</details>
