import java.util.*;
class trash2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���� n�Է�");
		int n=sc.nextInt();
		System.out.println("���� m�Է�");
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
			
			System.out.println(n+"���� "+m+"���������� ¦���� ��:"+j+" Ȧ���� ��"+h);
	}
}
