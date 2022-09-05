package Practice;


	public class TwoArraySumAndPrintInPattern
	{
	    public static void main(String args[])
	    {
	        int a[]={7,7,8,7};
	        int b[]={6,4,9};       //O/P: 1 3 1 1 1 7 7
	        int count=a.length;
	        if(a.length<b.length)
	            count=b.length;
	             int sum=0;
	        for(int i=0;i<count;i++)
	            {
	              try
	              {
	           sum =a[i]+b[i];
	           int rem=sum%10;
	           int quo=sum/10;
	           System.out.print(quo+" "+rem+" ");
	            }
	            
	            catch(Exception e)
	            {
	            	if(a.length<b.length)
	                    System.out.print(b[i]);
	            	else
	            		System.out.println(a[i]);
	            }
	            }
	    }
	}

