package activities;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int [] arr = {4,3,2,2,10,2,12};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
