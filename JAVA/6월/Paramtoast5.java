// 5���� �Ű����� �Է¹޾� �ִ밪, �ּҰ����
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
	  System.out.println("�ִ�:"+max+" �ּҰ�:"+min);

	}
}
