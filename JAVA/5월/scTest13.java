//1부터 100까지 7의 배수이거나 11의 배수를 출력
class scTest13 
{
	public static void main(String[] args) 
	{
		for (int n=1;100>=n ;n++ )
		{
			if (n%7==0)
			{
				System.out.println(n);
			}
			else if (n%11==0)
			{
				System.out.println(n);
			}
		}
	}
}
