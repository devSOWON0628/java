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
	return "�����"+far+"m���� ����ϼ̽��ϴ�. ���⼭ ����� ���"+price+"�� �Դϴ�";
	
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
	if(x.equals("����"))result="����";
	else if(x.equals("����ö"))result="����ö";
	else result="�ȴ�";
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
		System.out.print("��������� ���° �������ΰ���?:");
		chul=sc.nextInt();
		System.out.print("123�� ������ ������� �Դϴ� ����� Ÿ�� ������ ��ȣ�� �Է��� �ּ���:");
		bun=sc.next();
		System.out.print("� ��������� �̿��� ���ΰ���? ����? ����ö? �׿�?:");
		gyo=sc.next();
		System.out.println("");
		
	System.out.println("����� "+v1.take(gyo)+"�� Ÿ���ϴ�");
	System.out.println(v1.start(chul));
	System.out.println("����� �� �߰������ "+v1.stop(bun)+"�� �Դϴ�");
	
	
	}
}
