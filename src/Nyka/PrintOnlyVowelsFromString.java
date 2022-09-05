package Nyka;

import java.util.LinkedList;

public class PrintOnlyVowelsFromString {

	public static void main(String[] args) {
		String s="engineering";
	
		for(int i=0;i<s.length();i++)
		{
			char ch= s.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println(ch);
			
		}
			
	}	
		
	}
}
