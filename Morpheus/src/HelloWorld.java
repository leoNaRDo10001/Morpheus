
public class HelloWorld 
{

	public static void main(String[] args) {
		System.out.println(plus(5,3));
		System.out.println(plus(5,3,77));
	}
	
	public static int plus(int a, int b)
	{
		System.out.println("erste methode benutzt");
		return a+b;
	}
	
	public static int plus(int a, int b, int c)
	{
		System.out.println("zweite methode benutzt");
		return a+b+c;
	}
	

}
