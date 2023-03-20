package exceptionHandling;

import java.util.Scanner;

public class Use_of_Exp {

	public static void main(String[] args) 
	{

		Use_of_Exp obj=new Use_of_Exp();
		try 
		{
			obj.demo();
		} 
		catch (PratikshaExp e) 
		{
			System.out.println("MSG="+e.getMessage());
		}

	}

	public void demo() throws PratikshaExp
	{
		int num1;
		try(Scanner sc=new Scanner(System.in)){
		System.out.print("Enter a Numbers : ");
		num1=sc.nextInt();
		}
		if(num1>0)
		{
			throw new PratikshaExp("It is an Positive Number");
		}
		else
		{
			throw new PratikshaExp("It is an Negative Number");
		}
	}

}
