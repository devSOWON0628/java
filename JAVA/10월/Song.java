class Song 
{
	private String title,album,artist;
	private String composer[]=new String[3];
	private int year,track;

	public Song(String t, String arti, String alb, String compo_1, String compo_2, String compo_3, int ye,int track)
		{
			this.title=t;
			this.artist=arti;
			this.album=alb;
			this.composer[0]=compo_1;
			this.composer[1]=compo_2;
			this.composer[2]=compo_3;
			this.year=ye;
			this.track=track;
		}

	public void show()
		{
			
			System.out.println(" Ÿ��Ʋ:"+title+" �ٹ�����:"+album+" ����:"+artist+" �۰:"+composer[0]+","+composer[1]+","+composer[2]+","+" ��ǥ�� ����:"+year+" Ʈ����ȣ:"+track);
		}

	public Song(){}
	public static void main(String[] args) 
	{
		Song s1=new Song("Dancing queen","ABBA","The album","composerkk","composerjj","composerss",2006,13);
		s1.show();
	}
}
