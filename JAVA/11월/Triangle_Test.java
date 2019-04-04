class Triangle 
{
	double line;
	double height;

	double area;

	Triangle(double line, double height){this.line=line; this.height=height;}
	
	double findArea()
	{
	area=(line*height)/2;
	return area;
	}
	
}

class Triangle_Test
{
	public static void main(String ar[])
	{
		Triangle T= new Triangle(10.0,5.0);
		System.out.println(T.findArea());
	
	
	}
}