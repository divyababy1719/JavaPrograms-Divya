package sampleJavaPrograms;

public class OccurenceOf2ndStringIn1st {

	public static void main(String[] args) {
		
		String s1="javaseleniumjavajavapython";
		String s2="java";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i;j<s1.length();j++)
			{
				String  res=s1.substring(i, j);
				//System.out.println(res);
				if(s2.equals(res))
				{
					count++;
				}
			}
		}
	System.out.println(s2+" "+count);

	}

}
