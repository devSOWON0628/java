
interface IZerg
{	abstract void  zergAttack() ;  }
interface  ITerran
{ 	abstract void  terranAttack();  }
interface IProtoss
{  abstract void  protossAttack() ; }

interface IGame extends IZerg, ITerran, IProtoss
{
	int Nuclear = 3 ;//Nuclear는 핵폭탄의 갯수
	default public  String gamer()
	{ 
		return  null ;
	}

	abstract void  zergAttack();

	abstract void  terranAttack();

	abstract void  protossAttack();

	abstract void  show() ;

}

class StarCraft implements  IGame
{
	int zerg, terran, protoss ;
	String  gamerName , gameName ;	
    public  String gamer()
	{ 
		return  "이윤열";
	}
	StarCraft(int zerg, int terran, int protoss, String gamerName, String gameName)
	{
	this.zerg=zerg;
	this.terran=terran;
	this.protoss=protoss;
	this.gamerName =gamerName;
	this.gameName=gameName;
	}
	public void  zergAttack()
		{
		System.out.println("zerg 공격한다");
		}

	public void  terranAttack()
		{
		System.out.println("terran 공격한다");
		}

	public void  protossAttack()
		{
		System.out.println("protoss 공격한다");
		}

	public void show(){
	zergAttack();
	terranAttack();
	protossAttack();
	System.out.println("핵폭탄의 갯수 : "+IGame. Nuclear );
	System.out.print("zerg의 갯수 : "+zerg+",");
	System.out.print("terran의 갯수 : "+terran+",");
	System.out.println("protoss의 갯수 : "+protoss);
	System.out.print("게이머 이름 : "+gamer());
	System.out.println("   게임 이름 : "+gameName);
	
	}
}

public class GameEx1122 {
	public static void main(String[] args) {
		int  zerg = 5, terran=7, protoss=9 ;
		String  gamerName="이윤열";
		String gameName  = "스타크래프트" ;
		//다음 코드는 절대 수정 불가
		IGame ob = new StarCraft(zerg, terran,
			protoss, gamerName, gameName) ;
		ob.show();
		//show() 메서드 호출해서 모든 변수값들 출력하되
		//게이머 이름 "이윤열"을 출력할 때 인터페이스 IGame 의
		//멤버메서드인 gamer()를 Override해서
		//출력하시오.

	}

}
