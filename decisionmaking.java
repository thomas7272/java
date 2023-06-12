import java.util.Scanner;
public class decisionmaking {
	public static void main(String args[]) {
		int age;
		System.out.println("Enter your age:");
		Scanner s= new Scanner(System.in);
		age=s.nextInt();
		if(age>18)
			System.out.println("You are eligibale to vote.");
		else
			System.out.println("You are not eligiable to vote.");
			
	}
}
