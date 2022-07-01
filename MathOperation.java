/*Create a class MathOperation with two data member X and Y to store the operand and third data member R to store 
 	result of operation.
	Create method members
init - to input X and Y from useradd - to add X and Y and store in R
multiply - to multiply X and Y and store in R
power - to calculate X Y and store in R
display- to display Result R
*/
import java.util.Scanner;

public class MathOperation {
	private int X;
	private int Y;
	private int R;
	Scanner s=new Scanner(System.in);
	public void init()
	{
		System.out.println("Enter Two Numbers ");
		 X=s.nextInt();
		 Y=s.nextInt();
		 
	}
	public void add()
	{
	 R=X+Y;
	 }
	public  void multiply()
	{
		R=X*Y;
	}
	public void power()
	{ 
		int i=1;
		R=1;
		for(i=1;i<=Y;i++)
		{
			R=R*X;
			
		}
	}
	public void display()
	{
		System.out.println("Result="+R);
	}
	public static void main(String[] args) {
		MathOperation m=new MathOperation();
		m.init();
		m.add();
		m.display();
		m.multiply();
		m.display();
		m.power();
		m.display();
	}

}
