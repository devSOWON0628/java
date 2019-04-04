//16.한개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력하는 
class problem16{
	public static void main(String[] args){
		int a=Integer.parseInt(args[0]);
		for (int i=1;i<=10 ;i++){
			System.out.println(a*i);}
		}
}
