//�� ���� ������ �Է¹޾� �� �� ���� ���̿��� 3�� ����̰ų� 5�� ����� ������ �հ� ����� ���
import java.util.*;
class so10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int sum1=0;//��
		int sum2=0;//���
        int i=0;
        
		
		if (num1>num2)
		{
			
			for (int a =num2 ; num1>=a ; a++)
			{
				 i++;
				if (a%3==0&&a%5==0)
				{
		
					sum1=sum1+a;
					sum2=sum1/i;
					
				    
				
				}
				

			}
			System.out.println("��:"+sum1+"���:"+sum2);
		}
		else{
		for (int a =num1;num2>=a ;a++ )
		{
			i++;
				if (a%3==0&&a%5==0){
				sum1=sum1+a;
					sum2=sum1/i;
			
			}
			}
			System.out.println("��:"+sum1+"���:"+sum2);
			}
			



		
	}
}
