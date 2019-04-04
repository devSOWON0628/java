class  sosowon{
	public static void main(String[] args) {
		int a[][]=new int[2][3];
		int sum=0;
		for (int i=0;i<a.length ;i++)
		{
			System.out.println("");
			for (int j=0;j<a[i].length ;j++ )
			{
				sum+=10;
				a[i][j]=sum;

			    System.out.print(a[i][j]+" ");
			}
		}
		
	}
	
}
