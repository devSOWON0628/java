class personn8
{
	private String name,addr,tel;

	personn8(String name, String addr, String tel){
	this.name=name;
	this.addr=addr;
	this.tel=tel;
	}
	
	void setName(String name){this.name=name;}
	String getName(){return name;}

	void setAddr(String addr){this.addr=addr;}
	String getAddr(){return addr;}

	void setTel(String tel){this.tel=tel;}
	String getTel(){return tel;}

	public String toString()
		{
		return "�̸�:"+name+" �ּ�:"+addr+" ��ȭ��ȣ:"+tel;
	
		}
}
class Customer extends personn8
{
	String number;//����ȣ
	int mileage;//���ϸ���
	

	Customer(String name, String addr,String tel, String number, int mileage)
	{
	super(name, addr, tel);
	this.number=number;
	this.mileage=mileage;
	}
	public String toString()
		{
		return super.toString()+" ����ȣ:"+number+" ���ϸ���:"+mileage;
	
		}
}

class super_Test
{
	public static void main(String ar[])
	{
		Customer C= new Customer("Tom","���Ǳ�","181-412","011",100);
		System.out.println(C.toString());
	}
}
