import java.util.Scanner;

public class IfSample {

	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input 1 numbers");
		int a= sc.nextInt();
		if (a<0) {
			System.out.println("a is negative");
			}else {
				System.out.println("a is Positive");
			}
	}
}