//14.10���� ������ �Է¹޾� �Է¹��� ������ ¦���� ������ Ȧ���� ������ ���� ���Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
class problem14 {
	public static void main(String ar[]) {
		int jjak=0,hol=0;
		int a[]=new int[10];
		System.out.println("10���� ������ �Է�");
		for (int i=0;i<a.length ;i++ )
		{
			a[i]=Integer.parseInt(ar[i]);
			if (a[i]%2==0)jjak++;
			else hol++;
		} 
		System.out.println("¦���� ����:"+jjak+" Ȧ���� ����:"+hol);
		
	}
}
