package Encapsulation;

class Sbi{
	private int pin;
	private int bal;
	
	public void setPin() {
		pin=2603;
	}
	
	
	public void setBal(int bal) {
		if(bal>=0) {
			this.bal=bal;
		}
		else {
			System.out.println("no negtive values");
		}
	}	

	
	public int getPin() {
		return pin;
	}


	public int getBal() {
		return bal;
	}
	
	
	
	
}


public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
