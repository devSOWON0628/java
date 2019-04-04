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
		return "차의 이름은 "+carnum+"이고 속도는 "+speed+"이다";
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
	return "요트의 번호는"+yacht+" 속도는"+speed+" 차이름은"+carnum;
	}
}
class Test1123
{
	public static void main(String ar[]){
	Scanner sc=new Scanner(System.in);
	int sp;
	car c= new car("소타나",100);
	car3 c3= new car3("3434",123,"아반데");
	System.out.println("올리고 싶은 속도는?");
	sp=sc.nextInt();
	c.speedup(sp);
	c3.speedup(sp);
	System.out.println("내리고 싶은 속도는?");
	sp=sc.nextInt();
	c.speedDown(sp);
	c3.speedDown(sp);

	System.out.println(c3.toString());
	System.out.println(c.toString());


	
	}
}