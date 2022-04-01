import java.util.Scanner;

public class Function4 {
// Program for Function without argument & with return
	public static  void main(String[] ar) {
		int c=sum();
		System.out.println("Result ="+c);
	}
	private static int sum() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Input First Number");
	int num1 = sc.nextInt();
	System.out.println("Input Second Number");
	int num2 = sc.nextInt();
	return(num1+num2);
	}
}
