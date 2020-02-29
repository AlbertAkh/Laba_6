package example03;

public class example01_04 {

	public static int calcSecondFactorial(int num) 
	{
		int result=1;
		if (num%2==1)
		{
			for (int i = 1; i<=num; i +=2)
			{
				result= result *i;
			}
		}
		else 
		{
			for (int i = 2; i<=num; i +=2)
			{
				result= result *i;
			}
		}
		return result;
	}
	// метод с рекурсией
	public static int calcRecursionSecondFactorial(int num)
	{
		if (num<3) return num;
		else return num*calcRecursionSecondFactorial(num-2);

	}
	
	// для проверки
	public static void main(String[] args) {
		System.out.println(calcSecondFactorial(6)) ;
		System.out.println(calcRecursionSecondFactorial(6)) ;
	}

}