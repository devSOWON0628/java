//15.두개의 정수를 입력받아 두 정수 사이(두정수를 포함)에 3의 배수이거나 5의 배수인 수들의 합과 평균을 출력하는 프로그램
class problem15 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int big,small,sum=0,count=0;
		if (a>b){
			big=a;
			small=b;}
		else{
		big=b;
		small=a;}

		for (int i=small;i<=big ;i++ )
		{
			if (i%3==0||i%5==0)
			{
				sum+=i;
				count++;
			}
		}
		System.out.println("합:"+sum+" 평균:"+(float)sum/count);
		}
}
