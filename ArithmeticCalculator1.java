 import java.util.Scanner;
 
class c1
{
	int result;
	public void add(int a,int b)
	{
		result=a+b;
		System.out.println("Addition of two Number"+result);
	}
	public void sub(int a,int b)
	{
		result=a-b;
		System.out.println("Subtraction of two Number"+result);
	}
	public void multi(int a,int b)
	{
		result=a*b;
		System.out.println("Multiplication of two Number"+result);
	}
	public void divide(int a,int b)
	{
		result=a/b;
		System.out.println("Division of two Number"+result);
	}
}
public class ArithmeticCalculator1
{
	public static void main(String[] args) 
	{
		 c1 obj= new c1();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first Number:");
		int n=sc.nextInt();
		System.out.println("Enter seconnd  Number:");
		int m=sc.nextInt();
		
		obj.add(n,m);
		obj.sub(n,m);
		obj.multi(n,m);
		obj.divide(n,m);
		
	}

}

