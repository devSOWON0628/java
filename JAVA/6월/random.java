//업다운게임 기회열번 
import java.util.*;
class random{
public static void main(String ar[]){
Random r=new Random();
Scanner sc=new Scanner(System.in);
String answer="";
do{
int no=r.nextInt(100);}
System.out.println("1부터 100까지의 정수를 입력해주세요 기회는 10번");
for(int count=1;count<=10;count++){
	int i=sc.nextInt();
 if(i==no){
	System.out.println("정답입니다");
	
	break;
	      }
 else{
	if(i<no){
	System.out.println("up");
	        }
	else{
		System.out.println("down");
		}
     }
	 if (count==10)
	     {
		 System.out.println("game over");
	     }
}
System.out.println("다시하시겠습니까? y/n");
answer=sc.next();
}while(answer.equals("y"));
System.out.println("게임이 끝났습니다");


}
}