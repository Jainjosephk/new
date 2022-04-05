package heloprint;

public class HeloPrint {
	// to print Hello World in 10 times with Serial Number
	public static void main(String[] ags)
	{
		int slno=0;
		for(int i=0;i<=9; ++i)
		{
			System.out.println(String.format("%02d", (++slno))+") Hello World");
		}
	}	
}