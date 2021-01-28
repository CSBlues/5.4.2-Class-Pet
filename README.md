# 5.4.2 Class Pet
You’ve been hired to create a software system for the Awesome Animal Clinic! The clients would like to keep track of their animal patients. 

Here are some attributes of the pets that they would like to track:
- `name`
- `age`
- `weight`
- `type` (dog, cat, lizard, etc.)
- `breed`

1. Create a class that keeps track of the attributes above for pet records at the animal clinic. Decide what instance variables are needed and their data types. Make sure you use int, double, and String data types. Make the instance variables private.
2. Create 2 constructors, one with no parameters and one with many parameters to initialize all the instance variables.
   1. The blank constructor should initialize String instance variables as blank strings `""`, ints as 1, and doubles as 1.0.
   2. The full constructor should initialize each instance variable to the value that is passed as the corresponding parameter.
3. Create Accessor (get) methods for each of the instance variables. Make sure the accessor methods start with `get` followed by the capatalized name of the instance variable. i.e `getName()`, `getAge()`, etc.
4. Create mutator (set) methods for each of the instance variables. Make sure the accessor methods start with `set` followed by the capatalized name of the instance variable. i.e `setName()`, `setAge()`, etc.
4. Create a toString() method that returns all the information in a pet record. Each value in the `toString()` must be separated by a comma followed by a space and be in the following order: `name, age, weight, type, breed`
5. In the main method in Main.java, create 3 pet objects and call their constructors, accessor methods, and toString methods to test all of your methods.

> Make sure you use good commenting!