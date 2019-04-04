interface starcraft
{
	int max=50;
	int min=0;

	public String movable();
	public String attackable();

}
//////////////////////////////////////////////////////////
class jerg implements starcraft
{
	int x=0,y=0;
	String color;
	public String movable()
		{
		if(max>=100||min>=100){x=0; y=0;}
		else {x+=10; y+=10;}
		return "x좌표는: "+x+" y좌표는:"+y;
		}
	public String attackable()
		{
		if(max>=30){x=30;y=50;}
		
		else{
			x=20;y=30;}
		return "x좌표는: "+x+" y좌표는:"+y;
		}
	jerg(int x, int y, String color)
	{
	this.x=x;
	this.y=y;
	this.color=color;
	}

}
///////////////////////////////////////////////////////////////////////
class talz implements starcraft
{
int x=0, y=0;
String color;

talz(int x, int y, String color)
	{
	this.x=x;
	this.y=y;
	this.color=color;
	}

public String movable()
{
	if(x>=5||y>=5){x=0;y=0;}
	else {x+=1; y+=1;}
	return "x좌표는: "+x+" y좌표는:"+y;

};
public String attackable()
{
	if(x<=3||y<=4){x+=4;y+=3;}
	else x=0;y=0;
	return "x좌표는: "+x+" y좌표는:"+y;

}


}
class Test_stacraft
{
	public static void main(String ar[])
	{
	jerg j=new jerg(3,5,"빨간색");
	talz t=new talz(100,300,"노란색");
	System.out.println("저그의 색은"+j.color);
	System.out.println("테일즈 런너의 색은"+t.color);
	System.out.println("저그의 위치:"+j.movable());
	System.out.println("테일즈 러너의 위치:"+t.movable());
	System.out.println("저그가 공격한 후 위치:"+j.attackable());
	System.out.println("테일즈 러너가 공격한 후 런너의 위치:"+t.attackable());
	}
}

