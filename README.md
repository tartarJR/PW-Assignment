# Planetway Server Assignment
Solutions for task 1, task 2, task 3 and bonus task can be found in this repository.

 * Even though it is not a good practice, I chose to use only one code base for each application to avoid waste of time and overkill.
 * I used a layered package structure for this application but I prefer package per feature approach for bigger applications.
 * I intended and tried to separate concerns as much as I can. I used different controllers and corresponding service and entity/dto classes for task 1, task 2-3 and bonus task.
 * For task 2 and task 3, arithmetical operations can be divided into their own methods for a better REST API structure but I only use one method for the sake of simplicity.
 * I implemented some basic validations for task 2 and task 3 calculation method but I do not think my way of implementation is a good practice for Spring Boot. I skipped for now since it is out of the assignment's scope. But I am willing to learn the best way to implement it.
 * After my research, I used Java's BigDecimal object for arithmetical calculations to avoid strange error.
 * For bonus task, an EmployeeDTO class might be used for having a better encapsulation of domain and repository layers from Service and Controller layers and to avoid partly complex JSON structure caused by self-reference.
 * I have a CommandLineRunner implementation for database seeding. It can be done via raw SQL or EventListeners too. I just chose the simplest way for me.
 * Only two rows of data is populated on app startup. I can add more if you wish.
 * Please feel free to reach me in case you have any questions or suggestions regarding my implementation.