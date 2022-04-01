import java.util.Scanner;

public class AddNumber {
	//to print sum of n numbers
	public static void main(String a[]) {
		//Creates an object of Scanner
		Scanner num=new Scanner(System.in);
		System.out.println("Enter a Number");
		int sum=0;
		//taks input fro the keyboard
		int num1=num.nextInt();
		//calculate sum
		for(int i=0;i<=num1;i++){
			sum=sum+i;
			}
		//Print the result
		System.out.println("Result= "+sum);
		num.close();
	}
}