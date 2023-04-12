
public class HelloWorld {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int[] arr1 = new int[5];
		
		for(int zaehler = 0; zaehler < 5; zaehler ++)
		{
			arr[zaehler] = zaehler + 5;
			arr1[zaehler] = arr[zaehler] * 10;
		}
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println(arr[i] * arr1[i % 5]);
		}
	}
/*comment*/
}
