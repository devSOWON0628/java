class shape 
{
	int x,y,res;
	void setArea(int x, int y){
	}
	int getArea(){
		return x*y;
	}
}

class Circle extends shape
{
	void setArea(int r)
	{
	res=r*r;
	}
	int getArea(){
	return res;
	}

}

class Rect extends shape
{
void setArea(int x, int y){
	this.x=x;
	this.y=y;
	res=x*y;
	}

int getArea(){
return res;
	}
}

class Diamond extends shape
{
	void setArea(int x,int y){
	this.x=x;
	this.y=y;
	res=x*y;
	}

	int getArea(){
		return res;
	}
}

class extendTest3{
	public static void main(String ar[]){
	Circle c=new Circle();
	Rect r= new Rect();
	Diamond d= new Diamond();
	c.setArea(5);
	r.setArea(5,8);
	d.setArea(10,4);
	System.out.println("원의 넓이:"+(c.getArea()*3.14));
	System.out.println("직사각형의 넓이:"+r.getArea());
	System.out.println("마름모의 넓이:"+d.getArea());
	
	}

}
