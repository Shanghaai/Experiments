package Interface;
import java.io.IOException;

interface Student {
	
	void PrintDetails(int roll,String Name,String BirthDate) throws IOException;
	//we can not declare this method with static modifier
	public void ReportCardDetails(String SubName,int Marks);
}

class Mohit implements Student{
	@Override
	public void PrintDetails(int roll, String Name,  String BirthDate)
			throws IOException {
		
		// TODO Auto-generated method stub
		System.out.println("Student NAME : "+Name);
		System.out.println("Student Roll nO. : "+roll);
		System.out.println("Student Birth-Date : "+BirthDate);
	}

	@Override
	public void ReportCardDetails(String SubName, int Marks) {
		// TODO Auto-generated method stub
		System.out.println("Subject NAME : "+SubName);
		System.out.println("Marks : "+Marks);
 }
}
//class Rohan implements Student{
//	
//	@Override
//	public void PrintDetails(int roll, String Name, int BirthDate)
//			throws IOException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void ReportCardDetails(String SubName, int Marks) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}