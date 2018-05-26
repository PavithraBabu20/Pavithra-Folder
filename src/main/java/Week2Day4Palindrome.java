import java.util.Scanner;

public class Week2Day4Palindrome {

	public static void main(String[] args) {
		
		System.out.println("Enter you input String");
		Scanner sc = new Scanner(System.in);
		String input= sc.nextLine();
		int length = input.length();
		System.out.println("the length is"+length);
		String reverse = "";
		
		
		for(int i= length-1; i>= 0; i--)
		{
       reverse = reverse + input.charAt(i);
	}
System.out.println(reverse);

if (reverse.equalsIgnoreCase(input))
{
	System.out.println("Input is a palindrome");
	}
else {
	System.out.println("Input is not a palindrome");
}
}

}