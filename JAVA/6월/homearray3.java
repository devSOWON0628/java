//5���� �̸�, �й�, ���������� ����, ��� ,����<<�����Ǽ�Ʈ�δٰ�
import java.util.*;
class homearray3{
public static void main(String ar[]){
Scanner sc=new Scanner(System.in);
int arr[][]=new int[5][6];
int i,j,save;
String name[]=new String[5];
float ave[]=new float[5];

///////////////////////////////////////////////////////////////////

System.out.println("5���� �̸�, �й�, ����������, ����, ��� ������ ���ϴ� ���α׷�!!");
for (i=0;i<arr.length ;i++ ){
	System.out.println("�̸�, �й�, ��������, ��������, ���������� �Է����ּ���.");
	 name[i]=sc.next();
	for (j=0;j<4;j++ ){
		arr[i][5]=1;
		arr[i][j]=sc.nextInt();}}

//////////////////////////////////////////////////////////

for (i=0;i<arr.length ;i++ ){//���
	for (j=1;j<4;j++ ){
		arr[i][4]+=arr[i][j];}
		ave[i]=(float)arr[i][4]/3;}

////////////////////////////////////////////////////////

		for (i=0;i<arr.length ;i++ )//����
		{
		 for (j=0;j<arr.length ;j++ )
		 {
			 if (arr[i][4]<arr[j][4])
			 {
				arr[i][5]++;
			 }
		 }
		}

//////////////////////////////////////////////////////


System.out.println("");
	for (i=0;i<arr.length ;i++ ){//���
		System.out.println("�̸�  �й� �������� �������� ��������   ����   ���     ����");
		System.out.println("");
				System.out.print(name[i]+"\t");
		for (j=0;j<arr[i].length-1 ;j++ ){
		System.out.print(arr[i][j]+"\t");}
		System.out.print(ave[i]+"\t"+"\t");
		System.out.print(arr[i][5]);
		System.out.println("");
		}
}
}
