class Food 
{
 int cal, price, kg;
 Food(int cal, int price, int kg){this.cal=cal;this.price=price;this.kg=kg;}

public String toString(){return " Į�θ�:"+cal+" ����:"+price+" ����:"+kg;} 


void setCal(int cal){this.cal=cal;}
int getCal(){return cal;}
void setPrice(int price){this.price=price;}
int getPrice(){return price;}
void setKg(int kg){this.kg=kg;}
int getKg(){return kg;}
}
class melon extends Food
{
	String kj,info;
	void setKj(String kj){this.kj=kj;}
	String getKj(){return kj;}

	void setInfo(String info){this.info=info;}
	String getInfo(){return info;}

	melon(String kj, String info, int cal, int price, int kg)
	{
	super(cal, price, kg);
	this.kj=kj;
	this.info=info;
	}

	public String toString () {return super.toString()+" ����:"+kj+" �������:"+info;} 
}

class Food_Test
{
	public static void main(String ar[])
	{
	melon m= new melon("A���۹��","�ҿ��̳׳��",50,1000,10);
	System.out.println(m.toString());

	}
}
