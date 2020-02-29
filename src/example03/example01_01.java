package example03;
import java.lang.String;

public class example01_01 {
		private char symb= '0';
		private String str = "0";
	
	public void setWord (char Symb)
	{
		symb = Symb;
	}
	
	public void setWord (String Str)
	{
		str = Str;
	}
	
	public void setWord (char Word[])
	{
		if( Word.length >1 ) str = new String(Word);
		else symb = Word[0];
	}

	// для проверки:
	public void check()
	{
		System.out.println (symb + " "+ str);
	}

}