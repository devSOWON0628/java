//최대최소
class Param_Test2 {
	public static void main(String ar[]) {
		int a[]=new int[5];
		int i;
		for (i=0;i<5 ;i++ )	{
		a[i]=Integer.parseInt(ar[i]);}
		
        int max=a[0];
		int min=a[0];

		for (i=0;i<ar.length ;i++ )
			{
			if (a[i]>max){
				max=a[i];}
			else{
				min=a[i];}
		    }
		System.out.println("최댓값:"+max+"최솟값:"+min);
		
	}
}
