class Phone
{
	String jejo, price, type;
	Phone(String jejo, String price, String type)
	{
		this.jejo=jejo;
		this.price=price;
		this.type=type;
	
	}
	void setJejo(String jejo){this.jejo=jejo;}
	String getJejo(){return jejo;}

	void setPrice(String price){this.price=price;}
	String getPrice(){return price;}

	void setType(String type){this.type=type;}
	String getType(){return type;}

	String tostring(){return "����ȸ��: "+jejo+" ����:"+price+" ���Ÿ��:"+type;}
}

class Smartphone extends Phone
{
	String OStype,Osver, memory, camera, bl; 
	void setOStype(String OStype){this.OStype=OStype;}
	String getOStype(){return OStype;}

	void setOsver(String Osver){this.Osver=Osver;}
	String getOsver(){return Osver;}

	void setMemory(String memory){this.memory=memory;}
	String getMemory(){return memory;}

	void setCamera(String camera){this.camera=camera;}
	String getCamera(){return camera;}

	void setBl(String bl){this.bl=bl;}
	String getBl(){return bl;}



	Smartphone(String OStype,String Osver, String memory, String camera, String bl,String jejo, String price, String type)
    {
		super(jejo, price, type);
		this.OStype=OStype;
		this.Osver=Osver;
		this.memory=memory;
		this.camera=camera;
		this.bl=bl;
		
	}

	String tostring(){return super.tostring()+" �ü�� Ÿ��:"+OStype+" �ü�� ����:"+Osver+" �޸�:"+memory+" ī�޶� ���ɿ���:"+camera+" ������� ���ɿ���:"+bl;}
}

class Phone_Test
{
	public static void main(String ar[])
	{
	Smartphone S = new Smartphone("������","10","32GB","ī�޶� ����","������� ����","�Ｚ","5����","2G");
	System.out.println(S.tostring());

	}
}