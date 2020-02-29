package example03;

public class example01_06 {

	public static int[] transformMassiv (int [] m, int n)
	{
		if (n <=m.length) 
		{
			int [] arr = new int [n];
			for (int i=0; i<arr.length; i++) 
			{
			arr[i] = m[i];
			}
			return arr;
		}
		else
		{
			int [] arr = new int [m.length];
			for (int i=0; i<arr.length; i++) 
			{
			arr[i] = m[i];
			}
			return arr;
		}
		
	}
	
		
	public static void main(String[] args) {
		int []M = {1,3,5,6};
		System.out.println(transformMassiv (M, 3));

	}

}