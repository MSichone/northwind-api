# northwind-api
A Spring Boot project to recreate the Northwind database that was originally created by Microsoft and used as the basis for their tutorials in a variety of database products for decades.

### About
The Northwind database is an excellent tutorial schema for a small-business ERP, with customers, orders, inventory, purchasing, suppliers, shipping, employees, and single-entry accounting.

This is the simple database released for Access 95-2003.

![The Original ERD](https://user-images.githubusercontent.com/8201918/172254022-552a5918-06c0-40ff-b655-bb6128493c21.png)

Microsoft has gradually enhanced Northwind (and recently deprecated it, although it is quite forward-compatible).

For this project we will use a schema quite different to the earlier versions that was released with Office 2007.

![Northwind 2010 Schema](https://user-images.githubusercontent.com/8201918/172254125-ca325994-e9df-48a1-af1c-2fb093932f15.png)

### Developer
[Masitano Sichone](https://github.com/MSichone)

### Built With

The application is built with Java and uses Maven for its dependency management.

The following frameworks and libraries are used.

[Spring Boot](https://spring.io/projects/spring-boot)  
[Spring Data](https://spring.io/projects/spring-data)  
[Lombok](https://projectlombok.org/) 


### Database
Microsoft provided a dataset of 17 tables for the newer schema consisting of

No |  Table  | Records
----- | ------------- | :---:
1 | Employees  | 9
2 | Customers  | 29
3 | Suppliers  | 10
4 | Shippers  | 3
5 | Products  | 45
6 | Orders  | 48
7 | Order Details  | 58
8 | Order Details Status  | 4
9 | Order Status  | 4
10 | Order Tax Status  | 2
11 | Inventory Transactions  | 102
12 | Inventory Transaction Types  | 4
13 | Purchase Orders  | 28
14 | Purchase Order Details  | 55
15 | Invoices  | 35 
16 | Privileges  | 1
17 | Employee Privileges  | 1

In this project I use [Dalers - MyWind](https://github.com/dalers/mywind) SQL data script that he converted from the 2010 access database.

This script populates tables that are automatically created from corresponding Java entities by Spring Data JPA (Hibernate). The two entries below in the **application.properties** file ensure that
1. database entity tables are always being recreated at startup and 
2. the **data.sql** file with the table data is ran after the automatic schema-generation.

```
spring.jpa.hibernate.ddl-auto = create-drop
spring.jpa.defer-datasource-initialization = true
```

For demo purposes, I've decided to use an embedded database called [H2](https://www.h2database.com/). You could easily change the `database-platform` & `datasource` to your preferred database from with the **application.properties** file.

H2 database has an embedded GUI console for browsing the contents of a database and running SQL queries. I've enabled it with this `spring.h2.console.enabled=true` entry in the **application.properties** file and you can access this GUI from your browser at [http://localhost:8080/h2-console/](http://localhost:8080/h2-console) 
### Credits   

[Dalers - MyWind](https://github.com/dalers/mywind) - SQL version of the 2010 Microsoft Access Database



