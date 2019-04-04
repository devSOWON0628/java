class ys 
{
	float res;
	public float Add(float a,float b){
	return a+b;
	}

	public float Sub(float a, float b){
	return a-b;
	}

	public float Mul(float a, float b){
	return a*b;
	}

	public float Div(float a,float b){
	return a/b;

	}
	public static void main(String[] args) 
	{
		ys y1=new ys();
		System.out.println(y1.Add(3,4));
		System.out.println(y1.Sub(7,3));
		System.out.println(y1.Mul(2,2));
		System.out.println(y1.Div(5,2));

	}
}
