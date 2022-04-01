
import java.util.Scanner;
// Java Functions with Argument & with Returm
//to find sum of two numbers from user
public class Functions1 {
	public static void main(String a[]) {
	//  Scanner num=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		System.out.println("Input First Number");
		int num1 = sc.nextInt();
		System.out.println("Input Second Number");
		int num2 = sc.nextInt();
		int tot=add(num1,num2);
		System.out.println("Result Received ="+tot);

	}
	private static int add(int a,int b) {
	return(a+b);
	}
}
