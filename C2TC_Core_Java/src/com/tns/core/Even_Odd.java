package com.tns.core;
import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=a.nextInt();
		if(num % 2 == 0)
			System.out.println(num+ "is even");
		else
			System.out.println(num+ "is odd");
			

	}

}
