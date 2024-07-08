
public class Classes {
	 public static void main(String[] arg) {
		 Dog myDog = new Dog("Poodle", 6, "White");
		 Dog sallysDog = new Dog("Beagle", 7, "Brown");
		 
		 System.out.println("My Dog's age is " + myDog.dogAge);
		 System.out.println("Sally's dog age is " + sallysDog.dogAge);
		 System.out.println("My dog's breed is " + myDog.dogBreed);
		 System.out.println("Sally's dog breed is " + sallysDog.dogBreed);
		 
		 System.out.println(myDog.dogBark());
		 
		 myDog.birthDay(6);
	 }

}
