class arrayTest1 {
	public static void main(String[] args) {
		int a[];
		a=new int[5];
		//int a=new int[5];

       for (int i=0;i<a.length ;i++ )
       {
		   a[i]=i+1;
		   System.out.println(a[i]);
		   
       }
	   System.out.println("배열의 크기:"+a.length);
	}
}
