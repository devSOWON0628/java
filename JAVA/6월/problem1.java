//정수 5개를 입력받아서 짝수: 홀수:별 합계출력
class  problem1{
	public static void main(String ar[]) {
		int arr[]=new int[5];
		int jjak=0,hol=0;
		for (int i=0;i<arr.length ;i++ )
		{
			arr[i]=Integer.parseInt(ar[i]);
			if (arr[i]%2==0)
			{
				jjak+=arr[i];
			}
			else{
			hol+=arr[i];}
		}
		System.out.println("짝수의 합"+jjak+"홀수의 합:"+hol);
		
	}
}
