
import java.util.Scanner;
public class Crouse {
	public static void main (String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("enter your prefer crouse");
		String C=S.next();
		switch(C) 
		{
		case "python" : 
			System.out.println(" thanks for Chossing python crouse \n your fee is 25000.00");
			break;
		case "java" :
			System.out.println(" thanks for Chossing java crouse \n your fee is 45000.00");

			break;

		case "php":
			System.out.println(" thanks for Chossing php \n your crouse fee is 45000.00");


			break;
		case "dotnet":
			System.out.println(" thanks for Chossing dotnet\n your crouse fee is 50000.00");
		default : 
			System.out.println("no crouse is exists");
			break;

			


		}

		S.close();

	}

}
