package noon.controller;

/**
 * 
 * @author jsay6657
 *
 */

public class NoonRunner 
{
	public static void main(String [] args)
	{
		// NoonController and app together form a declaration. The equal sign is the assignment operator. (/moves right to left./)
		NoonController app = new NoonController();
		app.start();
	}
}
