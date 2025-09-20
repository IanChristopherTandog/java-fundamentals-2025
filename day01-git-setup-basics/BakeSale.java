//  Compound Assignment Operators
// 5 min
// Sometimes, we need to adjust the value of a variable.

// Imagine we’re working at a bake sale and want to keep track of how many cupcakes we have by creating a variable called numCupcakes:

// int numCupcakes = 12;

// Copy to Clipboard

// If we baked 8 more cupcakes, we know that we could update our variable using the + operator:

// numCupcakes = numCupcakes + 8; // Value is now 20

// Copy to Clipboard

// While this method works just fine, we had to write our variable numCupcakes twice. We can shorten this syntax by using a compound assignment operator.

// Compound assignment 
// operators
// Preview: Docs Loading link description
//  perform an arithmetic operation on a variable and then reassigns its value. Using the += compound assignment operator, we can rewrite our previous code like so:

// numCupcakes += 8; // Value is now 20

// Copy to Clipboard

// Now we only need to reference numCupcakes once.

// We can use compound assignment operators for all of the arithmetic operators we’ve covered:

// Addition (+=)
// Subtraction (-=)
// Multiplication (*=)
// Division (/=)
// Modulo (%=)
// Instructions
// Checkpoint 1 Passed
// 1.
// You are also in charge of keeping track of how many cookies there are at the bake sale. This value is represented by the variable numCookies.

// A customer comes and buys 3 cookies. Use the appropriate compound assignment operator to reflect this change.

// Checkpoint 2 Passed
// 2.
// Another customer buys half of the remaining cookies.

// Use the appropriate compound assignment operator to reflect this change.
 public class BakeSale {
	public static void main(String[] args) {   
		int numCookies = 17;
    numCookies = numCookies -= 3;
    numCookies = numCookies /= 2;


    // Add your code above
    System.out.println(numCookies);
	}
}