import java.util.Scanner;
public class convert {
	public static void main(String args[]) {
		double minyr= 60*24*365;
		Scanner input= new Scanner(System.in);
		System.out.println("Input the number of minutes:");
		double min=input.nextDouble();
		long years=(long)(min/minyr);
		int days=(int)(min/60/24)%365;
		System.out.println((int)min+ "is equal to"+ years +"years and" +days+ "days");
		
	}

}
