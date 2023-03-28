import java.util.*;
class LeapYear{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Year");
		int n = sc.nextInt();
		
		if((n%4==0) || (n%400==0 && n%100 !=0))
		{
			System.out.println("It is a LeapYear");
			
		}
		else
		{
			System.out.println("It is not LeapYear");
		}
	}
}	