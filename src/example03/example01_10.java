package example03;
import java.util.Arrays;

public class example01_10 {

	public static int[] findMinNax(int ... nums)
	{
		int[ ]arr = new int[2];

		Arrays.sort(nums);
		arr[0]=nums[0];
		arr[1]=nums[nums.length-1];
		System.out.println(arr[0] +" "+arr[1]);
		return arr;
	}
	
	public static void main(String[] args) {
		int []M = {9,3,5,6};
		findMinNax(M);	
	}
}