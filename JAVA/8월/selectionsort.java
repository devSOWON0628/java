//array�� ��5�� ��Ƽ� �Է¹����㿡 ��������
import java.util.*;
class selectionsort {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[5];
		int save;
		System.out.println("5���� ������ �Է��� �ּ���.");
		for (int i=0;i<arr.length;i++)arr[i]=sc.nextInt();

		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=i+1;j<arr.length ;j++ )
			{
				if (arr[i]>arr[j])
				{
					save=arr[i];
					arr[i]=arr[j];
					arr[j]=save;
				}
			}
		}
		System.out.println("���");
		for (int i=0;i<arr.length ;i++ )
		{
			System.out.println(arr[i]);
		}
		
	}
}
