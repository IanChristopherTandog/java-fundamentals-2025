Java: Introduction to Classes
Classes: Instance Fields
6 min
A real car has characteristics such as brand, model, year, color, etc. In a Java object representing a car, these characteristics are represented by instance fields or instance variables.

In the last exercise, we created an object, but our object has no characteristics! We’ll add characteristics to our class by including instance fields or instance 
variables
Preview: Docs Loading link description
.

Let’s revisit the Car class example.

We want our Car objects to have different colors, so we declare an instance field called color. Instance variables are often characterized by their “has-a” relationship with the object. For example, a Car “has-a” color, “has-a” make, “has-a” model name, and “has-a” model year.

Think about what qualities other than color a car might have.

public class Car { 

 /* 
 declare fields inside the class 
 by specifying the type and name 
 */ 

 public String color; 
 public int year; 
 public String modelName; 
 public String make; 

 public Car() { 
   /*  
   instance fields available in 
   scope of the constructor method 
   */ 
 } 
} 

Copy to Clipboard

Instance variables are specific to each instance of the class which means that each object created from the class will have its own copy of these variables. These fields can be set in the following three ways:

If they are public, they can be set like this instanceName.fieldName = someValue;

They can be set by class 
methods
Preview: Docs Loading link description
.

They can be set by the constructor method (shown in the next exercise).

Let’s practice this concept by adding characteristics to a class that represents a dog.

Instructions
Checkpoint 1 Passed
1.
Inside the Dog class of Dog.java, add a field to represent a dog’s name. Call this field name. We leave it up to you to figure out the correct type of this field.

Checkpoint 2 Passed
2.
Inside the Dog class of Dog.java, add a field to represent a dog’s breed. Call this variable breed. We leave it up to you to figure out the correct type for this field.

Checkpoint 3 Passed
3.
Inside the Dog class of Dog.java, add a field to represent a dog’s weight in kg. Call this field weight. We leave it up to you to figure out the correct type of this field.