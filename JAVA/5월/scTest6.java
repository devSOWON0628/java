import java.util.*;
class scTest6{
public static void main(String ar[]){
	Scanner sc = new Scanner(System.in);

	int i= sc.nextInt();
	int t=0;

	for (int a=0;a<=i ;a++ )
	{
		if (a%5==0)
		{
			t=t+a;
		}
		
	}
	System.out.println(t);
}
}