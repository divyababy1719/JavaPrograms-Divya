package sampleJavaPrograms;

public class PrintAllPossibleSubStringOfGivenString {

	public static void main(String[] args) {

		String s="welcome";  //we wel welc  welco   welcom  w
		
		for(int i=0;i<s.length();i++)
		{
			//String res=" ";  
			String res=" "+s.charAt(i);  
			for(int j=i+1;j<s.length();j++)
				{
				   res=res+s.charAt(j); //if only want the output
				   if(res.length()==2)
				  System.out.println(res);
				 
				  System.out.println(s.substring(i,j));
			
				}
		}
	}

}
