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
		System.out.println("경기 규칙은 해당 크래스에서 작성한다");
	}
}

class Baseball extends Sports 
{
	Baseball(String n, int p){
	this.name=n;
	this.player=p;
	}

 public void rule(){
 System.out.println("3번아웃되면 공수교체");
 }
}

class Basketball extends Sports
{
	Basketball(String n, int p){
	this.name=m;
	this.player=p;
	}

public void rule(){
	System.out.println("공을 바구니에 넣어라");
	}
}

class ABC{
	public static void main(String ar[]){
	Baseball bb = new bb("Base ball",9);
	Basketball bk=new Basketball("basket ball",5);
	System.out.println("경기종목:"+bb.name);
	System.out.println("선수인원"+bb.player);
	rule();
	
	}
}