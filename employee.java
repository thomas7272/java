import java.util.Scanner;
public class employee {
	int yrofjoin;
	String name,address;
	public void getinput()
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the name:");
		name=in.next();
		System.out.println("Enter the year of joining:");
		yrofjoin=in.nextInt();
		System.out.println("Enter the address:");
		address= in.next();
	}
	public void display()
	{
		System.out.println("Name\n"+name);
		System.out.println("Year of joining\n"+yrofjoin);
		System.out.println("Address\n"+address);
	}
public static void main(String args[])
{
	employee e[]=new employee[3];
	for(int i=0;i<3;i++)
	{
		e[i]=new employee();
		e[i].getinput();
	}
	for(int i=0;i<3;i++)
	{
		e[i].display();
	}
}
}
