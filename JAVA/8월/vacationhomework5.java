//1+(-2)+3+(-4)...�̷������� ����� ���ؾ� ������ 100�� �Ǵ��� ���Ͻÿ�
class vacationhomework5 {
	public static void main(String[] args) {
		int sum=0,n;
		for(n=1;sum<=100;n++)
		{
			if(sum>=100)break;
			if (n%2==0){sum-=n;continue;}
			sum+=n;
		}
		System.out.println(n);
	}
}
