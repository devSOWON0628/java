//1���� 100������ �����߿��� 4�� ����� ����ϵ� ���ٿ� 8������ ���
class problem2 {
	public static void main(String ar[]) {
		int count=0;
		for (int i=1;i<=100 ;i++ )
		{
			if (i%4==0)
			{
				System.out.print(i+" ");
				count++;
				if (count==8)
				{
					System.out.println(" ");
					count=0;
				}
			}
		}
	
	
	
	}}