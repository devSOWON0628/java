import java.util.*;
class Student
{

 private String name, address, call,skill;
 private int age;

 void setName(String name){this.name=name;}
 String getName(){return name;}

 void setCall(String call){this.call=call;}
 String getCall(){return call;}

 void setAddress(String address){this.address=address;}
 String getAddress(){return address;}

 void setSkill(String skill){this.skill=skill;}
 String getSkill(){return skill;}

 void setAge(int age){this.age=age;}
 int getAge(){return age;}
 
 void print()
 {
 
 }

}
class gyungsoo
{

}

class Student3_Test
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==================================================");
		System.out.print("입력인원:");
		int num=sc.nextInt();
		System.out.println("==학생정보입력==");
		Student s[]=new Student[num];
		for (int i=1;i<=num ;i++ )
		{
		s[i]=new Student();
		System.out.print("이름:>>");
		s[i].setName(sc.next());
		System.out.print("나이:>>");
		s[i].setAge(sc.nextInt());
		System.out.print("전화번호:>>");
		s[i].setCall(sc.next());
		System.out.print("주특기:>>");
		s[i].setSkill(sc.next());
		System.out.print("주소:>>");
		s[i].setAddress(sc.next());
		}
		

		
		
	
	}
}
