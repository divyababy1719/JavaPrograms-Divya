package sampleJavaPrograms;

public class SeperationOfAlphabetDigitAndSpecialCharacters {

	public static void main(String[] args) {
		
		String s="1abCD#9&^%";
		String al="";
		String num="";
		String spe="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122)
			{
				al=al+s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)>='9')
			{
				num=num+s.charAt(i);
			}
			else
				spe=spe+s.charAt(i);
		}
 System.out.println(al);
 System.out.println(num);
 System.out.println(spe);
	}

}
