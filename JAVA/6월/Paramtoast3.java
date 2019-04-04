//3. n, m을 입력받아 n부터 m사이의 정수 평균
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
