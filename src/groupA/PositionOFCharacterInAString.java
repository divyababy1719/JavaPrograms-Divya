package groupA;

import java.util.LinkedHashSet;

public class PositionOFCharacterInAString {

	public static void main(String[] args) {
		String s="Tester";
		s=s.toLowerCase();
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
			
		}
  for(Character ch:set)
  {
	 for(int i=0;i<s.length();i++)     //t-1 e-2 s-3 r-6
	  //for(int i=s.length()-1;i>=0;i--)      //r-6 e-4 t-4 s-2 
		  
	{
		  if(ch==s.charAt(i))
		  {
			  System.out.println(ch+":"+(i+1));
			  break;
		  }
	}
	}
	}
}


