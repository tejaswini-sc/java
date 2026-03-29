package Inheritance;
class Plane
{
	void takeoff() {
		System.out.println("plane is take of");
	}
	
	void fly() {
		System.out.println("plane is Fly");
	}
	
	void land() {
		System.out.println("plane is Land");
	}
}
class CragoPlane extends Plane{
	@Override
	void fly(){
		System.out.println("cargo plane flies at loewr");
	}
	
	void carrycargo() {
		System.out.println("carry carge");
	}
	
}
class PassengerPlane extends Plane
{
	@Override
	void fly() {
		System.out.println("Passenger flies at medium");

	}
	void carryPassenger() {
		System.out.println("carry People");
	}

}

class FlightPlane extends Plane
{
	 @Override
	void fly() {
			System.out.println("Passenger flies at Height");
	}
	 void carryWepoma() {
			System.out.println("carry wepona");
	 }
}


public class Airoplane {

	public static void main(String[] args) {
		CragoPlane cp =new CragoPlane();

	}

}
