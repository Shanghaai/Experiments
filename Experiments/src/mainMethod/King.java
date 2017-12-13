package mainMethod;

public class King 
{
	
	public static void main(String[] args) 
	{
		System.out.println("i am main");
	}
	
	static
	{
		System.out.println("i am static");
		main(new String[4]);
	}
}
