package activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraySum = 0;
		int[] array = {10, 77, 10, 54, -11, 10};
		for(int i=0;i<array.length;i++) {
			if(array[i]==10)
				arraySum+=array[i];
		}
		if(arraySum==30) {
			System.out.println("true");
		}
		else {
			System.out.println("false");

		}
	}

}
