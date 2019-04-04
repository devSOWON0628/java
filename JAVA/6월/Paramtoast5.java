// 5개의 매개변수 입력받아 최대값, 최소값출력
class Paramtoast5 {
	public static void main(String ar[]) {
	  int a[]=new int[ar.length];
	  int max=0,min;
	  for (int i=0;i<ar.length ;i++)
	  {
		  a[i]=Integer.parseInt(ar[i]);
	  }
	  min=a[0];
      for (int j=0;j<ar.length ;j++ )
      {
		  if (a[j]>max)
		  {
			  max=a[j];
		  }
		  if (a[j]<min)
		  {
			  min=a[j];
		  }
      }
	  System.out.println("최댓값:"+max+" 최소값:"+min);

	}
}
