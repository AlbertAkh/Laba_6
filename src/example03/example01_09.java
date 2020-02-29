package example03;

public class example01_09 {

	public static void replace (char [] M)
	{
		char ch1;

		for (int i = 0; i <M.length/2; i++)
		{
			ch1 = M[i];
			M[i] = M[M.length-i-1];
			M[M.length-i-1]=ch1;

		}
		for (int j = 0; j < M.length; j++)
		{
			System.out.println(M[j]);
		}
	}
	
	
	public static void main(String[] args) {
		char []M = {'d','f','j', 'y'};
		replace(M);

	}

}