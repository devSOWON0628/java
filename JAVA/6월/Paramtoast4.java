//4. �ΰ��� ���� �Է¹޾� �� ���� ������ 3�� ����̰ų� 7�� ����� ������ �հ� ���
class Paramtoast4 {
	public static void main(String ar[]) {
		int a=Integer.parseInt(ar[0]);
		int b=Integer.parseInt(ar[1]);
		int sum=0,big,small,i,count=0;
		
		if (a>b)
		{
			big=a;
			small=b;
		}
		else
		{
		    big=b;
		    small=a;
		}

		for (i=small;i<=big ;i++ )
		{
			if (i%3==0||i%7==0)
			{
				sum+=i;
				count++;
			}
		}

		System.out.println("��"+sum+"���"+((float)(sum/count)));	
		}
}
