
public class HelloWorld 
{

	public static void main(String[] args) {
		for(int i = 0; i < 168; i++)
		{
			for(int j = 0; j < 100; j++)
			{
				System.out.println(plus(i, j));
			}
		}
	}
	
	public static int plus(int a, int b)
	{
		return a+b;
	}
	

}
