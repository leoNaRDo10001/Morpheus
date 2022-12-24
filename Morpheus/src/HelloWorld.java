
public class HelloWorld {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for (int n = 0; n < 10; n++ ) 
		{
			arr[n] = n + 10;
		}
		for (int i = 0; i < 10; i++) 
		{
			System.out.println(arr[i]);
		}
	}

}
