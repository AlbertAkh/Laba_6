package example03;

public class example01_08 {

	public static int calcMiddle(int[] M) 
	{
		int summa=0;
		for (int i=0; i<M.length; i++)
		{
			summa+=M[i];
		}
		return summa/M.length;
	}
	
	public static void main(String[] args) {
		int []M = {1,3,5,6};
		System.out.println(calcMiddle(M));

	}

}