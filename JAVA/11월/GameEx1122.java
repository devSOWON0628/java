
interface IZerg
{	abstract void  zergAttack() ;  }
interface  ITerran
{ 	abstract void  terranAttack();  }
interface IProtoss
{  abstract void  protossAttack() ; }

interface IGame extends IZerg, ITerran, IProtoss
{
	int Nuclear = 3 ;//Nuclear�� ����ź�� ����
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
		return  "������";
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
		System.out.println("zerg �����Ѵ�");
		}

	public void  terranAttack()
		{
		System.out.println("terran �����Ѵ�");
		}

	public void  protossAttack()
		{
		System.out.println("protoss �����Ѵ�");
		}

	public void show(){
	zergAttack();
	terranAttack();
	protossAttack();
	System.out.println("����ź�� ���� : "+IGame. Nuclear );
	System.out.print("zerg�� ���� : "+zerg+",");
	System.out.print("terran�� ���� : "+terran+",");
	System.out.println("protoss�� ���� : "+protoss);
	System.out.print("���̸� �̸� : "+gamer());
	System.out.println("   ���� �̸� : "+gameName);
	
	}
}

public class GameEx1122 {
	public static void main(String[] args) {
		int  zerg = 5, terran=7, protoss=9 ;
		String  gamerName="������";
		String gameName  = "��Ÿũ����Ʈ" ;
		//���� �ڵ�� ���� ���� �Ұ�
		IGame ob = new StarCraft(zerg, terran,
			protoss, gamerName, gameName) ;
		ob.show();
		//show() �޼��� ȣ���ؼ� ��� �������� ����ϵ�
		//���̸� �̸� "������"�� ����� �� �������̽� IGame ��
		//����޼����� gamer()�� Override�ؼ�
		//����Ͻÿ�.

	}

}
