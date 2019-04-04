//2.임의의 점수 입력받아 60점 이상이면 합격, 아니면 불합격 출력
import java.util.*;
class scTest2 {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
    if(num>=60){
	    System.out.println("합격");
	           }
	    else{
		    System.out.println("불합격");
	        }
	}
}
