class person2 
{
	private String name;
	private int age;

	private String eat(String a)
		{
		
		return a;
		}

	public person2(String name,int age){
	this.name =name;
	this.age= age;
	}


	public person2(int age){
	this.age=age;
	}

	public person2(String name){
	this.name=name;
	
	}

	public person2(){}



	public static void main(String[] args) 
	{
		person2 p1=new person2("Mike",30);
		person2 p2=new person2("Alice",25);
		person2 p3=new person2(35);
		person2 p4=new person2("Tom");
		person2 p5=new person2();
		
		System.out.println("이름:"+p3.name+"나이:"+p3.age);
	}
}
