//12.�������Է¹޾Ƽ� 1���� �Է¹��� ���������� 5�� ����� ���� ���Ͽ� ����ϴ� ���α׷��� �ۼ�
class problem12 {
	public static void main(String ar[]) {
		int a=Integer.parseInt(ar[0]);
		int b=Integer.parseInt(ar[1]);
		int big,small,sum=0;

		if (a>b)
		{
			big=a;
			small=b;
		}
		else {small=a;
		big=b;}

		for (int i=small;i<=big ;i++ )
		{
			if (i%5==0)
			{
				sum+=i;
			}

		}
		System.out.println(sum);
	}
}
