import java.util.Scanner;
import java.util.*; // import everything including List and ArrayList

/**
 * A simple class to run the Ambrosia class.
 * @author Anvitha Kachinthaya and Janice Liu
 * @version December 2018
 */
public class AmbrosiaRunner //Creates a class to run Ambrosia.
{

	/**
	 * Create a Ambrosia, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Ambrosia ambrosia = new Ambrosia(); //Creates an instance of Ambrosia.
		List<String> breakfastlist = new ArrayList<String>(); //Creates an editable list containing breakfast foods.
		List<String> lunchlist = new ArrayList<String>(); //Creates an editable list containing lunch foods.
		List<String> dinnerlist = new ArrayList<String>(); //Creates an editable list containing dinner foods.
		List<String> snacklist = new ArrayList<String>(); //Creates an editable list containing snack foods.
		
		System.out.println (ambrosia.getGreeting()); //Begins the conversation with Ambrosia's traditional greeting.
		Scanner in = new Scanner (System.in); //Creates an instance for the user's response.
		String statement = in.nextLine(); //Creates a placeholder for the user's input on the next line.
		
		while (!statement.equals("Bye")) //Continues the conversation when the user has not yet said goodbye.
		{
			System.out.println (ambrosia.getResponse(statement)); 
			statement = in.nextLine();
		}
	}

}
