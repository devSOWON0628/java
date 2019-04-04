//2. 5개받아서 오름차순
class Param_Test3 {
	public static void main(String ar[]) {
		int a[]=new int[5];
		int i,save=0,j;
		for (i=0;i<5 ;i++ )	{
		a[i]=Integer.parseInt(ar[i]);}
        
		for (i=0;i<a.length;i++ )
		{
			for (j=i+1;j<a.length;j++ )
			{
				if (a[i]>a[j]){
				save=a[i];
				a[i]=a[j];
				a[j]=save;}
			}
		}
		for (i=0;i<a.length ;i++ )
		{
			System.out.println(a[i]);
		}
	}

}
