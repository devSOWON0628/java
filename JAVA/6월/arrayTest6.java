//3��������� �Է��� 5���޾Ƽ� �ִ밪 ���
import java.util.*;
class arrayTest6 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int i[]=new int[5];
		int sum=0;
			for (int n=0;n<i.length ; n++)
			{
			 i[n]=sc.nextInt();
		 if (sum<i[n])
			 {
				 sum=i[n];

			 }

			}
			System.out.println("����ū��"+sum);
	}
}
