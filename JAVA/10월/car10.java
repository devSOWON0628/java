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
	this.carname=c;
	this.color=color;

	}
	
}

class extend_car10{
	car10 c= new car(3,"트럭","프론티어","검정색");
}

