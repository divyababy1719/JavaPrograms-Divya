package groupA;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class NumberOfOccurenceOfEachCharFromString {
	public static void main(String[] args) 
	{
		String s="india";
//Step1: Remove the duplicates,for that create a collection and add all the elements of the given string into set.
		//better to go with linked hashset because it will maintain insertion order and remove duplicates
		
	//	HashSet<Character> set=new HashSet<Character>();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
//Step2: each character of a string with all the characters of given string
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
//step3:If character is matching increment the count
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
//step4:Print character along with count
			System.out.println(ch + " "+count);
		}
	}
}

/*
i 2
n 1
d 1
a 1
*/