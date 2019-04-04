//4. 두개의 값을 입력받아 두 정수 사이의 3의 배수이거나 7의 배수인 수들의 합과 평균
class Paramtoast4 {
	public static void main(String ar[]) {
		int a=Integer.parseInt(ar[0]);
		int b=Integer.parseInt(ar[1]);
		int sum=0,big,small,i,count=0;
		
		if (a>b)
		{
			big=a;
			small=b;
		}
		else
		{
		    big=b;
		    small=a;
		}

		for (i=small;i<=big ;i++ )
		{
			if (i%3==0||i%7==0)
			{
				sum+=i;
				count++;
			}
		}

		System.out.println("합"+sum+"평균"+((float)(sum/count)));	
		}
}
