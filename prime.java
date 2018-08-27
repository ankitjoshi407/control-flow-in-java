import java.util.Scanner;
class prime
{
	public static void main(String args[])
	{
		int n,i,count;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n");
		n=s.nextInt();
		
		
		count=0;
			for(int j=2;j<n;j++)
			{
				if(n%j==0)
				{
					count++;
					break;
				}	
			}
			if(count==0)
			{
			System.out.println(n+" is prime");	
			}
			else
			{
				System.out.println(n+" is not prime");	
			}
			
		
	}
	
	
}