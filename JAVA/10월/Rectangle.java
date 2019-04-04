class Rectangle 
{


	private int x1,y1,x2,y2,toto, bx,sx, sy,by;

	public Rectangle(){}

	public Rectangle(int x1, int y1, int x2, int y2)
		{
	
			this.x1=x1;
			this.x2=x2;
			this.y1=y1;
			this.y2=y2;
		}

	public void set(int x1, int y1, int x2, int y2)
		{
			this.x1=x1;
			this.x2=x2;
			this.y1=y1;
			this.y2=y2;
	    }

	public int square()
	{
	if (x1>x2){bx=x1;sx=x2;}
	else {bx=x2;sx=x1;}

	if (y1>y2){by=y1;sy=y2;}
	else {by=y2;sy=y1;}

	bx=bx-sx;
	by=by-sy;
	toto = bx*by;
	

	return toto;
	
	
	
	}

	public void show()//��ǥ�� ���̵� ���簢�� ������ ȭ�� ���
	{

		System.out.println("��ǥ��("+x1+","+y1+") ("+x2+","+y2+")");
		System.out.println("���̴�:"+square()+"�Դϴ�");
	
	}

	public static void main(String[] args) 
	{
		Rectangle r= new Rectangle();
		Rectangle s= new Rectangle(1,1,2,3);

		r.show();
		System.out.println(r.square());
		r.set(-2,2,-1,4);
		r.show();
		s.show();
		System.out.println(s.square());
		if (r.equals(s))System.out.println("�� �簢���� �����ϴ�");
		
	}
}
