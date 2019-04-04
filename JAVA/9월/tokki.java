class{
	public static void main(String ar[]){

	int a[]=new int[899];
	int num=0,sum;
	for (int i=0;i<a.length ;i++ )
	{
		a[i]=i+100;
	}

	for (int i=0;i<a.length ;i++ )
	{
		if (a[i]%6==0)
		{
			sum+=a[i];
			num++;
		}

	}


	System.out.println(sum+" "+num);
	}


}