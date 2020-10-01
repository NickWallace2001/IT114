public class Recursion {
  
	public static int sum(int num) {
		if (num > 0) {
			return num + sum(num - 1);
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(sum(10));
		
		int input = 10;
        int sum = 0;
        
        for(int i = 1; i <= input; i++)
        {
            sum += i; 
        }
        
        System.out.println("Sum of numbers till " + input + " is " + sum);
	}
}