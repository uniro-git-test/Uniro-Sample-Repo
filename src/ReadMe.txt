
Introduction:
Transaction is a set of logical operations that needs to be performed in a specific and ordered manner. 
Transaction Management is a effective methodology that help's in achieving efficient and unambiguous transactions.
Transaction Management aims to offer consistency and validity of the data by facilitating ACID characteristics.

What is ACID ?
ACID stands for Atomicity, Consistency, Isolation, and Durability that help's in exception handling and maintaining proper track of transaction processed.  

Atomicity - It ensures that either all or none of the operations needs to be performed.
Consistency - It ensures that either all operations are rolled back and set to the state back from where the transaction was started or the changes we made and reflected.
Isolation - It ensures that transactions performed are only reflected after a commit.
Durability - It ensures that the committed transactions are persisted.

Operations to control ACID transactions using JDBC:
Deactivate auto-commit, this provides you the control to execute multiple SQL statements within a single transaction, else you will end up executing each SQL statement as a separate transaction.
Every transaction needs to be committed by calling commit() method, this allows to persists those changes within the database permanently, else the changes won't be reflected within the database.
In case of error or a exception is detected within the business logic or SQL failed to execute rollback all the operations by calling the rollback() method, else there'll be a inconsistency in data persisted within the database.  
 
Transaction Management in Spring Boot:


Using Transaction Management within Spring Boot JPA 
Spring Boot offers various plugin such as Hibernate and JPA plugin's that helps to reduce much of boiler plate code required for commit and roll-back operations.
Spring provides @Transactional annotation that tells Spring that there is need to manage transaction for class annotated with @Service annotation.
Spring creates a proxy object wrapping the Service Object and provide the code required for transaction management.

The transaction is initiated by the proxy before control is transfered to the method annotated by @Transactional. The transaction is rolled back if there occurs a Error or RuntimeException else the transaction is commited.
  

In the below example we'll demonstrate a simple example of Transaction Management in Spring Boot

 