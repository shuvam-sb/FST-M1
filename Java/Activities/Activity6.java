package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
	private int maxPassengers;
	private List<String> passengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;
	public Plane(int maxPassengers) {
		this.maxPassengers = maxPassengers;
		this.passengers = new ArrayList<String>();
	}
	public void onboard(String passengerName){
		if(passengers.size()<maxPassengers) {
			passengers.add(passengerName);
		}
		else {
			System.out.println("All seats are occupied");
		}
	}
	public Date takeOff(){
		this.lastTimeTookOf = new Date();
		return this.lastTimeTookOf;
	}
	public void land(){
		this.lastTimeLanded = new Date();
		passengers.clear();
	}
	public Date getLastTimeLanded() {
		return lastTimeLanded;
	}
	public List<String> getPassesngers(){
		return passengers;
	}
}

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		Plane airIndia = new Plane(30);
		airIndia.onboard("Passenger1");
		airIndia.onboard("Passenger2");
		airIndia.onboard("Passenger3");
		System.out.println("Flight take off Time : "+airIndia.takeOff());
		System.out.println("Flight onboarded with list of passengers : "+airIndia.getPassesngers()+"=>"+airIndia.getPassesngers().size());
		Thread.sleep(5000);
		airIndia.land();
		System.out.println("Flight landing Time : "+airIndia.getLastTimeLanded());
		System.out.println("No of passengers after offboarding the flight : "+airIndia.getPassesngers()+"=>"+airIndia.getPassesngers().size());

	}

}
