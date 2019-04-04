//array로 방5개 잡아서 입력받은담에 오름차순
import java.util.*;
class selectionsort {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[5];
		int save;
		System.out.println("5개의 정수를 입력해 주세요.");
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
		System.out.println("결과");
		for (int i=0;i<arr.length ;i++ )
		{
			System.out.println(arr[i]);
		}
		
	}
}
