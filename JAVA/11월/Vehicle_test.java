import java.util.*;
abstract class Vehicle
{
	String name;
	int price;
	int far=0;
	
	abstract String start(int x);
	abstract int stop(String x);
	abstract String take(String x);
}

class V_1 extends Vehicle
{
	public String start(int x){
	far=100*x;
	price=100*far;
	return "당신은"+far+"m에서 출발하셨습니다. 여기서 출발할 경우"+price+"원 입니다";
	
	}

	public int stop(String x)
	{
	if(x.equals("123"))price = 3000;
	else price=1000;
	return price;
	}

	public String take(String x){
	String result;
	//String a;
	//a=x;
	if(x.equals("버스"))result="버스";
	else if(x.equals("지하철"))result="지하철";
	else result="걷다";
	return result;

	}

}
class Vehicle_test
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		V_1 v1=new V_1();
		int chul;
		String gyo,bun;
		System.out.print("출발지점은 몇번째 정류장인가요?:");
		chul=sc.nextInt();
		System.out.print("123번 버스는 직행버스 입니다 당신이 타실 버스의 번호를 입력해 주세요:");
		bun=sc.next();
		System.out.print("어떤 교통수단을 이용할 것인가요? 버스? 지하철? 그외?:");
		gyo=sc.next();
		System.out.println("");
		
	System.out.println("당신은 "+v1.take(gyo)+"를 타고갑니다");
	System.out.println(v1.start(chul));
	System.out.println("당신이 낼 추가요금은 "+v1.stop(bun)+"원 입니다");
	
	
	}
}
