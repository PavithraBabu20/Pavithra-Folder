
public class Week2Day5Swap {

	public static void main(String[] args) {
		// Initializing two variables
        int a = 4;
        int b = 5;
        
        // Swapping of two variables
        b = b+a;
        a = b-a;
        b = b-a;
        
        // Printing the swapped variables 
        System.out.println("After swapping the value of 'a' is " + a);
        System.out.println("After swapping the value of 'b' is " + b);
        		
	}

}
