
public class Bicycle {
	public int speed;
	public int gear;
	
	public Bicycle(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
	}
	
	public void breaking(int decre) {
		this.speed -= decre;
	}
	
	public void speedUp(int incre) {
		this.speed += incre;
	}
	
	public String toString() {
		return ("No of gears are: " + gear + "\nSpeed is: " + speed);
	}
}


