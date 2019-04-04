import java.util.*;//1부터 100까지의 정수중에서 4의 배수만 출력하되, 한 줄에 8개씩만
class scTest9{
public static void main(String ar[]){
	Scanner sc = new Scanner(System.in);
int C=0;
for (int a=4;a<=100;a++)
{
	if (a%4==0)
	{
		C+=1;
		if(C%8!=0){
			System.out.print(a+" ");
		}
		else
			System.out.println(a+" ");
	}
	
}
}
}