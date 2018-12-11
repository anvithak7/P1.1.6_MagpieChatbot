import java.util.Scanner;

/**
 * A simple class to run the Ambrosia class.
 * @author Anvitha Kachinthaya and Janice Liu
 * @version December 2018
 */
public class AmbrosiaRunner
{

	/**
	 * Create a Ambrosia, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Ambrosia ambrosia = new Ambrosia();
		
		System.out.println (ambrosia.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (ambrosia.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
