//�Է� 5���޾Ƽ� ������������
import java.util.*;
class homearray2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int a,i,j,save=0;
		for (a=0;a<arr.length ;a++)
			{
			System.out.print("������ �Է����ּ���:");
			arr[a]=sc.nextInt();
			}

		for (i=0;i<arr.length ;i++ )//������ ��Ʈ��� ����ε� ���� �� �𸣰ڻ�
			{
			for (j=i+1;j<arr.length;j++ )
				{
				if (arr[i]>arr[j])
					{ 
					save=arr[i];
					arr[i]=arr[j];
					arr[j]=save;
					}
		        }
			
		   }

		for (i=0;i<arr.length ;i++ )
			{
			System.out.print(arr[i]+" ");
			}
		System.out.println("");
	}
}
