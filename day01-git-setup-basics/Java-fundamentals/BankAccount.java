// Review
// 9 min
// What’s the use of having variables if you can’t do anything with them? We’ve now seen some ways you can operate on variables and compare them. The possibilities are endless!

// We covered:

// Addition and subtraction, using + and -
// Multiplication and division, using * and /
// The modulo operator for finding remainders, %
// Compound assignment operators +=, -=, *=, /=, and %=.
// The order of operations: parentheses -> exponents -> multiplication, division, modulo -> addition, subtraction
// Greater than, >, and less than, <
// Equal to, ==, and not equal to, !=
// Greater than or equal to, >=, and less than or equal to, <=
// equals() for comparing Strings and other objects
// Using + to concatenate Strings
// The final keyword which makes variables unchangeable
// Practice some of these concepts here, to make sure you have a solid foundation for learning more complicated and exciting Java concepts!

// Instructions
// Checkpoint 1 Passed
// 1.
// To review, let’s try building some of the bank account functionality we talked about throughout the lesson.

// First, create a new double variable called updatedBalance, and store balance with amountToWithdraw subtracted from it.

// Checkpoint 2 Passed
// 2.
// Now, you’ve decided to split your balance evenly 3 ways and give it to your three best friends.

// Create a double variable called amountForEachFriend that holds your updated balance divided by 3.

// Checkpoint 3 Passed
// 3.
// Your friends each want to buy a concert ticket with the money you’ve given them. The tickets cost 250!

// Create a boolean called canPurchaseTicket and set it equal to whether or not amountForEachFriend is at least enough to purchase a concert ticket.

// Then, use System.out.println() to print canPurchaseTicket.

// Checkpoint 4 Passed
// 4.
// How much money did you give your friends, anyway?

// Use + and System.out.println() to print out:

// I gave each friend <amountForEachFriend>...

// Copy to Clipboard

// with the value of amountForEachFriend where <amountForEachFriend> is.

public class BankAccount {
  	public static void main(String[] args){
      double balance = 1000.75;
      double amountToWithdraw = 250;
      double updatedBalance = balance - amountToWithdraw;
      double amountForEachFriend = updatedBalance/3;
      boolean canPurchaseTicket = amountForEachFriend > 250;

      System.out.println(canPurchaseTicket);
      System.out.println("I gave each friend " + amountForEachFriend);
    }       
}
