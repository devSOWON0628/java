//주차요금계산
import java.util.*;
class  vacationhomework8{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int day,hour,min,money=0;
		System.out.print("몇일동안 있었나요?:");
		day=sc.nextInt();
		System.out.print("몇시간동안 있었나요?:");
		hour=sc.nextInt();
		System.out.print("몇분동안 있었나요?:");
		min=sc.nextInt();

		if(hour<=2&&hour>=12)money=2000;
		else money=(hour*1000)+((min/10)*200);
		if(money>=8000)money=8000;
		money+=day*8000;

		System.out.println("내실돈은 "+money+"원 입니다.");


		
	}
}
