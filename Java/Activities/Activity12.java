package activities;

interface Addable {
	public int add(int num1, int num2);
}

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addable a1 = (num1,num2) -> num1 + num2;
		Addable a2 = (num1,num2) -> {
			return num1+num2;
		};
		System.out.println("ad1 result: " + a1.add(10, 20));
        System.out.println("ad2 result: " + a2.add(15, 25));		

	}

}
