//������ �Ž������� �� ���� �������� ������ �� �ִ����� ����ϴ� �����̴� ������ �ݾ��� �������� �ٲ㼭 ���
import java.util.*;
class vacationhomework7 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("�Ž������� �Է��� �ּ���:");
		int change=sc.nextInt();
		int c500=0; int c100=0; int c50=0; int c10=0;
		while (change>0){
			if (change>=500)
			{
				c500++;
				change-=500;
			}
			else if (change>=100)
			{
				c100++;
				change-=100;
			}
			else if (change>=50)
			{
				c50++;
				change-=50;
			}
			else if (change>=10)
			{
				c10++;
				change-=10;
			}
								}
		System.out.println("500��:"+c500+"�� 100��:"+c100+"�� 50��:"+c50+"�� 10��:"+c10+"��");

		
	}
}
