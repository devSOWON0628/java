class Student9
{
	String name;
	String number;
	int phone;
	int add;
	int major;//�а�
	public void study(){
	System.out.println("�����ϴ�");
	}
	public void eat(){
	System.out.println("�Դ�");
	}
	public void test(){
	System.out.println("����ġ��");
	}
	public void act(){
	System.out.println("Ȱ���ϴ�");
	}
}
class Leader extends Student9{

	public void hello(){
	System.out.println("�λ��ϴ�");
	}
}

class extendTest{
	public static void main(String ar[]){
	Leader l=new Leader();
	
	
	}

}
