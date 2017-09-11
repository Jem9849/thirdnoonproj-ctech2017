package noon.model;

public class PlayDohKiddo
{
	private int annoy;
	private int size;
	private int age;
	
	public PlayDohKiddo()
	{
		this.annoy = 5;
		this.size = 3;
		this.age = 6;
	}
	
	public PlayDohKiddo(int size, int age, int annoy)
	{
		this.size = size;
		this.age = age;
		this.annoy = annoy;
	}
	
	public String toString()
	{
		String desc = "I am a kid, my size is " + size + "ft, my age is " + age + "," + " and on a scale of 1 to 10 in annoyingness, I am " + annoy + ".";
		return desc;
	}
	
	
}
