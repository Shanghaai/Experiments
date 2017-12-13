package completeAbstraction;

public class MainClass 
{
	public static void main(String[] args) 
	{
		PassingInstance x1 = new PassingInstance();
		x1.k=124; //re-initialization of k
		

		PassingInstance2 x2 = new PassingInstance2();
		x2.useinstace(x1);
		
	}
}
