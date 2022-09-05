package groupD;

public class Print1sInFirst0sInLast {

	public static void main(String[] args) {
		int a[]= {1,0,1,1,1,0,0,1,0};
		int b[]=new int[a.length];
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				b[count]=a[i];//b[count++]=a[i];
				count++;
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				b[count]=a[i];  //b[count++]=a[i];
				//count++;
			}
			
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]);
		}
		

	}

}

//11111000