//100~999���̿� 7�ǹ���� ������ ���� ���Ͻÿ�
class problem3 {
	public static void main(String[] args) 
	{
		int arr[]=new int[900];
		int count=0,sum=0,i=0;
		for (i=0;i<arr.length;i++)
		{
			arr[i]=i+100;
		}

		for (i=0;i<arr.length ;i++ )
		{
			if (arr[i]%7==0)
			{
				count++;
				sum+=arr[i];
			}
		}
		System.out.println("����� ����"+count+"��"+sum);
	}
}
