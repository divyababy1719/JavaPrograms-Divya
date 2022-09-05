package sampleJavaPrograms;

import java.util.LinkedHashSet;

public class SubstringWithTwoCharactersByRemoveDup {

	public static void main(String[] args) {
		
		String s="welcomecome"; //
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<s.length();i++)
		{
			String res="";
			for(int j=i;j<s.length();j++)
			{
				res=res+s.charAt(j);
				if(res.length()==2)
					//System.out.println(res);
					set.add(res);
			}
			
			}
		System.out.println(set);
		
		}
	}

//[we, el, lc, co, om, me, ec]