# sample-springboot-data-app

This is a sample program for Spring Data with MongoDB.
I have used a example of book shelf and I have shown CRUD opertion on this resource.

Spring Data is an umbrella project consisting of independent projects with, in principle, different release cadences that are specific to a given database.
Spring Data makes it easy to use data access technologies, relational and non-relational databases, map-reduce frameworks, and cloud-based data services.
Data in general, Data access API for Spring applications. Makes it easy to work with different data stores. Exposes a repository programming models and makes it easy to work with those different stores.

Most modules are storage specific modules. Spring Data REST is the odd one out in Spring Data Umbrella project. 

Data REST: not interacting with any stores, but tries to leverage with domain model for your application. Derive a decent default for set of HTTP response. 

The Spring Data MongoDB project provides integration with the MongoDB document database. Key functional areas of Spring Data MongoDB are a POJO centric model for interacting with a MongoDB DBCollection and easily writing a Repository style data access layer.

Spring configuration support using Java based @Configuration classes or an XML namespace for a Mongo driver instance and replica sets.


With Spring Data, we don't have to write DAO implementations anymore. Spring Data manages this for us. To leverage power of Spring Data managed DAO, we need to extends an interface 'MongoRepository' in our Repository interface. The basic CRUD opertions are default managed. In order to add more functionality and Queries, we can declare our own methods. 
The best part is, we do not need to provide an implementation of these methods. These declared methods are declared in such a way that it reads like a Query. For Example, in our used program, in case we want to find a book by its Author, we will declare a method 'findByAuthor(String author)' where 'Author' is a property of BookDetails class. and that's all.
Spring Data manages implementation. It forms a query based on method name.

If you are experienced in Java and Spring programming, Most code here is self explanatory. 

In order to run this example, clone this and import this to IDE of your choice. I used STS (Spring Tools Suite), an IDE provided by Pivotal. After importing this, we can run main class 'SampleSpringBootDataApp' as Java Application. 
