public class Sports
{
	String name;
	int player;
	public Sports(String name, int player){
	this.player=player;
	this.name=name;
	}

	public int getPlayer(){
		return player;
	}

	public String getName(){
		return name;
	}

	public void rule(){
		System.out.println("��� ��Ģ�� �ش� ũ�������� �ۼ��Ѵ�");
	}
}

class Baseball extends Sports 
{
	Baseball(String n, int p){
	this.name=n;
	this.player=p;
	}

 public void rule(){
 System.out.println("3���ƿ��Ǹ� ������ü");
 }
}

class Basketball extends Sports
{
	Basketball(String n, int p){
	this.name=m;
	this.player=p;
	}

public void rule(){
	System.out.println("���� �ٱ��Ͽ� �־��");
	}
}

class ABC{
	public static void main(String ar[]){
	Baseball bb = new bb("Base ball",9);
	Basketball bk=new Basketball("basket ball",5);
	System.out.println("�������:"+bb.name);
	System.out.println("�����ο�"+bb.player);
	rule();
	
	}
}