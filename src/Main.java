public class Homework9_9_23 
{

	public static void main(String[] args) 
	{
		int a = 6;
		int b = 2;
		int n = 513;
		System.out.println(func1(n));
	}

	public static int func1(int n)
	{
		if(n==1) return 1;
		return n + func1(n-1);
	}

	public static int func2(int n)
	{
		if(n==1) return 1;
		return n * func2(n-1);
	}
	
	public static int func3(int n)
	{
		if(n<1) return 1;
		if(n%2!=0) {
			return n * func3(n-2);
		}

		return n;
	}
	
	public static int func4(int n)
	{
		if(n<10) return 1;
		return 1 + func4(n/10);
	}
	
	public static int func5(int a, int b)
	{
		if (a == b) return a;
        else if (a > b) return func5(a - b, b);
        else return func5(a, b - a);
	}
	
	public static boolean func9(int n)
	{
		if(n % 10 % 2 == 0)
		{
			func9(n / 10); 
			return true;
		}
		else if(n % 10 % 2 != 0)
		{
			func9(n / 10); 
			return true;
		}
		return false;
	}
}
