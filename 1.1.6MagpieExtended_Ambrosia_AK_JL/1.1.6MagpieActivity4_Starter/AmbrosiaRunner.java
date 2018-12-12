import java.util.Scanner;
import java.util.*; // Import everything including List and ArrayList

/**
 * A simple class to run Ambrosia.
 * @author Anvitha Kachinthaya and Janice Liu
 * @version December 2018
 */
public class AmbrosiaRunner //Creates a class to run Ambrosia.
{
    static boolean start = true;
    String userSureInput;
    /**
     * Create a Ambrosia, give it user input, and print its replies. Begins the logic of whether Ambrosia cooks or teaches.
     */
    public static void main(String[] args)
    {
        Ambrosia ambrosia = new Ambrosia(); //Creates an instance of Ambrosia.
        List<String> breakfastlist = new ArrayList<String>(); //Creates an editable list containing breakfast foods.
        List<String> lunchlist = new ArrayList<String>(); //Creates an editable list containing lunch foods.
        List<String> dinnerlist = new ArrayList<String>(); //Creates an editable list containing dinner foods.
        List<String> snacklist = new ArrayList<String>(); //Creates an editable list containing snack foods.
        List<String> dessertlist = new ArrayList<String>(); //Creates an editable list containing desserts.
        
        System.out.println (ambrosia.getGreeting()); //Begins the conversation with Ambrosia's traditional greeting.
        Scanner in = new Scanner (System.in); //Creates an instance for the user's response.
        String statement = in.nextLine(); //Creates a placeholder for the user's input on the next line.
        statement = statement.toLowerCase();
        if(statement.contains("teach")) {
            while (start == true) {
                System.out.println("What mealtime would you like to add an item to? We have a breakfast, lunch, dinner, snacks, and dessert menu! If you want to go back to cooking, type 'done.'");
                String userRecipeInput = in.nextLine();
                String d = "no";
                userRecipeInput = userRecipeInput.toLowerCase();
                
                 if (userRecipeInput.contains("breakfast")) {
                    while (d.contains("no")) {
                    ambrosia.addRecipeToList("breakfast", breakfastlist);
                    System.out.println("Are you done adding breakfast recipes? Type 'yes' or 'no'.");
                    d = in.nextLine().toLowerCase();
                }
                }
                
                 if (userRecipeInput.contains("lunch")) {
                    while (d.contains("no")) {
                    ambrosia.addRecipeToList("lunch", lunchlist);
                    System.out.println("Are you done adding lunch recipes? Type 'yes' or 'no'.");
                    d = in.nextLine().toLowerCase();
                }
                }
                
                if (userRecipeInput.contains("dinner")) {
                    while (d.contains("no")) {
                    ambrosia.addRecipeToList("dinner", dinnerlist);
                    System.out.println("Are you done adding dinner recipes? Type 'yes' or 'no'.");
                    d = in.nextLine().toLowerCase();
                }
                }
                
                if (userRecipeInput.contains("snack")) {
                    while (d.contains("no")) {
                    ambrosia.addRecipeToList("snacks", snacklist);
                    System.out.println("Are you done adding snack recipes? Type 'yes' or 'no'.");
                    d = in.nextLine().toLowerCase();
                }
                }
                
                if (userRecipeInput.contains("dessert")) {
                    while (d.contains("no")) {
                    ambrosia.addRecipeToList("dessert", dessertlist);
                    System.out.println("Are you done adding dessert recipes? Type 'yes' or 'no'.");
                    d = in.nextLine().toLowerCase();
                }
                }

                if (userRecipeInput.contains("done")) {
                   System.out.println("What are we cooking now?");
                   statement = in.nextLine();
                }
}
while (!statement.equals("Bye")) //Continues the conversation when the user has not yet said goodbye.
        {
            System.out.println (ambrosia.getResponse(statement)); 
            statement = in.nextLine();
}
}
}
}
