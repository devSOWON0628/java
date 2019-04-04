//3. 2개입력 그사이값 출력
class  Param_Test4{
	public static void main(String ar[]) {
		int a[]=new int[2];
		int i,big,small;
		for (i=0;i<2 ;i++ ){
			a[i]=Integer.parseInt (ar[i]);}
     if (a[0]>a[1])
     {
		 big=a[0];
		 small=a[1];
     }
	 else{
		 big=a[1];
	     small=a[0];}

		 for (i=(small+1);i<=big-1;i++)
		 {
			 System.out.println(i);
		 }

	}
}
