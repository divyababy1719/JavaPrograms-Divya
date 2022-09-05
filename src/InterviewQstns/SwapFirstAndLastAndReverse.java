package InterviewQstns;

public class SwapFirstAndLastAndReverse {

	public static void main(String[] args) {

		  String s1="welcome to tyss banglr";  // rlgnab to tyss emoclew
		  String str[]=s1.split(" ");
		  
		  String temp=str[0];
		  str[0]=str[str.length-1];
		  str[str.length-1]=temp;
		  
		  for(int i=0;i<str.length;i++)
		  {
			String ele=  str[i];
			if(i==0 || i==str.length-1)
			{
			for(int j=ele.length()-1;j>=0;j--)
			{
				System.out.print(ele.charAt(j));
			}
			System.out.print(" ");
		  }
		 
		  else
			  System.out.print(str[i]+" ");
		  }
		  
	}

}
