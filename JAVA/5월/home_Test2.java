//10���� ������ �Է¹޾� �Է¹��� ���� �� ¦���� ������Ȧ���� ������ ���� ���Ͽ� ���
import java.util.*;
class home_Test2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int num=sc.nextInt();�Է¹޴� ����
		int sum1=0;//¦
		int sum2=0;//Ȧ
		
		for (int i=1;10>=i ;i++ )
		{
			int num=sc.nextInt();
			if (num%2==0)
			{
				sum1++;
			}
			else{
               sum2++;}
		}
		System.out.println("¦���� ����:"+sum1+"Ȧ���� ����"+sum2);
	}
	
}
