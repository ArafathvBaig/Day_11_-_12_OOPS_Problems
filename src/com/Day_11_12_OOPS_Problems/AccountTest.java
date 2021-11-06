package com.Day_11_12_OOPS_Problems;

import java.util.Scanner;

public class AccountTest 
{
	int balance = 5000;
	int withDraw;
	Scanner sc = new Scanner(System.in);
	public void debit()
	{
		System.out.println("Enter The Amount To WithDraw : ");
		withDraw = sc.nextInt();
		if(withDraw<=balance)
		{
			if(withDraw<0)
			{
				System.out.println("Entered Amount is in -ve Value");
				System.out.println("The Balance is : "+balance);
			}
			else
			{
				System.out.println("Amount Debited From Main Balance : "+withDraw);
				balance = balance-withDraw;
				System.out.println("The Balance is : "+balance);
			}
		}
		else
		{
			System.out.println("WithDraw Amount Exceeded The Main Balance");
			System.out.println("The Balance is : "+balance);
		}
	}
	public static void main(String[] args) 
	{
		AccountTest ac = new AccountTest();
		ac.debit();
	}
}
