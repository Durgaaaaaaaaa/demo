import java.util.*;
public class Sumavg{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int sum=0;
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		sum+=i;
	}
	System.out.println("the sum of "+n+"numbers is "+sum);
	System.out.println("the avg of "+n+"numbers is "+sum/n);
}
}

