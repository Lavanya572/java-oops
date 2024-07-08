
public class Bank {
	private int acc_num;
	private int acc_bal;
	
	public Bank(int acc_num, int acc_bal) {
		this.acc_num = acc_num;
		this.acc_bal = acc_bal;
		System.out.println("Your account " + this.acc_num + " was created.");		
	}
	
	public void deposit(int addMoney) {
		if(addMoney < 0) {
			System.out.println("Invalid");
		}
		else {
			this.acc_bal = this.acc_bal + addMoney;
			System.out.println("$" + addMoney + " was deposited in the account " + 
			this.acc_num + ". New balance is " + this.acc_bal + ".");
		}
	}
	
	public void withDraw(int drawMon) {
		if(drawMon > this.acc_bal){
			System.out.println("Exceeded balance");			
		}
		else {
			this.acc_bal = this.acc_bal - drawMon;
			System.out.println("$"+ drawMon + " was withdrawn from account " + 
			this.acc_num + "New balance is " + this.acc_bal + ".");
		}
	}
}
