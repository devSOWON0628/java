class car10 
{
	String carname;
	String color;
	int velocity;

	int speedup(int x){
		x=x+5;
		return x;
	}

	int speeddown(int y){
		y=y-5;
		return y;
	}
}

class truck extends car10{
	int ton;
	String truck;
	truck(int t, String tu,String cn,String color){
	this.ton=t;
	this.truck=tu;
	this.carname=cn;
	this.color=color;

	}
	
}

class extend_car10{
	public static void main(String ar[]){
	truck t= new truck(3,"Ʈ��","����Ƽ��","������");
	System.out.printf("���� %s�� %s�̴� %s�� %d���� ���� �� �ִ�.\n",t.truck,t.color,t.carname,t.ton);
	}
}

