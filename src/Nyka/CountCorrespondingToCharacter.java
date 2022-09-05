package Nyka;

public class CountCorrespondingToCharacter {

	public static void main(String[] args) {
		String s="aabbbccdab";   //a2 b3 c2 d1 a1 b1 
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					i++;
				}
				else
					break;
				
			}
			System.out.print(s.charAt(i)+""+count+" ");
			
		}
		

	}

}
