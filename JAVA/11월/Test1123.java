import java.util.*;
interface Movable
{
	public abstract void speedup(int amount);
	public abstract void speedDown(int amount);

}

class vehicle 
{
	int speed;
	void setSpeed(int s){this.speed=s;}
	int getSpeed(){return speed;}

}
class car extends vehicle implements Movable 
{
	String carnum;
	int speed;
	car(String cn, int sp)
	{
		this.carnum=cn;
		this.speed=sp;
	}
	public void speedup(int amount)
	{
	speed+=amount;
	}

	public void speedDown(int amount)
	{
	speed-=amount;
	}

	public String toString()
	{
		return "���� �̸��� "+carnum+"�̰� �ӵ��� "+speed+"�̴�";
	}
}

class car3 extends vehicle implements Movable
{
String yacht;
int speed;
String carnum;
	car3(String y, int speed, String carnum){
	this.yacht=y;
	this.speed=speed;
	this.carnum=carnum;
	}

	public void speedup(int amount){
	speed+=amount;
	}
	public void speedDown(int amount){
	speed-=amount;
	}

	public String toString(){
	return "��Ʈ�� ��ȣ��"+yacht+" �ӵ���"+speed+" ���̸���"+carnum;
	}
}
class Test1123
{
	public static void main(String ar[]){
	Scanner sc=new Scanner(System.in);
	int sp;
	car c= new car("��Ÿ��",100);
	car3 c3= new car3("3434",123,"�ƹݵ�");
	System.out.println("�ø��� ���� �ӵ���?");
	sp=sc.nextInt();
	c.speedup(sp);
	c3.speedup(sp);
	System.out.println("������ ���� �ӵ���?");
	sp=sc.nextInt();
	c.speedDown(sp);
	c3.speedDown(sp);

	System.out.println(c3.toString());
	System.out.println(c.toString());


	
	}
}