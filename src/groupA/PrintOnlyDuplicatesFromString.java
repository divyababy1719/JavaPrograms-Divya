package groupA;

import java.util.LinkedHashSet;

public class PrintOnlyDuplicatesFromString {

	public static void main(String[] args) {
//Step1:Create a collecion and all the duplicates into that collection'
		String s="india";
		
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
//step4:check the condition for duplicate
					if(count>1)
					{
					System.out.println(ch + " "+count);
					}
				}

			}

		}

