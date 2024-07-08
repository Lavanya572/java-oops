
public class Dog {
	String dogBreed;
	int dogAge;
	String dogColor;
	
	public Dog(String inputBreed, int inputAge, String inputColor) {
		this.dogBreed = inputBreed;
		this.dogAge = inputAge;
		this.dogColor = inputColor;
	}
	
	public String dogBark() {
		String barking = "Woof Woof";
 		return barking;
	}
	
	public void birthDay(int inputAge) {
	inputAge =	inputAge+1;
		//return newAge;
		
		System.out.println("My dog's birthday is today. He is " + inputAge + " now");
	}

}
