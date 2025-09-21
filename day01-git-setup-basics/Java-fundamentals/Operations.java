// Order of Operations
// 4 min
// If we were to place multiple 
// operators
// Preview: Docs Loading link description
//  in a single expression, what operation would the 
// compiler
// Preview: Docs Loading link description
//  evaluate first?

// int num = 12 / (10 - 4) + 4 * 2;

// Copy to Clipboard

// The order of operations dictates the order in which an expression (like the preceding one) is evaluated.

// The order is as follows:

// Parentheses
// Exponents
// Modulo/Multiplication/Division
// Addition/Subtraction
// Each numbered item in the list represents a level of precedence, where the levels are executed in ascending order. Operators that share the same precedence are evaluated from left to right within the expression.

// With this new information in mind, let’s dissect the expression from before so that we can find the value of num:

// 12 / (10 - 4) + 4 * 2

// Copy to Clipboard

// 10 - 4 would be evaluated first because it is wrapped in parentheses, and parentheses take first precedence. This value would become 6, making our expression look like this:

// 12 / 6 + 4 * 2 

// Copy to Clipboard

// Next, our expression now contains division, addition, and multiplication. Multiplication and division take precedence over addition, so we will execute these first, moving left to right. 12 / 6 will be evaluated, yielding 2. Our expression now looks like this:

// 2 + 4 * 2

// Copy to Clipboard

// Next, we calculate the multiplication, 4 * 2, which is 8. The expression now looks like this:

// 2 + 8

// Copy to Clipboard

// 2 + 8 is 10. This means that the value of num is 10.

// Instructions
// Take a look at the expressions in Operations.java.

// Solve for the value of each of the expressions on your own.

// To find out if your calculations are right, uncomment the print statements and run the code.

public class Operations {
	public static void main(String[] args) { 

    int expression1 = 5 % 2 - (4 * 2 - 1);
    // 1 - (7)
    // 1 - 7
    // -6
    System.out.println(expression1);

    int expression2 = (3 + (2 * 2 - 5)) + 6 - 5;
    // (3 + (-1)) + 6 - 5
    // (3 - 1) + 6 - 5
    // 2 + 1
    // 3
    System.out.println(expression2);

    int expression3 = 5 * 4 % 3 - 2 + 1;
    // 20 % 3 - 2 + 1
    // 2 - 2 + 1
    // 1
    System.out.println(expression3);

	}
}