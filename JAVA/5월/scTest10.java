//100-999���̿� 7�� ����� ������ ���� ���Ͻÿ�
class scTest10{
	public static void main(String ar[]){
int t=0, av=0;
		for (int n=100;999>=n ;n++ )
		{
		
			if (n%7==0)
			{
				av+=n;
				t+=1;
			}
		}
			System.out.println("100����999���̿� 7�� ������� ����");
			System.out.println(t);
			System.out.println("100���� 999���̿� 7�ǹ���� ��");
			System.out.println(av);
		
	}
}
