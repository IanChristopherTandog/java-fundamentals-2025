package OOP.Exercise10;

public class Dog {
  String breed;
  boolean hasOwner;
  int age;
  String color;
  
  public Dog(String dogBreed, boolean dogOwned, int dogYears, String dogColor) {

    System.out.println("Constructor invoked!");

    breed = dogBreed;
    hasOwner = dogOwned;
    age = dogYears;
    color = dogColor;
  }
  
  public static void main(String[] args) {
    System.out.println("Main method started");
    Dog fido = new Dog("poodle", false, 4, "White-black");
    Dog nunzio = new Dog("shiba inu", true, 12, "Brown");
    Dog aspin = new Dog("k9", true, 8, "Black");

    boolean isFidoOlder = fido.age > nunzio.age;
    boolean isAspinYounger = nunzio.age > aspin.age;

    int totalDogYears = nunzio.age + fido.age + aspin.age;

    System.out.println("Three are dogs created: a " + fido.breed + ", " + nunzio.breed + " and a " + aspin.breed);
    System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
    System.out.println("The aspin is younger than the nunzio: " + isAspinYounger);
    System.out.println("The total age of the dogs is: " + totalDogYears);
    System.out.println("Main method finished");
  }
}