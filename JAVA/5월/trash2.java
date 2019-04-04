import java.util.*;
class trash2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 n입력");
		int n=sc.nextInt();
		System.out.println("정수 m입력");
		int m=sc.nextInt();

		int big,small,j,h;
		j=0;
		h=0;
		if (n>m)
		{big=n;
			small=m;}
		else
			{big=m;
			small=n;}

			while(small<=big)
				{if 

				(small%2==0)
			{j+=small;}
			else 
				{h+=small;}
			small++;}
			
			System.out.println(n+"부터 "+m+"까지수들의 짝수의 합:"+j+" 홀수의 합"+h);
	}
}
