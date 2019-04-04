import java.util.*;
abstract class DObject{
	abstract public void draw();

}

class Figure extends DObject{
	String type;//1.circle 2.line 3.rect 받아야한다

	public void draw(){
	switch(type){
	case "circle": System.out.println("circle");break;
	case "line": System.out.println("line"); break;
	case "rect": System.out.println("rect");break;
	case " ":System.out.println("삭제된 도형입니다");break;
	default : System.out.println("잘못입력되었습니다");break;
		}
	}
}


class menu{
	Scanner sc=new Scanner(System.in);
	Figure f[]=new Figure[10];
	int number;

	menu(){
		for(int i=0;i<f.length;i++){
			f[i]=new Figure();
		}
	}

	public void Exit(){
		System.exit(0);
		}
	
	public void Insert(int i){
		System.out.println("도형종류 Line(1), Rect(2), Circle(3)");//출력하고 입력받는것!!!
		number=sc.nextInt();
		switch(number){
			case 1 : f[i].type="line"; break;
			case 2 : f[i].type="rect"; break;
			case 3 : f[i].type="circle"; break;
			default : System.out.println("잘못입력되었습니다"); break;
			}
	}

	public void Delete(){
		System.out.println("삭제할 도형은 몇번째 도형?");
		int de=sc.nextInt();
		f[de-1].type=" ";
	
	}

	public void View(int count){
		for(int i=0;i<count;i++){
		f[i].draw();
		}
	
	}
}

class Test_33{
	public static void main(String ar[]){
		int count=0;
		menu m=new menu();
		Scanner sc=new Scanner(System.in);

		while(true){
		System.out.println("삽입[1], 삭제[2], 모두보기[3], 종료[4]");	
		int choice=sc.nextInt();
		switch(choice){
			case 1 : 
					m.Insert(count);
					count++; 
					break;
			case 2:
					m.Delete();
					break;
		
			case 3: 
					m.View(count);
					break;

			case 4:
					m.Exit();

		}			

			}
	
	
	}
}