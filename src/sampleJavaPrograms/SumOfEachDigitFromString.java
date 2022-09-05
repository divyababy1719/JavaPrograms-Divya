package sampleJavaPrograms;

public class SumOfEachDigitFromString {

	public static void main(String[] args) {
		String s="a2b3c4";  //9
		int sum=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=48 && s.charAt(i)<=57)
			{
				int n = s.charAt(i)-48;
				sum=sum+n;
			}
		
		}
        System.out.println(sum);
	}

}
