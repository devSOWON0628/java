//13. 100������ �ڿ��� n�� �Է¹޾� 1���� n������ ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
class problem13{
	public static void main(String[] args) {
		int sum=0,count=0;
		int n=Integer.parseInt(args[0]);
		if (n>100)System.out.println{("100������ �ڿ����� �Ű������� �Է����ּ���.");return 0;}
		for (int i=1;i<=n ;i++ )
		{
		sum+=i;
		count++;
		}
		System.out.println("1����"+n+"������ ���"+(sum/count);
	}
}
