package com.Day_11_12_OOPS_Problems;

import java.util.*;

public class Stock_Account_Management 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Stocks: ");
		int n = sc.nextInt();
		String stockName[] = new String[n];
		int noOfShares[] = new int[n];
		int sharePrice[] = new int[n];
		int stockValue[] = new int[n];
		int totalValue=0;
		int i;
		for(i=0; i<n; i++)
		{
			System.out.println("Enter The Name Of Stock: ");
			stockName[i] = sc.next();
			System.out.println("Enter The Number Of Shares Stock Have: ");
			noOfShares[i] = sc.nextInt();
			System.out.println("Enter The Price Of Each Share In The Stock: ");
			sharePrice[i] = sc.nextInt();
			stockValue[i] = noOfShares[i] * sharePrice[i];
		}
		for(i=0; i<n; i++)
		{
			System.out.println("Stock Name : "+stockName[i]);
			System.out.println("Number Of Shares : "+noOfShares[i]);
			System.out.println("Price Of Each Share : "+sharePrice[i]);
			System.out.println("Toatal Stock Value : "+stockValue[i]);
			totalValue=totalValue+stockValue[i];
		}
		System.out.println("Total Value Of All Stocks : "+totalValue);
	}
}













