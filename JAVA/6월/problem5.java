//100~999���̿� 4�� ����� �ƴѰ͵��� ������ �������Ͻÿ�
class problem5 {
	public static void main(String[] args) {
		int arr[]=new int[900];
		int i,count=0,sum=0;
		for (i=0;i<arr.length ;i++)
		{
			arr[i]=100+i;
			if (arr[i]%4!=0)
			{
			 count++;
			 sum+=arr[i];
			}
		}
		System.out.println("����:"+count+" ��:"+sum);
	}
}
