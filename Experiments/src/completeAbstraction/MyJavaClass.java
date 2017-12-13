package completeAbstraction;

public class MyJavaClass
{
	static int count;
	private MyJavaClass()
	{
		System.out.println("private constructor in a class makes it complete abstracti");
		count++;
		
	}
	
	   public static  MyInterface getInstance(String val)
	   {
		   MyInterface ref = null;
		   
		   if(val.equals("one"))
		   {
			     ref = new A();
		   }
		   else 
		   {
			   ref = new B();
		   }
		   return ref;
		   
	   }
}
