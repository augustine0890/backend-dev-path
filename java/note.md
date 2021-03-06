# Java
## JDK
- Java Development Kit (JDK) - Development Tools --> Java Runtime Environment (JRE) - Libraries and classes --> Java Virtual Machine (JVM).
- Java 11 LST or Java 12.

## Object-Oriented Programming
- OOP is governed by four main principles:
    - Inheritance: how we can reuse code by using hierarchies of classes and inheriting behavior from derived classes.
    - Encapsulation: how we can hide the implementation details from the outside world while providing a consistent interface to communicate with our objects through methods.
    - Abstraction: how we can focus on the important details of an object and ignore the other details.
    - Polymorphism: how we can define abstract behaviors and let other classes provide implementations for these behaviors.
- In Java, everything except primitive data types are objects.
    ```java
    modifier class ClassName {
        // Body
  }
    ```
- __Modifires__: a class can be public, private, protected, or have no modifier.
    - `public` class is accessible from other classes in other packages.
    - `private` class is only accessible from within the class it is declared.
    - `protected` class member is accessible within all classes in the same package.
- __ClassName__: the name should begin with an initial letter
- __Body__: where we define the properties and methods of the class.

### Constructors
- A constructor is called when you want to create an object of a class.
- A constructor has the same name as the class.
- A constructor can be `public` or `private`
- A constructor doesn't return anything, even `void`

### Inheritance
- The class being inherited from is called the superclass or the base class, and the class that is inheriting is called the subclass or the derived class.
- Single level inheritance: a class inherits from only one other class.
- Multi-level inheritance: a class can inherit from another class that also inherits from another class.
- Multiple inheritance: a class can inherit from more than one class. This not directly supported in Java, but can be achieved by using __interfaces__.
```java
class SubClassName extends SuperClassName {
    
}
```

### Overloading
- A method signature is the method name, its parameters, and the order of the parameters.
- With overloading, we are able to define more than one method with the same method names but different parameters.
- We can overload the main method in a class, but once the program starts up, the JVM will only call `main(String[] args)`.
```java
public class Student {
    public static void main(String[] args) {
        // Will be called by the JVM
    }
    public static void main(String[] args, String str1, int num) {
        // Do some operations
    }
    public static void main(int num, int num1, String str) {
        
    }
}
```
### Polymorphism and Overriding
- Sub-classes can define their unique behaviors yet still share some functionalities with their parent classes.
- Method overriding means having two methods with the same arguments, but different implementations. One of them would exist in the parent class, while another would exist in the child class.
#### Annotations
- Annotations are a way in which we can add metadata to our programs. Such metadata is not part of the program itself, but can help us catch errors or offer guidance.
- Annotations have no direct effect on the operation of the code they annotate.
- `@Override`: used to indicate that the element is meant to override an element from the superclass.
- `@Deprecated`: indicates that a certain method is deprecated and should no longer be used.

```java
import com.augustine.oop.person.Person;

public @interface Author {
  String name();

  String date();
}

@Author(name = "James Bonds", date = "12/23/1968")
public class Student extends Person {
    
}
```
#### References
- When we assign objects to variables or pass them to methods as parameters, we aren't actually passing the object itself or its copy - we are passing references to the objects themselves in memory.


