package exceptionDemo;
import java.util.*;

public class Demo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number1");
		int a = sc.nextInt();
		System.out.println("Enter the number2");
		int b = sc.nextInt();
		try
		{
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("invalid division");
		}
	}
}
