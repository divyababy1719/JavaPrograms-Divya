package Nyka;

public class LongestStringFromArray {
	public static void main(String args[])
	{
		String ar[]= {"hello","world","goodmorning","kerala","calvarymount"};
		String max=ar[0];
		for(int i=0;i<ar.length;i++)
		{
		   if(ar[i].length()>max.length())
		   {
			   max=ar[i];
		   }
		  
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i].length()==max.length())
			{
				System.out.println(ar[i]);
			}
		}
	}

}
