//3. n, m�� �Է¹޾� n���� m������ ���� ���
class Paramtoast3 {
	public static void main(String ar[]) {
		int n=Integer.parseInt(ar[0]);
		int m=Integer.parseInt(ar[1]);
		int sum=0,i=0;

		for (int j=n;j<=m ;j++ )
		{
			sum+=j;
			i++;
		}
		System.out.println((float)(sum/i));
	}
}
