//5���� �̸�, �й�, ���������� ����, ��� ,����<<�����Ǽ�Ʈ�δٰ�
import java.util.*;
class homearray4{
public static void main(String ar[]){
Scanner sc=new Scanner(System.in);
int arr[][]=new int[5][5];
int i,j,save;
int scsc[]={1,2,3,4,5};
String name[]=new String[5];
float ave[]=new float[5];

///////////////////////////////////////////////////////////////////

System.out.println("5���� �̸�, �й�, ����������, ����, ��� ������ ���ϴ� ���α׷�!!");
for (i=0;i<arr.length ;i++ ){
	System.out.println("�̸��� �Է����ּ���.");
    name[i]=sc.next();
	System.out.println("�й�, ��������, ��������, ���������� �Է����ּ���.1");
	for (j=0;j<4;j++ ){
		arr[i][j]=sc.nextInt();}}

//////////////////////////////////////////////////////////

for (i=0;i<arr.length ;i++ ){//���
	for (j=1;j<4;j++ ){
		arr[i][4]+=arr[i][j];}
		ave[i]=(float)arr[i][4]/3;}

////////////////////////////////////////////////////////

		for (i=0;i<arr.length ;i++ )//����
		{
		 for (j=i+1;j<arr.length ;j++ )
		 {
			 if (arr[i][4]<arr[j][4])
			 {
				save=scsc[j];
				scsc[j]=scsc[i];
				scsc[i]=save;
			 }
		 }
		}
//////////////////////////////////////////////////////


	for (i=0;i<arr.length ;i++ ){//���
		System.out.println("�̸�  �й� �������� �������� ��������   ����   ���     ����");
		System.out.println("");
				System.out.print(name[i]+"\t");
		for (j=0;j<arr[i].length ;j++ ){
		System.out.print(arr[i][j]+"\t");}
		System.out.print(ave[i]+"\t"+"\t");
		System.out.print(scsc[i]);
		System.out.println("");
		}
}
}
