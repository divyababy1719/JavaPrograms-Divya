package sampleJavaPrograms;

import java.util.Scanner;

public class SwapTwoVariablesWithoutTgirdValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=b-a;
		System.out.println(a);
		System.out.println(b);
			
		}

	}


