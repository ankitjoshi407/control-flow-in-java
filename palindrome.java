import java.util.Scanner;
class palindrome
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter to check Palindrome");
		int n=s.nextInt();
		int temp,r;
		int rev=0;
		temp=n;
		while(n!=0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println(temp+" is palindrome");
		}
		else
		{
			System.out.println(temp+" is not palindrome");
		}	
		
	}
	
}