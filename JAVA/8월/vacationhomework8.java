//������ݰ��
import java.util.*;
class  vacationhomework8{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int day,hour,min,money=0;
		System.out.print("���ϵ��� �־�����?:");
		day=sc.nextInt();
		System.out.print("��ð����� �־�����?:");
		hour=sc.nextInt();
		System.out.print("��е��� �־�����?:");
		min=sc.nextInt();

		if(hour<=2&&hour>=12)money=2000;
		else money=(hour*1000)+((min/10)*200);
		if(money>=8000)money=8000;
		money+=day*8000;

		System.out.println("���ǵ��� "+money+"�� �Դϴ�.");


		
	}
}
