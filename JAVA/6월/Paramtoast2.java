//2.100������ �ΰ��� ������ �Է¹޾� ���� ������ ū������ ���ʴ�� ���
class Paramtoast2{
	public static void main(String ar[] ) {
		int a=Integer.parseInt(ar[0]);
		int b=Integer.parseInt(ar[1]);
		int big,small,i;
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

		if (a>100||b>100)
		{
			System.out.println("���α׷��� �����մϴ� 100������ ���ڸ� �Է����ּ���");
		}

		for (i=small;i<=big ;i++)
		{
			System.out.println(+i);
		}



		

	}
}
