class Shape_1113 
{
	public void draw(){
	System.out.println("도형 그리기");
	
	}
	public void painting(){System.out.println("부모 색칠하기");}//나중에 만든거 여기도 넣어준단
}
class circle extends Shape_1113
{
	public void draw(){System.out.println("원 그리기");}
	public void painting(){System.out.println("색칠하기");}
}
class casting_Test
{
	public static void main(String ar[])
	{
		Shape_1113 s= new Shape_1113();
		s.draw();//도형그리기가 출력된다
		s.painting();//컴파일 에러가 난다.

		circle c1= new circle();
		c1.draw();//원 그리기 가 출력된다.
		c1.painting();//색칠하기 가출력된다.

		Shape_1113 s2=c1;//c1을 s2에 넣는다는 것 s2는 부모타입 c1은 자식타입이라 up casting
		s2.draw();//원그리기 출력된다.
		s2.painting();
	
	}
}
