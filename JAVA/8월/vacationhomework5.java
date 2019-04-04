//1+(-2)+3+(-4)...이런식으로 몇까지 더해야 총합이 100이 되는지 구하시오
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
