//14.10개의 정수를 입력받아 입력받은 수들중 짝수의 개수와 홀수의 개수를 각각 구하여 출력하는 프로그램을 작성하시오
class problem14 {
	public static void main(String ar[]) {
		int jjak=0,hol=0;
		int a[]=new int[10];
		System.out.println("10개의 정수를 입력");
		for (int i=0;i<a.length ;i++ )
		{
			a[i]=Integer.parseInt(ar[i]);
			if (a[i]%2==0)jjak++;
			else hol++;
		} 
		System.out.println("짝수의 개수:"+jjak+" 홀수의 개수:"+hol);
		
	}
}
