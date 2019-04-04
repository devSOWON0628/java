//100-999사이에 7의 배수의 개수와 합을 구하시오
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
			System.out.println("100부터999사이에 7의 배수의의 개수");
			System.out.println(t);
			System.out.println("100부터 999사이에 7의배수의 합");
			System.out.println(av);
		
	}
}
