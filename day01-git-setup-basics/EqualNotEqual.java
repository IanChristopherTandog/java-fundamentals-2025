// Equals and Not Equals
// 7 min
// So how would we validate our paycheck to see if we got paid the right amount?

// We can use another relational operator to do this. == will tell us if two 
// variables
// Preview: Docs Loading link description
//  are equal:

// double paycheckAmount = 620;
// double calculatedPaycheck = 15.50 * 40;

// System.out.print(paycheckAmount == calculatedPaycheck);
// // This will print true, since paycheckAmount equals calculatedPaycheck

// Copy to Clipboard

// Notice that the equality check is two equal signs, instead of one. One equal sign, =, is how we assign values to variables! It’s easy to mix these up, so make sure to check your code for the right number of equal signs.

// To check if two variables are not equal, we can use !=:

// double balance = 20000.0;
// double amountToDeposit = 620;
// double updatedBalance = balance + amountToDeposit;

// boolean balanceHasChanged = balance != updatedBalance;
// // balanceHasChanged holds true, since balance does not equal updatedBalance

// Copy to Clipboard

// Instructions
// Checkpoint 1 Passed
// 1.
// You have unearthed two unlabeled albums, record A and record B.

// To see if these are the same album, you’re going to compare the number of songs on each one, and the total length of the albums.

// First, create a variable called sameNumberOfSongs that stores whether the two albums have the same number of songs.

// Checkpoint 2 Passed
// 2.
// Now, create a variable called differentLength that stores the result of checking whether the two album lengths are not the same

public class EqualNotEqual {
	public static void main(String[] args) {   
		int songsA = 9;
    int songsB = 9;
    int albumLengthA = 41;
    int albumLengthB = 53;
    boolean sameNumberOfSongs =  songsA == songsB;
    boolean differentLength = albumLengthA != albumLengthB;
	}
}