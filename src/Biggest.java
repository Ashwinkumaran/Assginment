import java.util.*;
public class Biggest 
{
 public static void main(String[] args)
 {
	int x,y,z;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the first number");
	x=s.nextInt();
	System.out.println("Enter the second number");
	y=s.nextInt();
	System.out.println("Enter the third number");
	z=s.nextInt();
	if(x>y&&x>z)
	{	
		System.out.println("X is the biggest+x");
		
	}
	else if(y>z)
	{
		System.out.println("Y is the biggest+y");
		
	}
	else
	{
		System.out.println("z is the biggest+z");
	}
 }
}
