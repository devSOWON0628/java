//c언어 그문제
class homearray {

	public static void main(String[] args) {
		int a,b;
		int arr[][]={{78,48,78,98,0},{99,92,83,29,0},{29,64,83,89,0},{34,78,92,56,0},{0,0,0,0,0}};
		for (a=0;a<arr.length;a++){
			System.out.println("");
		  for (b=0;b<arr.length;b++ ){
			arr[a][4]+=arr[a][b];
			arr[4][b]+=arr[b][a];
			System.out.print(arr[a][b]+"    ");
			}
			
		}
		
		}
}

