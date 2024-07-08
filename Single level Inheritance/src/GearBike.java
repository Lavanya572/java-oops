
class GearBike extends Bicycle{
	public int seatHeight;
	
	public GearBike(int speed, int gear, int seat) {
		super(speed, gear);
		this.seatHeight = seat;
	}
	
	public void setHei(int newSeat) {
		this.seatHeight = newSeat;
	}
	
	public String toString() {
		return (super.toString() + "\nSeat height is: " + seatHeight);
	}
	
	
}
