ABSTRACTION

Abstraction refers to something that exists in theory and does not have a concrete existence.
The reserved keyword *****abstract***** is used in these cases to define a template for a class or method that is not meant to be used as is
These methods classes and methods that are declared abstract are meant to be extended and not instantiated.
```
public abstract class Shape{
}
```
The class Shape above is abstract. Shape is an abstract concept that provides a template for more specific shape types such as triangle, circle, square.
This class can contain abstract methods that show how shapes should behave but these abstract methods are not istantiated.
Abstract methods are meant to be overridden by the subclasses.
```
public abstract class Shape{
    abstract double calculateArea();
}
```
As shown above, the abstract class has no body. It only has the method signature.
The subclasses that override this method have the burden of implementing it and thus providing the body(code block)
The abstract methods provide a template that any subclass of shape should be able to do.

```
public class Shape {
    abstract double calculateArea();
}
```
The presence of an abstract class in the code above forces us to make the class abstract as well.
Even if a code has 10 concrete method that it implements and just one abstract one, the fact that there is an abstract method makes it so that we must make the class abstract or the compiler will not compile.


Once we extend the abstract class to a subclass, the subclass has to implement all the abstract methods it inherited.
If it does not implement even one of  the abstract methods, then the subclass itself has to be made abstract.

```
public class Square extends Shape{
    private double dimension;

    public double getDimension() {
        return this.dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    public Square(double dimension){
        this.dimension = dimension;
    }
    @Override
    public double calculateArea() {
        return this.dimension * this.dimension;
    }
}
```
Above we see that the Square class extends Shape and implements Shapes calculateArea() by overriding it.



INTERFACES
An interface is similar to an abstract class.
However, where an abstract class can take methods that are abstract as well as concrete, an interface's methods are all abstract.
Therefore, there is no need to declare the methods as abstract.
Interfaces are also *****implemented***** and not *****extended*****
When a class implements n interface, it must implement all of its methods or declare itself abstract.
Below is an interface:
```
public interface Product {
    double getPrice();
    void setPrice(double price);

    String getName();
    void setName();

    String getColor();
    void setColor(String color);
}
```
There are getters and setters but the fields are not in the interface.
If fields are put inside the interface then they have to be *****final***** and as such have to be given a value.
See the code below for the implementation of interface

```
public class Book implements Product{
    private double price;
    private String name;
    private String color;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
    ```
```
While a class can only extend one superclass, it can implement multiple interfaces.
The interfaces can be separated by comma at the class header.


```
public class Book implements Product, DigitalItem, Resource{
}
```



