//�� ���� ������ �Է¹޾� �� �� ���� ���̿��� 3�� ����̰ų� 5�� ����� ������ �հ� ����� ���
import java.util.*;
class home_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum1 =0;//��
		int sum2 =0;//���
		int i=0;//�����ִ¼�
		if (num1<num2)
		{
			for (int a=num1;a<=num2 ;a++ )
			{
				i++;
					if (a%3==0&&a%5==0)
					{
					sum1+=a;
					sum2=sum1/i;
					}
			}
		
		}
		else {
			for (int a=num2;a<=num1 ;a++ )
			{
				i++;
					if (a%3==0&&a%5==0)
					{
					sum1+=a;
					sum2=sum1/i;
					}
					
			}

	}
	System.out.println("3�� ����̰ų� 5�� ����� ���� ��:"+sum1);
	    System.out.println("3�� ����̰ų� 5�� ����� ���� ���:"+sum2);
}
}
