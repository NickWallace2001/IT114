
public class java_loops {
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
		
		for (int num : arr) {
			if (num%2 == 0) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
		System.out.println("To ensure only even numbers were printed, I used the modulo operator dividing by two with remainder 0");
	}

}
