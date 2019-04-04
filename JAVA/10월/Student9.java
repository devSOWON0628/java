class Student9
{
	String name;
	String number;
	int phone;
	int add;
	int major;//학과
	public void study(){
	System.out.println("공부하다");
	}
	public void eat(){
	System.out.println("먹다");
	}
	public void test(){
	System.out.println("시험치다");
	}
	public void act(){
	System.out.println("활동하다");
	}
}
class Leader extends Student9{

	public void hello(){
	System.out.println("인사하다");
	}
}

class extendTest{
	public static void main(String ar[]){
	Leader l=new Leader();
	
	
	}

}
