import java.util.*;
class scTest3{
public static void main(String ar[]){
Scanner sc = new Scanner (System.in);

System.out.println("�ѱ��� ������ �Է��ϼ���.");
int kor = sc.nextInt();
System.out.println("���� ������ �Է��ϼ���.");
int eng = sc.nextInt();
System.out.println("���� ������ �Է��ϼ���.");
int mat = sc.nextInt();

int t;
float a;

t=kor+eng+mat;

a=t/3;
System.out.println("����="+t);
System.out.println("���="+a);
}
}



