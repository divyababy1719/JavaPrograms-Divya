package groupD;

public class PrintMinimumElementInArray {

	public static void main(String[] args) {
		int a[]= {20,10,40,30,50};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
			}
	}
		//System.out.println(a[0]+" ");  first minimum
		System.out.println(a[1]+" ");  //second minimum
	}
}

