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

	String tostring(){return "제조회사: "+jejo+" 가격:"+price+" 통신타입:"+type;}
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

	String tostring(){return super.tostring()+" 운영체제 타입:"+OStype+" 운영체제 버젼:"+Osver+" 메모리:"+memory+" 카메라 가능여부:"+camera+" 블루투스 가능여부:"+bl;}
}

class Phone_Test
{
	public static void main(String ar[])
	{
	Smartphone S = new Smartphone("윈도우","10","32GB","카메라 있음","블루투스 가능","삼성","5만원","2G");
	System.out.println(S.tostring());

	}
}