package groupD;

//reverse the words in the sentence
/*
 * input- Welcome to TYSS
 * o/p-emoclew ot ssyt
 */
public class ReverseEachWordAndPrintInArray {

	public static void main(String[] args) {
		
		String s="Welcome to TYSS";     
		String[] str = s.split(" ");
String revSent=" ";
		for(int i=0;i<=str.length-1;i++)
			
		{
			String revword = "";
			String words = str[i];
			for(int j=words.length()-1;j>=0;j--)
			{
				revword=revword+words.charAt(j);
			}
			revSent=revSent+revword +" ";
			
			
		}
		System.out.println(revSent);  
	}
}
		
	/*	String s="Welcome to TYSS";     
		String[] str = s.split(" ");
        String  revSent[]=new String[str.length];
		for(int i=0;i<=str.length-1;i++)
			
		{
			String revword[]=new String[str.length];
			String words = str[i];
			for(int j=words.length()-1;j>=0;j--)
			{
			//	revword=revword+words.charAt(j);
			}
			//revSent=revSent+revword +" ";
			
			
		}
		System.out.println(revSent);
	}
}*/

