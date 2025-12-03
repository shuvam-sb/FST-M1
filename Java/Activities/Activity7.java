package activities;
interface BicycleParts {
	public int tyres = 2;
	public int maxSpeed = 20;
}
interface BicycleOperations{
	public void applyBrake(int decrement);
	public void speedUp(int increment);
}
class Bicycle implements BicycleParts,BicycleOperations{
	public int gears;
	public int currentSpeed;
	
	public Bicycle(int gears,int currentSpeed) {
		this.gears = gears;
		this.currentSpeed = currentSpeed;
	}

	@Override
	public void applyBrake(int decrement) {
		// TODO Auto-generated method stub
		currentSpeed -= decrement;
		System.out.println("Speed of the bicycle after applying brake : " + currentSpeed);
	}

	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		currentSpeed += increment;
		System.out.println("Speed of the bicycle after speeding up : " + currentSpeed);
	}
	public void bicycleDesc() {
		System.out.println("No of gears are : "+ gears +"\nMax speed of bicycle is : " + maxSpeed);
	}
	
}
class MountainBike extends Bicycle{
	public int seatHeight;
	public MountainBike(int gears, int currentSpeed, int seatHeight) {
		super(gears, currentSpeed);
		this.seatHeight = seatHeight;
		// TODO Auto-generated constructor stub
	}
	public void bicycleDesc() {
		super.bicycleDesc();
		System.out.println("Seat height is : " + seatHeight);

    }  
	
}
public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mb = new MountainBike(6, 0, 38);//gears,currSpeed,seatHeight
        mb.bicycleDesc();
        mb.speedUp(20);
        mb.applyBrake(5);
		
	}

}
