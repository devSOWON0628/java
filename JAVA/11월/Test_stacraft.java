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
		return "x��ǥ��: "+x+" y��ǥ��:"+y;
		}
	public String attackable()
		{
		if(max>=30){x=30;y=50;}
		
		else{
			x=20;y=30;}
		return "x��ǥ��: "+x+" y��ǥ��:"+y;
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
	return "x��ǥ��: "+x+" y��ǥ��:"+y;

};
public String attackable()
{
	if(x<=3||y<=4){x+=4;y+=3;}
	else x=0;y=0;
	return "x��ǥ��: "+x+" y��ǥ��:"+y;

}


}
class Test_stacraft
{
	public static void main(String ar[])
	{
	jerg j=new jerg(3,5,"������");
	talz t=new talz(100,300,"�����");
	System.out.println("������ ����"+j.color);
	System.out.println("������ ������ ����"+t.color);
	System.out.println("������ ��ġ:"+j.movable());
	System.out.println("������ ������ ��ġ:"+t.movable());
	System.out.println("���װ� ������ �� ��ġ:"+j.attackable());
	System.out.println("������ ���ʰ� ������ �� ������ ��ġ:"+t.attackable());
	}
}

