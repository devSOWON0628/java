//100-999사이에 4의 배수가 아닌 수들의 개수와 합을 구하시오
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
		System.out.println("개수"+g);
		System.out.println("합"+t);
	}
}
