
public class test 
{

	static int add(int a,int b)
	{
		int sum=a+b;
		return sum;
		
	}
	static int sub(int a,int b)
	{
		int diff=a-b;
		return diff;
	}
	static int mul(int a,int b)
	{
		int prod=a*b;
		return prod;
	}
	static double div(int a,int b)
	{
		double rem=a/b;
		return rem;
	}
	public static void main(String[] args) 
	{
		int d=add(10,5);
		System.out.println(d);
		int s=sub(10,5);
		System.out.println(s);
		int m=mul(10,5);
		System.out.println(m);
		double di=div(5,10);
		System.out.println(di);
		
	}

}
