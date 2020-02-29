package example03;

public class example01_05 {

	public static int calcSumOfSquares(int nums)
	{
		int result=0;
		for (int i=1; i<=nums; i++)
		{
			result += i*i;
		}
		return result;
	}
	
	public static int calcSumOfSquaresRecursion(int nums)
	{
		if (nums<=1) return 1;
		return nums*nums+calcSumOfSquaresRecursion(nums-1);
	}
	
	
	// для проверки
	public static void main(String[] args) {
		System.out.println(calcSumOfSquares(4));
		System.out.println(calcSumOfSquaresRecursion(5));
	}

}