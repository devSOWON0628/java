//1~100더할때 100이 넘는 숫자 구하기
class DD3 {
	public static void main(String[] args) {
		int sum=0;
	for (int i=1;i<=100 ;i++ ){
		sum+=i;
		if(sum>=100){
			System.out.println(i);
			break;
		}
		}
	
	}
}
