import java.util.*;
abstract class ShapeExam
{
	abstract double getArea(double d);
	abstract double getCircum(double dg);

} 

class ShapeExam_child extends ShapeExam 
{
	double getArea(double d){return d*d*3.14;}
	double getCircum(double dg){return dg*3.14;}
}
class child_test
{
	public static void main(String ar[])
	{
		double jiji;
		Scanner sc=new Scanner(System.in);
		ShapeExam_child S= new ShapeExam_child();
		
		System.out.print("������ �����ֵ���:");
		jiji=sc.nextDouble();
		System.out.println("����: "+S.getArea(jiji));
		System.out.println("�ѷ�: "+S.getCircum(jiji));
	}
}