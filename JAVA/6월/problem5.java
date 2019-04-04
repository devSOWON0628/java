//100~999사이에 4의 배수가 아닌것들의 갯수와 합을구하시오
class problem5 {
	public static void main(String[] args) {
		int arr[]=new int[900];
		int i,count=0,sum=0;
		for (i=0;i<arr.length ;i++)
		{
			arr[i]=100+i;
			if (arr[i]%4!=0)
			{
			 count++;
			 sum+=arr[i];
			}
		}
		System.out.println("갯수:"+count+" 합:"+sum);
	}
}
