package sampleJavaPrograms;

public class PrintSubStringWithTwoCharcaters {

	public static void main(String[] args) {
		String s="welcome";
		for(int i=0;i<s.length();i++)
		{
			String res=""+s.charAt(i);
			for(int j=i+1;j<s.length();j++)
			{
				res=res+s.charAt(j);
				 if(res.length()==2)
					   System.out.println(res);
			}
				
		}

	}

}
