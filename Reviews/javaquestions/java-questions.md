
## Core Java

### Basic
* What is Java? / Why Java?
  * A high-level OOP language with rich API libraries, widely used around the world, supported by Oracle. Write once run anywhere (WORA), static types, compiled language. Used extensively in enterprise applications.
* What is JRE / JDK / JVM?
  * JVM - Java virtual machine. Runs compiled Java code
  * JRE - Java runtime environment. Contains the standard Java libraries and packages. Also contains JVM.
  * JDK - Java developer kit. Has a compiler, debugger, etc. Contains JRE and JVM.
* What is an object / class?
  * Class is a blueprint for an object
* How would you compile and execute a Java program?
  * Need a JDK, use `javac ProgramName.java` command, then `java ProgramName` to execute on JRE
* What is the main method signature? How does the String array parameter get populated?
  * `public static void main(String[] args)` - the String array is populated by arguments passed into the command line when program is run
* What is the root class from which every class extends?
  * The `Object` class
* What methods are available in the Object class?
  * `.clone`, `.hashcode`, `.equals`, `.toString`
* If two objects are equal, do they have the same hashcode? If not equal?
  * If two objects have the same hashcode then they are NOT necessarily equal. But if objects are equal, then they MUST have same hashcode.
* What are the primitive data types in Java?
  * boolean, byte, short, int, long, float, double, char
* What are the default values for all data types in Java?
  * Objects - `null`
  * int, short, byte, long, float, double - 0
  * boolean - `false`
  * char - 'u0000' (null character)
* Predict the output
  * 1 prints "foo"; 2 prints "foobar"; 3 prints false; 4 prints true
```java
String str = "foo";
str.concat("bar");
StringBuilder sb = new StringBuilder("foo");
sb.append("bar");
System.out.println(str); // 1
System.out.println(sb);  // 2
```
* What is the difference between `String`, `StringBuilder`, and `StringBuffer`?
  * Strings are immutable.  Both `StringBuilder` and `StringBuffer` are mutable.  Furthermore, `StringBuffer` is sychronized while `StringBuilder` is not.
* What are annotations?
  * A type of syntactic metadata added to the code, read by the compiler - use `@` syntax

### Intermediate
* How would you clone an object?
  * First, tag the class with the `Cloneable` marker interface. Next, invoke `clone()`. The clone method is declared in `java.lang.Object` and does a shallow copy.
* Where are Strings stored?
  * In the String pool in the heap
* Explain stack vs heap?
  * Heap is where objects are stored in memory. Stack is where local variable references are kept - a new stack is created for each method invocation
* What is a POJO? What is a bean?
  * POJO - plain old Java object. Any Java object that you create.
  * Bean - a POJO that has private data members, public getters/setters, and overrides `.hashcode()`, `.equals()`, and `.toString()` methods
* How can you force garbage collection in Java?
  * Garbage collection cannot be forced but only requested using `System.gc()`.
* How many objects are created? What is the output?
  * Ans: 2 objects; a = true; b = true; c = false; d = true; e = true; f = true
```java
String s1 = "hello";
String s2 = "hello";
String s3 = new String("hello");

System.out.println(s1 == s2);       // a
System.out.println(s1.equals(s2));  // b
System.out.println(s1 == s3);       // c
System.out.println(s1.equals(s3));  // d
```
* What is the difference between `==` and `.equals()`?
  * `==` -  tests to see if two reference variables refer to the exact same instance of an object.
  * `.equals()` - tests to see if the two objects being compared to each other are equivalent, but they need not be the exact same object. This method should be overridden from the `Object` class. The default implementation falls back to `==` behavior.
* Why are strings immutable in Java?
  * Identical String literals are collected in the "String pool" in an effort to conserve memory. Reference variables will then point to the same String object instance. Changing the object's state in the String pool will make changes to all references to that String object. Instead, when a change to a String is made, the JVM makes a new String object, and the reference variable points to the new String in the String pool.
* What are the non-access modifiers in Java?
  * `static`, `final`, `abstract`, `default`, `synchronized`, `transient`, 
  * obscure keywords: `volatile`, `native`, `strictfp`
* What is the difference between `static` and `final` variables?
  * `static` variables are shared by all the instances of objects and it has only single copy. A `final` variable is a constant and it cannot be changed. However, if the variable holds a reference to an object, the state of the object may still be changed and manipulated.
* What data types are supported in switch statements?
  * `String`, `int`, `char`, `short`, `byte`, `enums`
* How to pass multiple values with a single parameter into a method?
  * Use varargs with elipses syntax (`public void myMethod(String... strings)`)
* Which, if any, lines are valid/invalid?
  * Ans: line B is NOT allowed (compilation error). Instance variables cannot be accessed from `static` context
```java
public class A {
  public static int x = 1;
  public int y = 2;

  public static void doStuff() {
    System.out.println(x);  // A
    System.out.println(y);  // B
  }

  public void doMoreStuff() {
    System.out.println(x);  // C
    System.out.println(y);  // D
  }
}
```
* What are static imports?
  * Importing a static method or variable from a class so you can access without using the class name - syntax: `import static`
* What is the first line of constructor?
  * The compiler will insert `super()` as the first line - it cannot be used anywhere else in constructor except for the first line
* Can you instantiate this class? Why or why not? What happens when we write our own constructor?
```java
public class Hello {}
```
* What are enumerations (enums)?
  * A special Java type that defines a collection of constants

### Advanced
* How would you make an immutable object?
  * Declare the class as `final` so it can't be extended.
  * Make all fields `private` so that direct access is not allowed.
  * Don't provide setter methods for variables.
  * Make all mutable fields final so that it's value can be assigned only once.
  * Initialize all the fields via a constructor performing deep copy.
  * Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
* What is static block?
  * Used for static initialization. Executed only once - upon creation of first object of class or access to static method of class
* What are 3 usages of `super` keyword?
  * to refer to immediate parent class instance variable.
  * `super()` is used to invoke immediate parent class constructor (also can pass params)
  * to invoke immediate parent class method.
* Is Java pass-by-value or pass-by-reference?
  * Java is strictly pass by value. Even when object references are passed as arguments, it is the value of the reference that is passed
* How to make numbers in your code more readable?
  * Use the `_` for numeric literals - must be placed between numbers

## OOP

### Basics
* What are the 4 pillars of OOP? Explain each one.
  * Abstraction - Hiding implementation details - use abstract classes and interfaces to achieve this.
  * Polymorphism - Subclasses of a class can define their own unique behaviors and yet share some of the same functionality of the parent class. An object can also be referenced by its supertype "parent" class, for example `ParentClass obj = new SubClass()`. Method overriding and overloading are also examples of polymorphism.
  * Inheritance - A class that is derived from another class is called a subclass (also a derived class, extended class, or child class). The class from which the subclass is derived is called a superclass (also a base class or a parent class).
  * Encapsulation can be described as a protective barrier that prevents the code and data being randomly accessed by other code defined outside the class. Access to the data and code is tightly controlled by an interface.
* What are the access modifiers in Java? Explain them.
  * `public`  - can be accessed from any package.
  * `private` - only members of the same class can access.
  * `protected` - can be accessed by classes inside the package and subclasses anywhere.
  * `default` - no access by classes or subclasses outside the package
* What is the difference between method overloading and overriding?
  * Method overriding - In a subclass when one declares an identical method from the superclass, this method overrides the one in the superclass.
  * Method overloading - Within the same class when one declares more than method with the same name but different signature (parameters).
* Difference between extends and implements?
  * Extends is for classes, implements is for implementing interfaces

### Intermediate
* Consider the following example. What gets printed on lines A-D? Is this method overloading or overriding?
  * A prints "WOOF!"; B prints "WOOF!"; C prints "HELLO"; D is not allowed
```java
public class Animal {
  public void speak() {System.out.println("HELLO");}
}
public class Dog extends Animal {
  public void speak() {System.out.println("WOOF!");}
}
public class Driver {
  public static void main(String[] args) {
    Animal dog1 = new Dog();
    dog1.speak();  // A
    Dog dog2 = new Dog();
    dog2.speak();  // B
    Animal animal1 = new Animal();
    animal1.speak(); // C
    Dog animal2 = new Animal();
    animal2.speak();  // D
  }
}
```
* What is the difference between an abstract class and an interface?
  * An abstract class can have both concrete and abstract methods whereas an interface must have only abstract methods if any (unless the default keyword is used). Interface methods are implicitly public and abstract, interface variables are implicitly public, static, and final, but these do not apply in abstract classes. Neither can be instantiated
* What are the implicit modifiers for interface variables / methods?
  * methods - `public abstract`; variables - `public static final`

### Advanced
* Is the below allowed? Is this an example of method overloading or overriding?
  * Overriding. This is an example of covariant return types: a method is allowed to return objects that are child classes of the return type. Also, when overriding a method, the return type of the new method can be a child class of the original return type
```java
public abstract class Super {
  public abstract Collection getCollection();
}

public abstract class Sub extends Super {
  public abstract List getCollection();
}
```
* Can you overload / override a main method? static method? a private method? a default method? a protected method?
  * Main method - overload, cannot override b/c is static method.
  * Static method - overload, cannot override b/c belongs to class (not inherited).
  * Private method - overload, cannot override b/c doesn't get inherited.
  * Default method - both.
  * Protected method - both (override if inherited). 
* If 2 interfaces have default methods and you implement both, what happens?
  * The code will NOT compile unless you override the method. However, the code WILL compile if one interface is implemented further up in the class hierarchy than the other - in this case, the closest method implementation in the hierarchy will be called
* If 2 interfaces have same variable names and you implement both, what happens?
  * The code will compile unless you make a reference to the variable (this is an ambiguous reference). You must explicitly define the variable by using the interface name: `int a = INTERFACENAME.a;`

## Collections / Generics

### Basics
* What are collections in Java?
  * A general data structure that contains Objects. Also the name of the API
* What are the interfaces in the Collections API?
  * Iterable, Collection, List, Queue, Set, Map, SortedSet, SortedMap, Deque
* What is the difference between a `Set` and a `List`?
  * `Set` does not allow duplicates (its members are unique)
* What is the difference between a `Array` and an `ArrayList`?
  * An array is static and its size cannot be changed, but an ArrayList can grow/shrink
* Are Maps in the Collections API?
  * Yes, but they do not implement `Collection` or `Iterable` interfaces
* What are generics? What is the diamond operator (`<>`)?
  * A way of specifying a type within a data structure - they enforce type safety. `<>` operator lets you infer generic types from the LHS of assignment operation
* What is a wrapper class?
  * Wrapper class is a wrapper around a primitive data type. It represents primitive data types in their corresponding class instances e.g. a boolean data type can be represented as a `Boolean` class instance. All of the primitive wrapper classes in Java are immutable i.e. once assigned a value to a wrapper class instance cannot be changed further.
* What is autoboxing / unboxing?
  * Auto-boxing is the automatic conversion of primitives to their wrapper classes by the compiler. Useful for adding primitives to collections
* Is this possible? `Set<int> myints = new HashSet<>()`
  * Ans: No. Primitives cannot be used with collections; instead, use the wrapper class
* What prints here?
```java
Set<Integer> nums = new HashSet<>();
nums.add(1); // what is this implicit operation called?
nums.add(2);
nums.add(1);
nums.add(3);
nums.forEach((i) -> {System.out.println(i)}); // predict the output
```
* What is an enhanced for loop and what is a `forEach` loop?
  * Enhanced for loop allows easier traversal of Collections (actually any arrays or `Iterable`s) - syntax: `for (Object o : collection) {...}`

### Intermediate
*  Explain the difference between line 1 and 2.
  * Ans: first line uses polymorphic declaration; we can swap out implementations of `List` at any time, so the code is more decoupled and uses abstraction properly
```java
List<String> mylist = new ArrayList<>();
ArrayList<String> list2 = new ArrayList<>();
mylist.add("hello");
mylist.add(new Person()); // what happens?
```
* What is the difference between HashTable and HashMap?
  * `HashTable` is synchronized whereas `HashMap` is not.
  * `HashMap` permits `null` values and the `null` key.
* What is the difference between `ArrayList` and `Vector`?
  * `Vector` is synchronized whereas `ArrayList` is not.
* What is the difference between `ArrayList` and `LinkedList`?
  * `ArrayList` is backed by an array; grows by 50% when capacity reached; more efficient for reading instead of inserting/deleting
  * `LinkedList` is a doubly linked list of nodes; each node has reference to previous and next; more efficient for inserting/deleting
* What is the difference between `TreeSet` and `HashSet`?
  * `HashSet` is much faster (constant time versus log time for most operations) but offers no ordering guarantees.
* How would you iterate over a `Map`?
  * Cannot use for loop (or enhanced for loop) directly
  * Iterate over each entry in the map `Map.Entry<K,V>` using `.entrySet()`
  * Iterate over the collection of values with `.values()`
  * Iterate over the keyset with `.keySet()`
```java
Map<String, Integer> mymap = getMapFromSomewhere();
for (Map.Entry<String,Integer> entry : mymap.entrySet()) {
  // one way
}
for (Integer val : mymap.values()) {
  // another way
}
for (String key : mymap.keySet()) {
  // final way
}
```

### Advanced
* Which collections cannot hold null values?
  * `HashTable`, `TreeSet`, `ArrayDeque`, `PriorityQueue`
* Why does `HashTable` not take `null` key?
  * The hash table hashes the keys given as input, and the `null` value cannot be hashed
* What are collection factory methods?
  * They allow you to directly populate collections, e.g. `Set.of(1,2,3)`

## Exceptions

### Basic
* What is base class of all exceptions? What interface do they all implement?
  * The base class is `Exception`, which implements the `Throwable` class
* List some checked and unchecked exceptions?
  * Checked - `IOException`, `ClassNotFoundException`, `InterruptedException`
  * Unchecked - `ArithmeticException`, `ClassCastException`, `IndexOutOfBoundsException`, `NullPointerException`
* Difference between checked and unchecked exceptions?
  * Checked means the compiler will check that you have either handled or declared it. Unchecked exceptions do not need to be handled, but they can be. Unchecked exceptions extend from `RuntimeException`
* What are the different ways of handling checked exceptions?
  * Use `try/catch` block; or use the `throws` declaration on the method signature to "duck" it and have it propagate up the call stack
* What is try-with-resources? What interface must the resource implement to use this feature?
  * Try-with-resources allows for automatically closing resources in a try/catch block using `try(resource) {...}` syntax. Must implement the `AutoCloseable` interface

### Intermediate
* Is this an example of a checked or unchecked exception? How would you change it to a checked exception?
```java
public class MyException extends RuntimeException {}
```
* What is the difference between `final`, `.finalize()`, and `finally`?
  * `final`: final keyword can be used for class, method and variables. A final class cannot be subclassed and it prevents other programmers from subclassing a secure class to invoke insecure methods. A final method can't be overridden. A final variable can't change from its initialized value.
  * `finalize()`: finalize method is used just before an object is destroyed and called just prior to garbage collection.
  * `finally`: finally, a key word used in exception handling, creates a block of code that will be executed after a `try/catch` block has completed and before the code following the `try/catch` block. The `finally` block will execute whether or not an exception is thrown. For example, if a method opens a file upon exit, then you will not want the code that closes the file to be bypassed by the exception-handling mechanism. This finally keyword is designed to address this contingency.
* `throw` vs `throws` vs `Throwable`?
  * `Throwable` - the root interface of exceptions, allow a class to be "thrown"
  * `throws` - keyword in method signature after params that declare which exception the method might throw
  * `throw` - the keyword that will actually "throw" an exception in code
* Do you need a catch block? Can have more than 1? Order of them?
  * Catch block is not necessary - try/finally will compile. You can have more than one catch block, but the order must be from most narrow exception to most broad/general.
* Multi-catch block - can you catch more than one exception in a single catch block?
  * Yes, use the `|` operator
* What happens here?
  * Ans: `ArithmeticException` gets thrown
```java
int x = 4;
int y = 0;
System.out.println(x / y);
```
* What exception could be thrown here? Are we required to handle it?
  * Ans: `IOException` could be thrown; must either handle in try/catch or use `throws` declaration on method
```java
public void readFile() {
  BufferedReader in = new BufferedReader(new FileReader("foo.txt"));
  System.out.println(in.read());
}
```
 
## Design patterns
* What are Singleton / Factory design patterns?
  * Singleton - allows for creation of only 1 object. Method for retrieving object returns reference to the same object in memory. Implement via private constructor
  * Factory - abstracts away instantiation logic, usually used in conjunction with singleton pattern

## JDBC
* What is JDBC?
  * A Java API used to execute queries on various databases. Uses JDBC drivers to connect with the database
* What are the core interfaces / classes in JDBC?
  * `DriverManager`, `Connection`, `Statement`, `PreparedStatement`, `CallableStatement`, `ResultsSet`
* What is a stored procedure and how would you call it in Java?
  * A stored procedure is an executable block of code that is written in PL/SQL and stored in the Oracle database. A stored procedure is called from a Java class using a CallableStatement object. When the procedure is called, its name and any relevant parameters are sent over the JDBC connection to the DBMS, which executes the procedure and returns the results (if applicable) via the connection.
* What is the difference between Statement and PreparedStatement?
  * PreparedStatements are pre-compiled by the JVM. The database doesn't have to compile the SQL each and every time it is executed. PreparedStatement can be parameterized, which can make the SQL more readable. Furthermore, PreparedStatement will properly escape reserved characters to prevent SQL injection attacks.
* Steps to executing an SQL query using JDBC?
  1. Register the driver using `.forName()` (or let `DriverManager` detect and load automatically from classpath)
  2. Create the connection (`DriverManager.getConnection(url,username,password)`)
  3. Create a statement for executing the SQL query (`Statement st = conn.createStatement()`);
  4. Execute the SQL query (`ResultSet rs = st.executeQuery(String sql)`)
  5. Use `ResultSet` to get values returned (`rs.getInt(1)`, etc)
  6. Close the connection (`conn.close()`) 
* How to execute stored procedures using JDBC?
  * Use the `Callable` statement interface
* Which interface is responsible for transaction management?
  * The `Connection` interface - can `commit`, `rollback`, etc

## JUnit
* What is JUnit?
  * A Java unit testing framework for testing code - use it for TDD
* What is TDD?
  * Test-driven development - write unit tests before application code, then write code to make tests pass. Repeat this process until functionality is complete.
* What are the annotations in JUnit? Order of execution?
  * BeforeClass, AfterClass, Before, After, Test, Ignore
* Give an example of a test case?
  * Adding two numbers, check that the method returns the sum


## Maven
* What is Maven?
  * A build automation and dependcy management tool for Java applications
* What is the default Maven build lifecycle?
  * process resources - copy and process the resources into destination directory
  * compile - compile the source code
  * process-test-resources - same for test directory
  * test-compile - compile the test code
  * test - run the test code
  * package - combine compiled source code into a .jar or .war file
  * install - install package to local repo
  * deploy - copy package and install in remote repo
* Where / when does Maven retrieve dependencies from? Where are they stored locally?
  * Maven first looks to see if the dependency is in the local repo under `.m2` directory. If not, it will download the necessary .jar file(s) from the remote central Maven repository into the `.m2` directory
* What is the POM and what is the pom.xml?
  * POM stands for project object model and is the model used by Maven to understand project attributes and dependencies. The pom.xml is the xml document which lists those attributes and dependencies

## Java 8

* What are functional interfaces?
  * Functional interfaces only have one method, and can be used in conjuntion with lambdas
* What are lambdas?
  * Like anonymous functions, they allow implementation of functional interfaces directly without creating a class
* What is the Streams API used for? What is the difference between intermediate and terminal operations? Can you provide examples?
* Why was the `default` keyword introduced for interfaces?
  * So that developers could update their interfaces without breaking legacy code that depends on that interface. The `default` keyword allows for implementation of an interface method