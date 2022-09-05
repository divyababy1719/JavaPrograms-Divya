package InterviewQstns;

public class ReverseTheWordAndStoreInSamePosition {

	public static void main(String[] args) {
String s="welcome to tyss";   //emoclew ot ssyt 
 String str[]=s.split(" ");
 for(int i=0;i<str.length;i++)
 {
	 for(int j=str[i].length()-1;j>=0;j--)
	 {
		 System.out.print(str[i].charAt(j));
	 }
	 System.out.print(" ");
 }
	}

}

/*
public class reverese{
public static void main(String args[])
{
String s="are you from kerala";      //kerala uoy morf are 
String  str[]= s.split(" ");
String temp=str[0];
str[0]=str[str.length-1];
str[str.length-1]=temp;

for(int i=0;i<str.length;i++)
{
  if(i!=0 && i!=str.length-1)
  {
  for(int j=str[i].length()-1;j>=0;j--)
  {
      System.out.print(str[i].charAt(j));
  }
  System.out.print(" ");
  }

else
System.out.print(str[i]+" ");
}
}
}
*/

