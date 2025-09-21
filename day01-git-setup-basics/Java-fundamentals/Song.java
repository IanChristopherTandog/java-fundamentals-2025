// String
// 8 min
// So far, we have learned primitive 
// data types
// Preview: Docs Loading link description
// , which are the simplest types of data with no built-in behavior. Our programs will also use 
// String
// Preview: Docs Loading link description
// s, which are objects, instead of primitives. Objects have built-in behavior.

// Strings hold sequences of characters. We’ve already seen instances of a String, for example, when we printed out "Hello World". There are two ways to create a String object: using a String literal or calling the String class to create a new String object.

// A String literal is any sequence of characters enclosed in double-quotes (""). Like primitive-type 
// variables
// Preview: Docs Loading link description
// , we declare a String variable by specifying the type first:

// String greeting = "Hello World";

// Copy to Clipboard

// We could also create a new String object by calling the String class when declaring a String like so:

// String salutations = new String("Hello World");

// Copy to Clipboard

// There are subtle differences in behavior depending on whether you create a String using a String literal or a new String object. We’ll dive into those later, but for now, we’ll almost always be using String literals.

// Keep Reading: AP Computer Science A Students

// Certain symbols, known as escape sequences, have an alternative use in Java print statements. Escape sequences are interpreted differently by the 
// compiler
// Preview: Docs Loading link description
//  than other characters. Escape characters begin with the character \.

// There are three escape sequences to be aware of for the AP exam.

public class Song {
	public static void main(String[] args) {   
    String openingLyrics = "Yesterday, all my troubles seemed so far away";

    System.out.println(openingLyrics);
	}
}