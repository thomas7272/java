import java.util.Scanner;
public class switchstate {
	public static void main(String args[])
	{
		int choice;
		System.out.println("Enter your choice:\n 1.hello\t2.hai\t3.welcome\t");
		Scanner s= new Scanner(System.in);
		choice = s.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Hello java");
		break;
		case 2:System.out.println("Hai java");
		break;
		case 3:System.out.println("Welcome java");
		break;
		default:System.out.println("Invalid choice");
		break;
		}
	}

}
