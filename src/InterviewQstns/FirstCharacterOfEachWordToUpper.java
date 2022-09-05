package InterviewQstns;

public class FirstCharacterOfEachWordToUpper {

	public static void main(String[] args) {
	/**	String s="welcome to india";
	String	str[]=s.split(" ");
	for(int i=0;i<str.length;i++)
	{
		String s1=str[i];
		 for(int j=0;j<s1.length();j++)
		 {
			 if(j==0)
			 {
				char ch= (char)(s1.charAt(j)-32);
				System.out.print(ch);
			 }
			 else
				 System.out.print(s1.charAt(j));
		 }
		 System.out.print(" ");
	}*/
		
		String s="welcome to india";
		String	str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			String s1=str[i];
			 for(int j=0;j<s1.length();j++)
			 {
				
					char ch= (char)(s1.charAt(j)-32);
					System.out.print(s1.charAt(ch));
				 }
			
			 System.out.print(" ");
			 }
			
		
	}

}
