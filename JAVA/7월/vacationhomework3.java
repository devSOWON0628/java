//1���� 20������ ���� �߿��� 2�Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�
class vacationhomework3 {
	public static void main(String[] args) {
		int sum=0;
		for (int n=1;n<=20 ;n++ )
		{
			if (n%2==0)continue;
			if (n%3==0)continue;
		sum+=n;
		}
		System.out.println("1���� 20������ �����߿��� 2�Ǵ� 3�� ����� �ƴ� ���� ����:"+sum);
	}
}
