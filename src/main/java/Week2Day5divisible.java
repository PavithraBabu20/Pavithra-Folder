 import java.util.Scanner;

public class Week2Day5divisible {

	public static void main(String[] args) {
		System.out.println("Enter value for a");
		System.out.println("Enter value for b");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=a;i<=b;i++)
		{
			if(i%3==0 && i%5==0){
				System.out.println("FIZZBUZZ");
			}else if(i%5==0) {
				System.out.println("BUZZ");
			}else if(i%3==0) {
				System.out.println("FIZZ");
			}
			else {
				System.out.println(i);
			}
		}

	}

}
