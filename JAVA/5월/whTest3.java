import java.util.*;
class whTest3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���� n�� �Է¹ް� 1���� n���� ¦���� ���� ���Ͻÿ�");
		System.out.println("���� n �Է�");

		int n=sc.nextInt();
		int a=1;
		int t=0;
		while (a<=n)
		{
			if (a%2==0)
			{
				t+=a;
				
				
			}
			a++;
		}System.out.println(t);
	}
}
