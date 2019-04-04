import java.util.*;
class scTest5{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("100이하의 두개의 정수");
int n1 = sc.nextInt();
int n2 = sc.nextInt();


int big, small;

if (n1<=100&&n2<=100)
{
	if (n1>=n2)
	{
		big= n1;
			small=n2;
	}
		else{
			big=n2;
			small=n1;
			}

for (int a = small ; a<=big ;a++ )
{
	System.out.println(a);
}
}


}
}