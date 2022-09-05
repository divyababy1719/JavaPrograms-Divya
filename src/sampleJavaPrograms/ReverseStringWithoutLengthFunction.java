package sampleJavaPrograms;

public class ReverseStringWithoutLengthFunction {

	public static void main(String[] args) 
	{
		String s="India";
		String rev="";
		int count = s.compareTo(rev);
		System.out.println(count);
		for(int i=count-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
				
	}
}

/*
	public static void main(String[] args) 
	{
		String s="India";
		char[] str = s.toCharArray();
		int count=0;
		String rev="";
		for(char c:str)
		{
			
		}
		for(int i=str.length-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}*/