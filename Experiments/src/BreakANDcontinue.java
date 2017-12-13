
public class BreakANDcontinue 
{
	public static void main(String[] args) {
		for(int i=0;i<100;i++)
		{
			if(i%2==0)
				continue;
			System.out.println(i);
		}

		for(int x=0;x<20;x++)
		{
		if( x==7)
		{
			continue;
		}
		System.out.println("x value: "+x); //it will skip 7 in case of continue
  }
}
}
