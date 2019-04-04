//명령형 배개변수를 사용해서 100이하의 두개의 정수를 입력받아 작은 수부터 큰 수까지 차례대로 출력
class problem11 {
	public static void main(String[] args) {
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	if (a<b){for (;a<=b ;a++ ){
		System.out.println(a);}
			}
	else{for (;b<=a ;b++){
		System.out.println(b);}
		}
		}
}
