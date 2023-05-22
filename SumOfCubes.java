package com.java;
import java.util.*;
public class SumOfCubes {
	public static int sumOfCubeOfDigits(int number)
	{
		int sum=0;
		while(number!=0)
		{
			int i=number%10;
			sum=sum+(i*i*i);
			number=number/10;
		}
		return sum;
	}

	public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int n=input.nextInt();
       int result=sumOfCubeOfDigits(n);
       System.out.print(result);
	}
}
