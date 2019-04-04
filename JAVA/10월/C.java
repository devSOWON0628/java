class A 
{
	public A(){
		System.out.println("생성자A");
	}

	A(int x){
		System.out.println("매개변수 생성자A");
	}
}
	class B extends A{
		B(){
			System.out.println("생성자B");
		}
		public B(int x){
			super(x);
			System.out.println("매개변수 생성자B");
		}
	}

	class C{
	public static void main(String[] args) 
	{
		B b=new B(5);
	}
	}
	

