package example03;

public class example01_03 {

	public static int findMin(int ... nums) 
	{
		int min = nums[0];
		for (int i = 0; i< nums.length; i++)
		{
			if (min >nums[i]) min = nums[i];
		}
		
		return min;
	}
	
	public static int findMax(int ... nums) 
	{
		int max = nums[0];
		for (int i = 0; i< nums.length; i++)
		{
			if (max <nums[i]) max = nums[i];
		}
		
		return max;
	}
	
	public static int findMiddle(int ... nums) 
	{
		int sum = 0;
		for (int i = 0; i< nums.length; i++)
		{
			sum+=nums[i];
		}
		
		return sum/nums.length;
	}
	
	
	public static void main(String[] args) {
		System.out.println(findMin(5,6,3));
		System.out.println(findMax(5,6,3,9));
		System.out.println(findMiddle(5,6,3,9));
	}

}