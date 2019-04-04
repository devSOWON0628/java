interface Sound
{
	abstract void soundUP(int level);
	abstract void sounddown(int level);
}

class TV implements Sound
{
	private int Sndlevel=50;
	public void soundUP(int level){Sndlevel=Sndlevel+level; if(Sndlevel<=0)Sndlevel=0; System.out.println(Sndlevel);}
	public void sounddown(int level){Sndlevel=Sndlevel-level; if(Sndlevel<=0)Sndlevel=0; System.out.println(Sndlevel);}
}

class Radio implements Sound
{
	private int Sndlevel=50;
	public void soundUP(int level)
		{
		Sndlevel=level+10; 
		if(Sndlevel<=0)Sndlevel=0; 
		System.out.println(Sndlevel);
		}

	public void sounddown(int level)
		{
		Sndlevel=level-10; 
		if(Sndlevel<=0)Sndlevel=0; 
		System.out.println(Sndlevel);
		}

}
class Sound_test
{
	public static void main(String args[]){
		Sound radio= new Radio();
		Sound tv=new TV();
		radio.soundUP(5);
		tv.soundUP(5);
	
	}
}