//100-999���̿� 4�� ����� �ƴ� ������ ������ ���� ���Ͻÿ�
class scTest11 
{
	public static void main(String[] args) 
	{
	int g=0, t=0;
		for (int n=100;999>=n;n++ )
		{
		if (n%4!=0)
		{
			g+=1;
			t+=n;
		}
		}
		System.out.println("����"+g);
		System.out.println("��"+t);
	}
}
