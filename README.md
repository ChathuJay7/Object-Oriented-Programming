# Object-Oriented-Programming

## [1 - Classess and Objects](01%20-%20Classes%20and%20Objects)
  - A class is a group of objects which have common properties. It is a template or blueprint from which objects are created. It is a logical entity. It can't be physical.
  - An object is an instance of a class. A class is a template or blueprint from which objects are created. So, an object is the instance(result) of a class. 
## [2 - Constructors](02%20-%20Contructors)
  - constructor initializes an object when it is created. It has the same name as its class and is syntactically similar to a method. However, constructors have no explicit return type.
## [3 - Access Modifiers](03%20-%20Access%20Modifiers)
  - public - same class, package, child, other classes (anywhere)
  - private - same class
  - default - same class, package
  - protected - same class, package, child
## [4 - Encapsulation](04%20-%20Encapsulation)
  - Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.
## [5 - Inheritence](05%20-%20Inheritance)
  - Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. 
## [6 - Plymorphism](06%20-%20Polymorphism)
  - Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.
## [7 - Super Keyword](07%20-%20Super%20Keyword)
  - Super keyword is a reference variable which is used to refer immediate parent class object
## [8 - Method Overloading](08%20-%20Method%20Overloading)
  - Method Overloading allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters, or a mixture of both.??
## [9 - Method Overring](09%20-%20Method%20Overridng)
  - Method overriding means if a subclass provides the specific implementation of the method that has been declared by one of its parent class. (subclass has the same method as declared in the parent class)
## [10 - Abstraction](10%20-%20Abstraction)
  - Abstraction is a process of hiding the implementation details and showing only functionality to the user.
  - Abstract class is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class)
  - Abstract method is only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from)
## [11 - Interface](11%20-%20Interface)
  - Interface is a blueprint of a class. It has static constants and abstract methods. The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body.