//�ΰ��� �ֻ����� ������ �� ���� ���� �Է¹��� �����Ǵ� ��� ����� ���� ����ϴ� ���α׷� �ۼ�
import java.util.*;
class vacationhomework6 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("���ϴ� ������ �Է����ּ���:");
	int count=0,num=sc.nextInt();
		for (int i=1;i<=6;i++ )
		{
			for (int j=1;j<=6 ;j++ )
			{
				if(i+j==num)count++;
			}
		}
	System.out.println("���� ����"+num+"�̵Ǵ� ��� ����� ����"+count+"�Դϴ�.");
	}
}
