// Introduction
// 7 min
// Let’s say we need a program that connects a user with new jobs. We need the user’s name, their salary, and their employment status. All of these pieces of information are stored in our program.

// We store information in 
// variables
// Preview: Docs Loading link description
// , named locations in memory.

// Naming a piece of information allows us to use that name later, accessing the information we stored.

// Variables also give context and meaning to the data we’re storing. The value 42 could be someone’s age, a weight in pounds, or the number of orders placed. With a name, we know the value 42 is age, weightInPounds, or numOrdersPlaced.

// In Java, we specify the type of information we’re storing. 
// Primitive data types
// Preview: Docs Java’s most basic data types are known as primitive data types and are in the system by default.
//  are types of data built-in to the Java system. The three main primitive types we’ll cover are int, double, and boolean; this lesson will introduce these built-in types and more.

// We must declare a variable to reference it within our program. Declaring a variable requires that we specify the type and name:

// // datatype variableName
// int age;
// double salaryRequirement;
// boolean isEmployed;

// Copy to Clipboard

// The names of the variables above are age, salaryRequirement, and isEmployed.

// These variables don’t have any associated value. To assign a value to a variable, we use the assignment operator =:

// age = 85;

// Copy to Clipboard

// Now, age has a value of 85. When code is used to represent a fixed value, like 85, it is referred to as a literal.

// It’s also common to declare a variable and assign it a value in one line!

// For example, to assign 2011 to a variable named yearCodecademyWasFounded of type int, we write:

// int yearCodecademyWasFounded = 2011;

public class Creator {
    public static void main (String [] args){
      //Declaring variables
      String name = "James Gosling";
      int yearCreated = 1995;
      
      //Printing out values of variables
      System.out.println(name);
      System.out.println(yearCreated);
    }   
}
