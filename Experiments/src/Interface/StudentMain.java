package Interface;
import java.io.IOException;

public class StudentMain {
  public static void main(String[] args) throws IOException {
	Mohit m1 = new Mohit();
//	Rohan r1 = new Rohan();

	m1.PrintDetails(21,"Mohit","16-12-1992");
	m1.ReportCardDetails("Math", 66);
	//r1.PrintDetails(78, "Rohan", 15--465-5455);
	//r1.ReportCardDetails("English",78/100);
	
  }	
}
