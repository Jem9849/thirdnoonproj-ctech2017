package noon.model;

public class PlayDohCircle
{
	//Declaration Section
	//Data Member Section
	
	private int size;
	
	public PlayDohCircle()
	{
		this.size = 5;
	}
	
	//public PlayDohCircle(int size)
	//{
		//this.size = size;
	//}
	
	public PlayDohCircle(int big)
	{
		this.size = big;
	}
	
	public void setSize(int newSize)
	{
		this.size = newSize;
	}
	
	public String toString()
	{
		String desc = "I am a circle, my size is " + size;
		return desc;
	}
}
