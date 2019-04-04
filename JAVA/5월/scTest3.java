import java.util.*;
class scTest3{
public static void main(String ar[]){
Scanner sc = new Scanner (System.in);

System.out.println("한국어 점수를 입력하세요.");
int kor = sc.nextInt();
System.out.println("영어 점수를 입력하세요.");
int eng = sc.nextInt();
System.out.println("수학 점수를 입력하세요.");
int mat = sc.nextInt();

int t;
float a;

t=kor+eng+mat;

a=t/3;
System.out.println("총점="+t);
System.out.println("평균="+a);
}
}



