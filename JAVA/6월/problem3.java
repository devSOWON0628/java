//100~999사이에 7의배수의 갯수와 합을 구하시오
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
		System.out.println("배수의 개수"+count+"합"+sum);
	}
}
