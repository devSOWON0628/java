//n�� �Է¹޾� 1~n���̿� 3�� ����̸鼭 5�� ����μ� ���
import java.util.*;
class  trash7{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int i=1;
		do{
			if (i%3==0&&i%5==0)
			{
				System.out.println(i);
				
				}
				i++;
		}
		while (n>=i);
	}
}
